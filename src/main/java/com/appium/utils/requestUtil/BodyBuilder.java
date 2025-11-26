//package com.appium.utils.requestUtil;
//
//import com.appium.utils.requestUtil.pojo.DevicePayload;
//import com.appium.utils.requestUtil.pojo.*;
//import com.google.gson.Gson;
//
//public class BodyBuilder {
//
//    public String getDeviceIdPayload(String deviceId, String deviceHash){
//        return new Gson().toJson(DevicePayload.builder().deviceId(deviceId).deviceHash(deviceHash).build());
//    }
//
//    public String getChoresPayload(String status, String comment, String childCif){
//        return new Gson().toJson(ChroresPayload.builder().status(status).comment(comment).childCif(childCif).build());
//    }
//
//    public String getLoginPayload(String deviceId, String mobileNumber, String passcode){
//        return new Gson().toJson(LoginPayload.builder().deviceId(deviceId).mobileNumber(mobileNumber).passcode(passcode).build());
//    }
//
//    public String getCardDeliveryReqPayload(String status, String tracking_id, String date){
//        return new Gson().toJson(CardDeliveryPayload.builder().status(status).tracking_id(tracking_id).date(date).build());
//    }
//
//
//
//}
