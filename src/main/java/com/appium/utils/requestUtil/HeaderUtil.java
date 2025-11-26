package com.appium.utils.requestUtil;

import io.cucumber.datatable.DataTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HeaderUtil {
    HashMap<String, String> headersMap = new HashMap<>();

    public HashMap<String, String> getHeaders(){
        clearHeadersMap();
        headersMap.put("x-api-key", "d8d4a69e-beb6-4878-be50-ee3455fc09f9");
        headersMap.put("Content-Type", "application/json");
        return headersMap;
    }

    public HashMap<String, String> clearHeadersMap(){
        if(!headersMap.isEmpty()){
            headersMap.clear();
        }
        return headersMap;
    }

    public HashMap<String, String> getDefinedHeaders(DataTable table) {
        clearHeadersMap();
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> map : data) {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                headersMap.put(key, map.get(key));
            }
        }
        return headersMap;
    }


    public HashMap<String, String> loginHeaders(){
        headersMap.put("x-api-key", "d8d4a69e-beb6-4878-be50-ee3455fc09f9");
        headersMap.put("Content-Type", "application/json");
        headersMap.put("x-jws-signature", "eyJhbGciOiJFUzI1NiJ9.eyJzaWduYXR1cmUiOiJNRVVDSVFEVWtlYW5Pb1BNMmk0REpRb2p2c1NHaU9JSTJVV0JKM2pLY005WHdCXC94T0FJZ1ViWmhvTHZVMVwvQXU2dHpcL1ZSQ1FrTXF3XC9OZVU3bkJDQTNpNHN3VVVqT1k9In0.urS4nDJtcRGgzvnwbFj9MHP1a5e0C37QAZCjYRXdTa0pBmrR06mzO4om38sfMdVykeqSnBslJNExqFhgEwHpKg");
        return headersMap;
    }

    public HashMap<String, String> tokenWithHeaders(String accessToken){
        headersMap.put("x-api-key", "d8d4a69e-beb6-4878-be50-ee3455fc09f9");
        headersMap.put("Content-Type", "application/json");
        headersMap.put("Authorization", "Bearer " + accessToken);
        return headersMap;
    }

    public HashMap<String, String> cardDeliveryHeader(){
        headersMap.put("x-api-key", "d8d4a69e-beb6-4878-be50-ee3455fc09f9");
        headersMap.put("Content-Type", "application/json");
        return headersMap;
    }
}
