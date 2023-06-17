package com.example.demo.dto;

public class TestRequestBodyDTO {
    private int id;
    private String message;

    public TestRequestBodyDTO() {}

    public TestRequestBodyDTO(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    // remember to add equals, hashCode and toString if you need them
}
