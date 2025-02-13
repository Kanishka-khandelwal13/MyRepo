package com.cg.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="employee-service", url="http://localhost:8080")
public interface DepartmentFeignClient {
    @GetMapping("emp/employee")
    public String EmployeeResponse();
}

