package com.example.medbot;

import java.util.ArrayList;

public class ApiResponseClass {
    ArrayList<String> Response;

    public ApiResponseClass(ArrayList<String> response) {
        Response = response;
    }

    public ArrayList<String> getResponse() {
        return Response;
    }

    public void setResponse(ArrayList<String> response) {
        Response = response;
    }
}
