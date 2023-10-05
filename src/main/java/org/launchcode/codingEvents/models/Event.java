package org.launchcode.codingEvents.models;

import jakarta.validation.constraints.*;

import java.util.Objects;

public class Event {

    private int id;
    private static int nextId = 1;

    @NotBlank
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @Size(max = 500, message = "Description too long.")
    private String description;

    @NotBlank
    @Email(message = "Invalid email. Try Again.")
    private String contactEmail;

    @NotBlank(message = "Location must be specified.")
    @NotNull
    private String location;

    @AssertTrue(message = "There must be preregistration.")
    private boolean preRegister;

    @Min(1)
    private int attendanceNum;

    public Event(String name, String description, String contactEmail, String location, boolean preRegister, int attendanceNum) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.location = location;
        this.preRegister = preRegister;
        this.attendanceNum = attendanceNum;
        this.id = nextId;
        nextId++;
    }

    public Event() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isPreRegister() {
        return preRegister;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
