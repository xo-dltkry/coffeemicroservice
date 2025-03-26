package com.example.employeeservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "address-service", url = "http://localhost:8082")
public interface AddressClient {
    @GetMapping("/addresses/coffee-near/{city}")
    List<String> getNearbyCafes(@PathVariable String city);
}
