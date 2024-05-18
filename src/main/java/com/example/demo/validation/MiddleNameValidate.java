//package com.example.demo.validation;
//
//import com.example.demo.enums.MiddleName;
//import com.example.demo.validation.validator.MiddleNameValidator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.ElementType.*;
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//@Target({FIELD})
//@Retention(RUNTIME)
//@Documented
//@Constraint(validatedBy = MiddleNameValidator.class)
//public @interface MiddleNameValidate {
//    MiddleName [] anyOf();
//    String message() default "must be any of {anyOf}";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
//}
