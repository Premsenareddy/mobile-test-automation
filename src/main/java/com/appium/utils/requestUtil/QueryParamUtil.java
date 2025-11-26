package com.appium.utils.requestUtil;

import io.cucumber.datatable.DataTable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class QueryParamUtil {

    HashMap<String, String> queryParamMap = new HashMap<>();;

    public HashMap<String, String> getRegisteredDeviceParams(){
        clearQueryMap();
        queryParamMap.put("mobileNumber", "+971581362291");
        return queryParamMap;
    }

    public HashMap<String, String> clearQueryMap(){
        if(!queryParamMap.isEmpty()){
            queryParamMap.clear();
        }
        return queryParamMap;
    }

    public HashMap<String, String> getDefinedParams(DataTable table) {
        clearQueryMap();
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> map : data) {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                queryParamMap.put(key, map.get(key));
            }
        }
        return queryParamMap;
    }
}
