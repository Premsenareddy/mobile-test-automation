package com.appium.utils.requestUtil.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class DevicePayload {
    private String deviceId;
    private String deviceHash;
}


