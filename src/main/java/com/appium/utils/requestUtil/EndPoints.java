package com.appium.utils.requestUtil;


public class EndPoints {

    private static final String baseUrl = "https://experience.sit.alpha-platform.uk";
    private static final String getDeviceEndpoint = "/onboarding/public/devices";
    private static final String getRegisterMobileEndpoint = "/onboarding/public/customer/registered";
    private static final String choresEndpoint = "/chores/protected/chores/ab48557b-6561-47c4-8e31-db42d2361fa4";
    private static final String loginEndpoint = "/onboarding/public/customer/login";
    private static final String cardDeliveryEndpoint = "/courier/external/card-delivery-status";

    public static String getDeviceEndPointUrl() {
        return baseUrl + getDeviceEndpoint;
    }

    public static String getRegisterMobileEndPointUrl() {
        return baseUrl + getRegisterMobileEndpoint;
    }

    public static String getChores() { return baseUrl + choresEndpoint; }

    public static String getLoginEndpoint() { return baseUrl + loginEndpoint; }

    public static String getCardDeliveryEndpoint() { return baseUrl + cardDeliveryEndpoint; }

}
