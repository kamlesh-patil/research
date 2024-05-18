package com.example.demo.dto;

import com.example.demo.enums.LastName;
import com.example.demo.validation.FirstNameValidate;
import com.example.demo.validation.LastNameValidate;

import java.io.Serializable;

public class ApplicationLabelDTO implements Serializable {

    private String account;
git
    @FirstNameValidate(regexp = "first name|First Name|Your Name")
    private String firstName;

//    @MiddleNameValidate(anyOf = {MiddleName.FATHER_NAME, MiddleName.Father_Name, MiddleName.MIDDLE_NAME, MiddleName.Middle_Name})
    private String middleName;

    @LastNameValidate(enumClass = LastName.class)
    private String lastName;

    private String gender;

    private String dateOfBirth;

    private String education;

    private String maritalStatus;

    private String noOfDependents;

    private String email;

    private String citizen;

    private String trnNumber;

    private String monthlyIncome;

    private String monthlyExpenses;

    private String carOwner;

    private String mainPhone;

    private String alternativePhoneNumber;

    private String incomeType;

    private String cibil;

    private String residentAtAddress;

    private String residentialAddress;

    private String fullAddress;

    public ApplicationLabelDTO() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNoOfDependents() {
        return noOfDependents;
    }

    public void setNoOfDependents(String noOfDependents) {
        this.noOfDependents = noOfDependents;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getTrnNumber() {
        return trnNumber;
    }

    public void setTrnNumber(String trnNumber) {
        this.trnNumber = trnNumber;
    }

    public String getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(String monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(String monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(String mainPhone) {
        this.mainPhone = mainPhone;
    }

    public String getAlternativePhoneNumber() {
        return alternativePhoneNumber;
    }

    public void setAlternativePhoneNumber(String alternativePhoneNumber) {
        this.alternativePhoneNumber = alternativePhoneNumber;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    public String getCibil() {
        return cibil;
    }

    public void setCibil(String cibil) {
        this.cibil = cibil;
    }

    public String getResidentAtAddress() {
        return residentAtAddress;
    }

    public void setResidentAtAddress(String residentAtAddress) {
        this.residentAtAddress = residentAtAddress;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }
}