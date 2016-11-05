package org.manlier.validation.entities;

import org.manlier.validation.annotation.NotEmpty;

import javax.validation.groups.Default;

/**
 * Created by manlier on 2016/10/29.
 */
public class User {

    @NotEmpty(message = "Firstname may be empty")
    private String firstname;

    @NotEmpty(message = "Middlename may be empty", groups = Default.class)
    private String middlename;

    @NotEmpty(message = "Lastname may be empty", groups = GroupA.class)
    private String lastname;

    @NotEmpty(message = "Country may be empty", groups = GroupB.class)
    private String country;
}
