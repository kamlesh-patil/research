package com.example.demo.validation.validator;

import com.example.demo.validation.LastNameValidate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LastNameValidator implements ConstraintValidator<LastNameValidate, String> {
    private List<String> acceptedValues;

    @Override
    public void initialize(LastNameValidate annotation) {
        acceptedValues = Stream.of(annotation.enumClass().getEnumConstants())
                .map(Enum::name)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        return acceptedValues.contains(value);
    }
}
