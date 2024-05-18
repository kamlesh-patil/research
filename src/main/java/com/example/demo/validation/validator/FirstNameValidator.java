package com.example.demo.validation.validator;

import com.example.demo.validation.FirstNameValidate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FirstNameValidator implements ConstraintValidator<FirstNameValidate, String> {
    private Pattern pattern;

    @Override
    public void initialize(FirstNameValidate firstNameValidate) {
        try {
            pattern = Pattern.compile(firstNameValidate.regexp());
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Given regex is invalid", e);
        }
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        Matcher m = pattern.matcher(value);
        return m.matches();
    }
}
