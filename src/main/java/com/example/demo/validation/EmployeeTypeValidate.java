package com.example.demo.validation;

import com.example.demo.validation.validator.EmployeeTypeValidator;

import java.lang.annotation.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER}) //wehere exactly you want to implement, whther field level or constructor level?
@Retention(RetentionPolicy.RUNTIME) //at what time you want to implement this annotation
@Documented
@Constraint(validatedBy = EmployeeTypeValidator.class) //Who is going validate this annotation?. which is a class which have actual logic to validate this annotation
public @interface EmployeeTypeValidate {

    public String message() default "Invalid employeeType: It should be either Permanent Or vendor"; //if message not passed then this will be returned

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}