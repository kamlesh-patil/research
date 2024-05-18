//package com.example.demo.validation.validator;
//
//import com.example.demo.enums.MiddleName;
//import com.example.demo.validation.MiddleNameValidate;
//import jakarta.validation.ConstraintValidator;
//import jakarta.validation.ConstraintValidatorContext;
//
//import java.util.Arrays;
//
//public class MiddleNameValidator implements ConstraintValidator<MiddleNameValidate, MiddleName> {
//    private MiddleName[] subset;
//
//    @Override
//    public void initialize(MiddleNameValidate constraint) {
//        this.subset = constraint.anyOf();
//    }
//
//    @Override
//    public boolean isValid(MiddleName value, ConstraintValidatorContext context) {
//        return value == null || Arrays.asList(subset).contains(value);
//    }
//}
