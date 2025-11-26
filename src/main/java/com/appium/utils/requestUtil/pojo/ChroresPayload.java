package com.appium.utils.requestUtil.pojo;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class ChroresPayload {
        public String status;
        public String comment;
        public String childCif;
}


