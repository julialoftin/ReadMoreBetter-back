package com.ReadMoreBetter.ReadMoreBetter.DTOs;

import jakarta.validation.constraints.NotNull;

public class AuthorDTO {

    @NotNull
    private String name;

    @NotNull
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
