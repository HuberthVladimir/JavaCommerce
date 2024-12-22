package com.hubethvladimir.JavaCommerce.dto;

import java.time.Instant;

public class CustomErrorDTO {

    private Instant timestamp;
    private Integer status;
    private String error;
    private String path;

    public CustomErrorDTO() {}

    public CustomErrorDTO(Instant timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public String getError() {
        return error;
    }

    public Integer getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }


}
