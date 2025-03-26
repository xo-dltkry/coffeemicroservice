package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.service.EmployeeService;
import com.example.employeeservice.feign.AddressClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final AddressClient addressClient; // Добавлено

    public EmployeeController(EmployeeService employeeService, AddressClient addressClient) {
        this.employeeService = employeeService;
        this.addressClient = addressClient; // Добавлено
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/by-coffee/{coffeeType}")
    public List<Employee> getByCoffee(@PathVariable String coffeeType) {
        return employeeService.getEmployeesByCoffee(coffeeType);
    }

    @GetMapping("/{id}/cafes")
    public List<String> getNearbyCafes(@PathVariable Long id) {
        Employee employee = employeeService.findEmployeeById(id); // Используем метод поиска по id
        return addressClient.getNearbyCafes(employee.getCity());
    }
}
