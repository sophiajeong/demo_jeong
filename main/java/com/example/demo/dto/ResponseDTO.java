package com.example.demo.dto;

import java.util.List;

public class ResponseDTO<T> {
    private String error;
    private List<T> data;

    public ResponseDTO() {}

    public ResponseDTO(String error, List<T> data) {
        this.error = error;
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    // remember to add equals, hashCode and toString if you need them
}
