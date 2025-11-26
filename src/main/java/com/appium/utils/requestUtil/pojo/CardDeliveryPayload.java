package com.appium.utils.requestUtil.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class CardDeliveryPayload {

    private String status;
    private String tracking_id;
    private String date;

}



