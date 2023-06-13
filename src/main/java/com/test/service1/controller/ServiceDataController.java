package com.test.service1.controller;

import com.test.service1.component.ServiceResponse;
import com.test.service1.exceptions.DataNotFoundException;
import com.test.service1.model.ServiceInput;
import com.test.service1.service.InputDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/first-service")
public class ServiceDataController {
    private final InputDataService inputDataService;

    @GetMapping("/get-data")
    public ResponseEntity<ServiceResponse> getInputData() {
        List<ServiceInput> inputs = inputDataService.getListByService("first-service");
        if (!inputs.isEmpty()){
            return new ResponseEntity<>(new ServiceResponse("data found", inputs), HttpStatus.OK);
        } else {
            //return new ResponseEntity<>(new ServiceResponse("data not found", inputs), HttpStatus.NO_CONTENT);
            throw new DataNotFoundException("data not found");
        }
    }

    @PostMapping("/save-data")
    public ResponseEntity<ServiceResponse> saveInputData(@Valid @RequestBody ServiceInput input) {
        ServiceInput savedInput = inputDataService.createInput(input);
        return new ResponseEntity<>(new ServiceResponse("saved data", savedInput), HttpStatus.OK);
    }
}
