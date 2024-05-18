package com.example.demo.validation;

import com.example.demo.validation.validator.LastNameValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Target({FIELD})//wehere exactly you want to implement, whther field level or constructor level?
@Retention(RetentionPolicy.RUNTIME) //at what time you want to implement this annotation
@Documented
@Constraint(validatedBy = LastNameValidator.class)
public @interface LastNameValidate { //@ValueOfEnum
    Class<? extends Enum<?>> enumClass();
    String message() default "must be any of from {enumClass}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}