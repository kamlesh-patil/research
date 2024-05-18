package com.example.demo.validation;

import com.example.demo.validation.validator.FirstNameValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = FirstNameValidator.class)
public @interface FirstNameValidate {
    String regexp();
    String message() default "must match between \"{regexp}\"";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
