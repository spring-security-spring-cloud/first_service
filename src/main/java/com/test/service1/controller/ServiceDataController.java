package com.test.service1.controller;

import com.test.service1.model.ServiceInput;
import com.test.service1.service.InputDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/first-service")
public class ServiceDataController {
    private final InputDataService inputDataService;

    @GetMapping("/get-data")
    public List<ServiceInput> getInputData() {

        return inputDataService.getListByService("first_service");
    }
}
