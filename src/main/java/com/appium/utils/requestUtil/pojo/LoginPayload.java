package com.appium.utils.requestUtil.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class LoginPayload {
        public String deviceId;
        public String mobileNumber;
        public String passcode;
    }


