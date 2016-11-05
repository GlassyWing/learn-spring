package org.manlier.convert;

import org.manlier.propertyeditor.ExoticType;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by manlier on 2016/10/28.
 */
public class MyCustomConverter implements Converter<String, ExoticType> {

    @Override
    public ExoticType convert(String source) {
        return new ExoticType(source.toUpperCase());
    }
}
