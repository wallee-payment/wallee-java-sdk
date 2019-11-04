/*
 * wallee
 * JAVA SDK
 *
 * OpenAPI spec version: 2.0.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wallee.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.wallee.sdk.model.Gender;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.time.OffsetDateTime;

/**
 * 
 */
public class CustomerPostalAddressCreate {
  
  @SerializedName("city")
  protected String city = null;

  
  @SerializedName("commercialRegisterNumber")
  protected String commercialRegisterNumber = null;

  
  @SerializedName("country")
  protected String country = null;

  
  @SerializedName("dateOfBirth")
  protected LocalDate dateOfBirth = null;

  
  @SerializedName("dependentLocality")
  protected String dependentLocality = null;

  
  @SerializedName("emailAddress")
  protected String emailAddress = null;

  
  @SerializedName("familyName")
  protected String familyName = null;

  
  @SerializedName("gender")
  protected Gender gender = null;

  
  @SerializedName("givenName")
  protected String givenName = null;

  
  @SerializedName("legalOrganizationForm")
  protected Long legalOrganizationForm = null;

  
  @SerializedName("mobilePhoneNumber")
  protected String mobilePhoneNumber = null;

  
  @SerializedName("organizationName")
  protected String organizationName = null;

  
  @SerializedName("phoneNumber")
  protected String phoneNumber = null;

  
  @SerializedName("postCode")
  protected String postCode = null;

  
  @SerializedName("postalState")
  protected String postalState = null;

  
  @SerializedName("salesTaxNumber")
  protected String salesTaxNumber = null;

  
  @SerializedName("salutation")
  protected String salutation = null;

  
  @SerializedName("socialSecurityNumber")
  protected String socialSecurityNumber = null;

  
  @SerializedName("sortingCode")
  protected String sortingCode = null;

  
  @SerializedName("street")
  protected String street = null;

  
  
  public CustomerPostalAddressCreate city(String city) {
    this.city = city;
    return this;
  }

   /**
   * 
   * @return city
  **/
  @ApiModelProperty(value = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  
  public CustomerPostalAddressCreate commercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
    return this;
  }

   /**
   * 
   * @return commercialRegisterNumber
  **/
  @ApiModelProperty(value = "")
  public String getCommercialRegisterNumber() {
    return commercialRegisterNumber;
  }

  public void setCommercialRegisterNumber(String commercialRegisterNumber) {
    this.commercialRegisterNumber = commercialRegisterNumber;
  }

  
  public CustomerPostalAddressCreate country(String country) {
    this.country = country;
    return this;
  }

   /**
   * 
   * @return country
  **/
  @ApiModelProperty(value = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  
  public CustomerPostalAddressCreate dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * 
   * @return dateOfBirth
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  
  public CustomerPostalAddressCreate dependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
    return this;
  }

   /**
   * 
   * @return dependentLocality
  **/
  @ApiModelProperty(value = "")
  public String getDependentLocality() {
    return dependentLocality;
  }

  public void setDependentLocality(String dependentLocality) {
    this.dependentLocality = dependentLocality;
  }

  
  public CustomerPostalAddressCreate emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * 
   * @return emailAddress
  **/
  @ApiModelProperty(value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  
  public CustomerPostalAddressCreate familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

   /**
   * 
   * @return familyName
  **/
  @ApiModelProperty(value = "")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  
  public CustomerPostalAddressCreate gender(Gender gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  
  public CustomerPostalAddressCreate givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

   /**
   * 
   * @return givenName
  **/
  @ApiModelProperty(value = "")
  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  
  public CustomerPostalAddressCreate legalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
    return this;
  }

   /**
   * 
   * @return legalOrganizationForm
  **/
  @ApiModelProperty(value = "")
  public Long getLegalOrganizationForm() {
    return legalOrganizationForm;
  }

  public void setLegalOrganizationForm(Long legalOrganizationForm) {
    this.legalOrganizationForm = legalOrganizationForm;
  }

  
  public CustomerPostalAddressCreate mobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
    return this;
  }

   /**
   * 
   * @return mobilePhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getMobilePhoneNumber() {
    return mobilePhoneNumber;
  }

  public void setMobilePhoneNumber(String mobilePhoneNumber) {
    this.mobilePhoneNumber = mobilePhoneNumber;
  }

  
  public CustomerPostalAddressCreate organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

   /**
   * 
   * @return organizationName
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  
  public CustomerPostalAddressCreate phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  public CustomerPostalAddressCreate postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * 
   * @return postCode
  **/
  @ApiModelProperty(value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  
  public CustomerPostalAddressCreate postalState(String postalState) {
    this.postalState = postalState;
    return this;
  }

   /**
   * 
   * @return postalState
  **/
  @ApiModelProperty(value = "")
  public String getPostalState() {
    return postalState;
  }

  public void setPostalState(String postalState) {
    this.postalState = postalState;
  }

  
  public CustomerPostalAddressCreate salesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
    return this;
  }

