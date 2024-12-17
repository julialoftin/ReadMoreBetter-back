package com.ReadMoreBetter.ReadMoreBetter.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

@Entity
public class Author extends AbstractEntity {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(birthday, author.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, birthday);
    }
}
