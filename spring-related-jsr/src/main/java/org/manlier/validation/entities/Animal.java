package org.manlier.validation.entities;

import org.manlier.validation.annotation.NotEmpty;

/**
 * Created by manlier on 2016/10/29.
 */
public interface Animal {
    @NotEmpty String getName();
    @NotEmpty String getOwnerName();
}
