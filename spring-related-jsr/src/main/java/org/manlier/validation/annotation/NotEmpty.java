package org.manlier.validation.annotation;

import org.manlier.validation.validator.NotEmptyValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Created by manlier on 2016/10/29.
 */
@Target({METHOD, FIELD,ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {NotEmptyValidator.class})
public @interface NotEmpty {

    String message() default "This string may be empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
