package ru.kolomiets;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("First Name", firstName).
                append("Last Name", lastName).
                append("Age", age).
                toString();
    }

    public boolean equalsBuilder(Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Person rhs = (Person) obj;
        return new EqualsBuilder()
                .appendSuper(super.equals(obj))
                .append(firstName, rhs.firstName)
                .append(lastName, rhs.lastName)
                .append(age, rhs.age)
                .isEquals();
    }

    public int hashCodeCommon() {
        // you pick a hard-coded, randomly chosen, non-zero, odd number
        // ideally different for each class
        return new HashCodeBuilder(17, 37).
                append(firstName).
                append(lastName).
                append(age).
                toHashCode();
    }
}
