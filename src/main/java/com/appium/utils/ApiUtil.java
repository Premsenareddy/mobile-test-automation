package com.appium.utils;

import com.appium.utils.requestUtil.RestUtil;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class ApiUtil {

    RestUtil restUtil = new RestUtil();

    //Retrieve OTP
    public String retrieveOTP(String accessToken, String userId,
                              int expectedStatusCode) {

        String url = PropertyUtil.getValue("retrieveOTP");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        Response response = restUtil.sendGetRequest(url + userId, header, null, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

        return (String) restUtil.getNodeResponseValue(response, "Password");

    }

    //Update EID Records
    public void updateEidRecords(String applicantId, String eid, String firstName,
                                 String lastName, String gender, String nationality, String dob, String expiryDate, int expectedStatusCode) {

        String url = PropertyUtil.getValue("updateIDNow");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        JSONObject body = null;
        try {
            body = new JSONObject("{\"identificationProcess\": {\"result\": \"SUCCESS\",\"companyId\": \"alhilalbankcittestauto\",\"fileName\": \"1ba9c55a-ba00-3f49-a390-9d28287794de.zip\",\"identificationTime\":\"2021-03-22T06:07:43+01:00\",\"id\": \"" + applicantId + "\",\"href\": \"/api/v1/alhilalbankcittestauto/identifications/1ba9c55a-ba00-3f49-a390-9d28287794de.zip\",\"type\": \"WEB\",\"transactionNumber\": \"1ba9c55a-ba00-3f49-a390-9d28287123de\"},\"customData\": {\"custom3\": null,\"custom4\": null,\"custom1\": null,\"custom2\": null,\"custom5\": null},\"contactData\": {\"mobilePhone\": null,\"email\": \"benz@aden.com\"},\"userData\": {\"birthday\": {\"status\": \"NEW\",\"value\": \"" + dob + "\"},\"firstName\": {\"status\": \"CHANGE\",\"value\": \"" + firstName + "\",\"original\": \"TECH USER\"},\"address\": {},\"personalNumber\": {\"status\": \"NEW\",\"value\": \"" + eid + "\"},\"nationality\": {\"status\": \"NEW\",\"value\": \"" + nationality + "\"},\"gender\": {\"status\": \"NEW\",\"value\": \"" + gender + "\"},\"lastName\": {\"status\": \"NEW\",\"value\": \"" + lastName + "\"}},\"identificationDocument\": {\"country\": {\"status\": \"NEW\",\"value\": \"AE\"},\"number\": {\"status\": \"NEW\",\"value\": \"090379793\"},\"type\": {\"status\": \"NEW\",\"value\": \"IDCARD\"},\"validUntil\": {\"status\": \"NEW\",\"value\": \"" + expiryDate + "\"}},\"attachments\": {\"pdf\": \"1ba9c55a-ba00-3f49-a390-9d28287794de.pdf\",\"xml\": \"1ba9c55a-ba00-3f49-a390-9d28287794de.xml\",\"idBackSide\": \"1ba9c55a-ba00-3f49-a390-9d28287794de_original_idbackside.jpg\",\"livenessscreenshot1\": \"1ba9c55a-ba00-3f49-a390-9d28287794de_liveness_left.jpg\",\"idFrontSide\": \"1ba9c55a-ba00-3f49-a390-9d28287794de_original_idfrontside.jpg\",\"livenessscreenshot2\": \"1ba9c55a-ba00-3f49-a390-9d28287794de_liveness_right.jpg\",\"userFace\": \"1ba9c55a-ba00-3f49-a390-9d28287794de_userface.jpg\"}}");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Response response = restUtil.sendPostRequest(url, body, header, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

    }

    //Update Passport Records
    public void updatePassportRecords(String applicantId, String passportNumber, String firstName,
                                      String lastName, String fullName, String gender, String nationality, String dob, String expiryDate, int expectedStatusCode) {

        String url = PropertyUtil.getValue("updateIDNow");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        JSONObject body = null;
        try {
            body = new JSONObject("{\"IdentificationProcess\": {\"Result\": \"SUCCESS_DATA_CHANGED\",\"CompanyId\": \"alhilalpptest\",\"FileName\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777.zip\",\"AgentName\": null,\"IdentificationTime\": \"2021-10-26T15:21:31+02:00\",\"Id\": \"" + applicantId + "\",\"Href\": \"/api/v1/alhilalpptest/identifications/dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777.zip\",\"Type\": \"APP\",\"TransactionNumber\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b\",\"Reason\": null},\"CustomData\": {\"Custom4\": null,\"Custom3\": null,\"Custom2\": null,\"Custom1\": null,\"Custom5\": null,\"transactionNumber\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777\"},\"ContactData\": {\"MobilePhone\": null,\"Email\": \"benz@aden.com\"},\"UserData\": {\"PersonalNumber\": null,\"Address\": {\"Status\": null,\"Value\": null},\"FirstName\": {\"Status\": \"CHANGE\",\"Value\": \"" + firstName + "\"},\"FullName\": {\"Status\": \"NEW\",\"Value\": \"" + fullName + "\"},\"Birthday\": {\"Status\": \"NEW\",\"Value\": \"" + dob + "\"},\"LastName\": {\"Status\": \"NEW\",\"Value\": \"" + lastName + "\"},\"Gender\": {\"Status\": \"NEW\",\"Value\": \"" + gender + "\"},\"Nationality\": {\"Status\": \"NEW\",\"Value\": \"" + nationality + "\"}},\"IdentificationDocument\": {\"Type\": {\"Status\": \"NEW\",\"Value\": \"PASSPORT\"},\"Country\": {\"Status\": \"NEW\",\"Value\": \"IN\"},\"ValidUntil\": {\"Status\": \"NEW\",\"Value\": \"" + expiryDate + "\"},\"Number\": {\"Status\": \"NEW\",\"Value\": \"" + passportNumber + "\"},\"IssuedBy\": null,\"DateIssued\": {\"Status\": \"NEW\",\"Value\": \"2018-01-23\"}},\"Attachments\": {\"Pdf\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777.pdf\",\"IdFrontSide\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777_original_idfrontside.jpg\",\"IdBackSide\": null,\"IdHolograms\": null,\"UserFace\": null,\"VideoLog\": null,\"Xml\": \"dc47e427-e381-3d94-ae46-8664cb0b2d0b---25777.xml\",\"LivenessScreenshot1\": null,\"LivenessScreenshot2\": null}}");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        Response response = restUtil.sendPostRequest(url, body, header, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

    }
    
    //Get email token for email verification
    public HashMap<String, String> getEmailToken(String email, int expectedStatusCode) {

        String url = PropertyUtil.getValue("getEmailToken");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        Response response = restUtil.sendGetRequest(url + "email=" + email, header, null, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

        HashMap<String, String> response_body = new HashMap<>();

        response_body.put("email", (String) restUtil.getNodeResponseValue(response, "Email"));
        response_body.put("token", (String) restUtil.getNodeResponseValue(response, "Token"));

        return response_body;

    }

    //Verify customer email
    public HashMap<String, String> verifyEmail(String email, String token, int expectedStatusCode) {

        String url = PropertyUtil.getValue("verifyEmail");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        Response response = restUtil.sendGetRequest(url + "email=" + email + "&token=" + token, header, null, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

        HashMap<String, String> response_body = new HashMap<>();

        response_body.put("response", response.asString());
//        response_body.put("email", (String) restUtil.getNodeResponseValue(response, "email"));
//        response_body.put("status", (String) restUtil.getNodeResponseValue(response, "status"));

        System.out.println(response_body);
        return response_body;

    }

    //Get customer id using mobile number
    public String retrieveCustomerId(String mobile, int expectedStatusCode) {

        String url = PropertyUtil.getValue("retrieveCustomerId");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key_alpha-customer-adapter"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        Response response = restUtil.sendGetRequest(url + mobile, header, null, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

        return (String) restUtil.getNodeResponseValue(response, "Data[0].CustomerId");

    }
    
    //Get applicant id on the basis of customer id 
    public HashMap<String, String>  retrieveApplicantId(String customerId,String documentType, int expectedStatusCode) {

    	String url = PropertyUtil.getValue("getApplicantId");

        HashMap<String, String> header = new HashMap<>();
        header.put("x-api-key", PropertyUtil.getValue("x-api-key_alpha-idnow-idv-adapter"));
        header.put("Accept-Language", "en-US");
        header.put("X-Request-Id", "AhbTest-UiAutomation");

        Response response = restUtil.sendGetRequest(url + customerId + "?documentType=" + documentType, header, null, null);
        restUtil.assertThatStatusCodeEquals(response, expectedStatusCode);

        HashMap<String, String> response_body = new HashMap<>();

        response_body.put("response", response.asString());
        response_body.put("applicantId", (String) restUtil.getNodeResponseValue(response, "applicantId"));
        response_body.put("responsibleId", (String) restUtil.getNodeResponseValue(response, "responsibleId"));
        response_body.put("status", (String) restUtil.getNodeResponseValue(response, "status"));

        System.out.println(response_body);
        return response_body;
    }


}