   /**
   * 
   * @return salesTaxNumber
  **/
  @ApiModelProperty(value = "")
  public String getSalesTaxNumber() {
    return salesTaxNumber;
  }

  public void setSalesTaxNumber(String salesTaxNumber) {
    this.salesTaxNumber = salesTaxNumber;
  }

  
  public CustomerPostalAddressCreate salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * 
   * @return salutation
  **/
  @ApiModelProperty(value = "")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  
  public CustomerPostalAddressCreate socialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * 
   * @return socialSecurityNumber
  **/
  @ApiModelProperty(value = "")
  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  
  public CustomerPostalAddressCreate sortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
    return this;
  }

   /**
   * The sorting code identifies the post office at which the post box is located in.
   * @return sortingCode
  **/
  @ApiModelProperty(value = "The sorting code identifies the post office at which the post box is located in.")
  public String getSortingCode() {
    return sortingCode;
  }

  public void setSortingCode(String sortingCode) {
    this.sortingCode = sortingCode;
  }

  
  public CustomerPostalAddressCreate street(String street) {
    this.street = street;
    return this;
  }

   /**
   * 
   * @return street
  **/
  @ApiModelProperty(value = "")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerPostalAddressCreate customerPostalAddressCreate = (CustomerPostalAddressCreate) o;
    return Objects.equals(this.city, customerPostalAddressCreate.city) &&
        Objects.equals(this.commercialRegisterNumber, customerPostalAddressCreate.commercialRegisterNumber) &&
        Objects.equals(this.country, customerPostalAddressCreate.country) &&
        Objects.equals(this.dateOfBirth, customerPostalAddressCreate.dateOfBirth) &&
        Objects.equals(this.dependentLocality, customerPostalAddressCreate.dependentLocality) &&
        Objects.equals(this.emailAddress, customerPostalAddressCreate.emailAddress) &&
        Objects.equals(this.familyName, customerPostalAddressCreate.familyName) &&
        Objects.equals(this.gender, customerPostalAddressCreate.gender) &&
        Objects.equals(this.givenName, customerPostalAddressCreate.givenName) &&
        Objects.equals(this.legalOrganizationForm, customerPostalAddressCreate.legalOrganizationForm) &&
        Objects.equals(this.mobilePhoneNumber, customerPostalAddressCreate.mobilePhoneNumber) &&
        Objects.equals(this.organizationName, customerPostalAddressCreate.organizationName) &&
        Objects.equals(this.phoneNumber, customerPostalAddressCreate.phoneNumber) &&
        Objects.equals(this.postCode, customerPostalAddressCreate.postCode) &&
        Objects.equals(this.postalState, customerPostalAddressCreate.postalState) &&
        Objects.equals(this.salesTaxNumber, customerPostalAddressCreate.salesTaxNumber) &&
        Objects.equals(this.salutation, customerPostalAddressCreate.salutation) &&
        Objects.equals(this.socialSecurityNumber, customerPostalAddressCreate.socialSecurityNumber) &&
        Objects.equals(this.sortingCode, customerPostalAddressCreate.sortingCode) &&
        Objects.equals(this.street, customerPostalAddressCreate.street);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, commercialRegisterNumber, country, dateOfBirth, dependentLocality, emailAddress, familyName, gender, givenName, legalOrganizationForm, mobilePhoneNumber, organizationName, phoneNumber, postCode, postalState, salesTaxNumber, salutation, socialSecurityNumber, sortingCode, street);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerPostalAddressCreate {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    commercialRegisterNumber: ").append(toIndentedString(commercialRegisterNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    dependentLocality: ").append(toIndentedString(dependentLocality)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    legalOrganizationForm: ").append(toIndentedString(legalOrganizationForm)).append("\n");
    sb.append("    mobilePhoneNumber: ").append(toIndentedString(mobilePhoneNumber)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postalState: ").append(toIndentedString(postalState)).append("\n");
    sb.append("    salesTaxNumber: ").append(toIndentedString(salesTaxNumber)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    sortingCode: ").append(toIndentedString(sortingCode)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

