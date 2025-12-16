package model;

import enums.Gender;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String firstName;
    private LocalDate dateOfBirth;
    private String phoneNumber;
    private Gender gender;

    public Customer() {
    }

    public Customer(Long id, String firstName, LocalDate dateOfBirth, String phoneNumber, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                '}';
    }
}
