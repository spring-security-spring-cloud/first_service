package com.test.service1.serviceImpl;

import com.test.service1.model.ServiceInput;
import com.test.service1.repository.ServiceInputRepository;
import com.test.service1.service.InputDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InputDataServiceImplementation implements InputDataService {
    @Autowired
    private final ServiceInputRepository serviceInputRepository;
    @Override
    public List<ServiceInput> getListByService(String serviceName) {
        return serviceInputRepository.findAllByServiceName(serviceName);
    }
}
