package com.example.repo3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Service3Test {
    @Test
    public void testProcess() {
        Service3 service = new Service3();
        assertTrue(service.process().contains("Processed by Repo3."));
    }
}
