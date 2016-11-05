package org.manlier.validation.annotation;

import org.manlier.validation.validator.PatternOfStringValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

/**
 * Created by manlier on 2016/10/29.
 */
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {PatternOfStringValidator.class})
public @interface PatternOfString {

    String mustContainLetter();
    String message() default "This pattern may not be right";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    @Target({METHOD, FIELD, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @interface List {
        PatternOfString[] value();
    }
}
