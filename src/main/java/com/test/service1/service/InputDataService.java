package com.test.service1.service;

import com.test.service1.model.ServiceInput;

import java.util.List;

public interface InputDataService {
    public List<ServiceInput> getListByService(String serviceName);

    public ServiceInput createInput(ServiceInput input);


}
