package br.com.devantenor.java8.model.people;

import java.util.Date;
import java.util.Optional;

public class Person {
    private String name;
    private Date birthday;
    private Double height;
    private Optional<String> surname = Optional.empty();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getSurname() {
        return (!surname.isEmpty() ? surname.get() : "Is Empty");
    }

    public void setSurname(String surname) {
        this.surname = Optional.of(surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name.toString() + '\'' +
                ", birthday=" + birthday.toString() +
                ", height=" + height.toString() +
                ", surname=" + getSurname().toString() +
                '}';
    }
}
