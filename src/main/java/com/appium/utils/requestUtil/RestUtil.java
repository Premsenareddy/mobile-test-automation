package com.appium.utils.requestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class RestUtil {

    static String CONTENT_TYPE_APPLICATION_JSON = "application/json";

    public Response postRequest(String endPoint, HashMap<String, String> headers, String body) {
        return given()
                .log().all()
                .headers(headers)
                .body(body)
                .when()
                .post(endPoint);
    }

    public Response patchRequest(String endPoint, HashMap<String, String> headers, String body) {
        return given()
                .log().all()
                .headers(headers)
                .body(body)
                .when()
                .patch(endPoint);
    }

    public Response getRequest(String endPoint, HashMap<String, String> params, HashMap<String, String> headers) {
        return given()
                .log().all()
                .params(params)
                .headers(headers)
                .when()
                .get(endPoint);
    }

    public int getStatusCode(Response response) {
        return response.statusCode();
    }

    //============================================================================================================

    public Response sendGetRequest(String url, Map<String, String> headerParameters,
                                   Map<String, String> queryParameters, Map<String, String> pathParameters) {
        // Create RequestSpecification
        RequestSpecification requestSpecification = RestAssured.given().baseUri(url);

        // Build Query parameters into RequestSpecification
        if (queryParameters != null) {
            requestSpecification.queryParams(queryParameters);
        }

        // Build Path parameters into RequestSpecification
        if (pathParameters != null) {
            requestSpecification.pathParams(pathParameters);
        }

        // Build Header parameters into RequestSpecification
        if (headerParameters != null) {
            for (Map.Entry<String, String> headerParameter : headerParameters.entrySet()) {
                requestSpecification.header(headerParameter.getKey(), headerParameter.getValue());
            }
        }

        // Send Get Request
        Response response = requestSpecification.log().all().request(Method.GET, url);
        System.out.println("Response Code: " + response.statusCode() + "\n" + response.asString());
        return response;
    }

    public Response sendPostRequest(String url, JSONObject requestBody, Map<String, String> headerParameters,
                                    Map<String, String> queryParameters) {
        // Create RequestSpecification
        RequestSpecification requestSpecification;

        if (requestBody == null) {
            requestSpecification = RestAssured.given();
        } else {
            requestSpecification = RestAssured.given().body(requestBody.toString()).with()
                    .contentType(CONTENT_TYPE_APPLICATION_JSON);
        }

        // Build Query parameters
        if (queryParameters != null) {
            requestSpecification.queryParams(queryParameters);
        }

        // Build Header parameters into RequestSpecification
        if (headerParameters != null) {
            for (Map.Entry<String, String> headerParameter : headerParameters.entrySet()) {
                requestSpecification.header(headerParameter.getKey(), headerParameter.getValue());
            }
        }

        // Send Post Request
        Response response = requestSpecification.when().log().all().post(url);
        System.out.println("Response Code: " + response.statusCode() + "\n" + response.asString());
        return response;
    }

    public Response sendPutRequest(String url, JSONObject requestBody, Map<String, String> headerParameters,
                                   Map<String, String> queryParameters) {
        // Create RequestSpecification
        RequestSpecification requestSpecification;

        if (requestBody == null) {
            requestSpecification = RestAssured.given();
        } else {
            requestSpecification = RestAssured.given().body(requestBody.toString()).with()
                    .contentType(CONTENT_TYPE_APPLICATION_JSON);
        }

        // Build Query parameters
        if (queryParameters != null) {
            requestSpecification.queryParams(queryParameters);
        }

        // Build Header parameters into RequestSpecification
        if (headerParameters != null) {
            for (Map.Entry<String, String> headerParameter : headerParameters.entrySet()) {
                requestSpecification.header(headerParameter.getKey(), headerParameter.getValue());
            }
        }

        // Send Post Request
        Response response = requestSpecification.when().log().all().put(url);
        System.out.println("Response Code: " + response.statusCode() + "\n" + response.asString());
        return response;
    }

    public void assertThatStatusCodeIsOK(Response response) {
        assertThatStatusCodeEquals(response, 200);
    }

    public void assertThatStatusCodeEquals(Response response, int expectedStatusCode) {
        assertThatResponseIsNotNull(response);
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode,
                "The Status code of the Response is different than expected. \n\nResponse body:\n"
                        + response.asPrettyString() + "\nStatus code:");
    }

    public void assertThatResponseIsNotNull(Response response) {
        Assert.assertNotNull(response, "The Response object is null");
    }

    public Object getNodeResponseValue(Response response, String parameterPath) {
        String value = "null";

        if ((response.getBody().jsonPath().get(parameterPath)) != null)
            value = (response.getBody().jsonPath().get(parameterPath)).toString();

        return value;
    }

    public ArrayList getArrListResponseValue(JSONArray responseArr, String parameterPath) {
        ArrayList arrList = new ArrayList();
        for (int k = 0; k < responseArr.length(); k++) {
            try {
                arrList.add(responseArr.getJSONObject(k).get(parameterPath));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrList;
    }

    public void assertThatResponseParameterNotNull(Response response, String parameterPath) {
        Assert.assertNotNull(response.getBody());
        Assert.assertNotNull(getNodeResponseValue(response, parameterPath));
    }

    public void assertThatResponseParameterEquals(Response response, String parameterPath,
                                                  Object expectedParameterValue) {
        Assert.assertEquals(getNodeResponseValue(response, parameterPath), expectedParameterValue,
                String.format("The value of '%s' parameter is different than expected", parameterPath));
    }

    public void validateSchema(Response response, String schemaPath) {
        response.then().assertThat().body(matchesJsonSchemaInClasspath(schemaPath));
    }

    public void assertThatKeyValueEquals(String key, String expectedValue, String actualValue, String message) {
        Assert.assertEquals(actualValue, expectedValue, message + " -- Key: " + key + " | ");
    }

    public void assertThatValueEquals(String expectedValue, String actualValue, String message) {
        Assert.assertEquals(actualValue, expectedValue, message + " | ");
    }

    public void assertThatValueNotEquals(String unexpectedValue, String actualValue, String message) {
        Assert.assertNotEquals(actualValue, unexpectedValue, message + " | ");
    }

    public Response sendGetDeleteRequest(String url, Map<String, String> headerParameters,
                                         Map<String, String> queryParameters, Map<String, String> pathParameters) {
        // Create RequestSpecification
        RequestSpecification requestSpecification = RestAssured.given().baseUri(url);

        // requestSpecification = setHeader(requestSpecification, apiUrl);

        // Build Query parameters into RequestSpecification
        if (queryParameters != null) {
            requestSpecification.queryParams(queryParameters);
        }

        // Build Path parameters into RequestSpecification
        if (pathParameters != null) {
            requestSpecification.pathParams(pathParameters);
        }

        // Build Header parameters into RequestSpecification
        if (headerParameters != null) {
            for (Map.Entry<String, String> headerParameter : headerParameters.entrySet()) {
                requestSpecification.header(headerParameter.getKey(), headerParameter.getValue());
            }
        }

        // Send Delete Request
        Response response = requestSpecification.log().all().request(Method.DELETE, url);
        System.out.println("Response Code: " + response.statusCode() + "\n" + response.asString());
        return response;

    }

}
