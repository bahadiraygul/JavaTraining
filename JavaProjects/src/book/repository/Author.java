package book.repository;

import java.util.Objects;

public class Author {
    private String name;
    private String lastName;
    private char gender;


    public Author(String name, String lastName, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName) && Objects.equals(gender, author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }
}
