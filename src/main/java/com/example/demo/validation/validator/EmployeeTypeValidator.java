package com.example.demo.validation.validator;

import com.example.demo.validation.EmployeeTypeValidate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class EmployeeTypeValidator implements ConstraintValidator<EmployeeTypeValidate, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> employeeTypes = Arrays.asList("Permanent", "vendor");
        return employeeTypes.contains(employeeType);
    }
}