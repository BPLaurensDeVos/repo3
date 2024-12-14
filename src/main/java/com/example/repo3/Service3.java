package com.example.repo3;

import com.example.repo2.Service2;

public class Service3 {
    public String process() {
        Service2 service = new Service2();
        return service.getServiceMessage() + " Processed by Repo3.";
    }
}
