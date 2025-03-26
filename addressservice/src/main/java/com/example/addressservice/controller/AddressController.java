package com.example.addressservice.controller;

import com.example.addressservice.model.Address;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @GetMapping("/coffee-near/{city}")
    public List<String> getNearbyCafes(@PathVariable String city) {
        return Arrays.asList("Starbucks", "Costa Coffee", "Local Cafe");
    }
}
