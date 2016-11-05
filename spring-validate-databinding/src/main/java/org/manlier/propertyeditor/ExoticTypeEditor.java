package org.manlier.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * Created by manlier on 2016/10/28.
 */
public class ExoticTypeEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new ExoticType(text.toUpperCase()));
    }

}
