package com.example.layoutapplication.model;

public class UserBiodataModel {

    String bioName = "";
    String bioDob = "";
    String bioTime = "";

    String bioWeight = "";
    String bioBloodGroup = "";
    String bioLanguage = "";
    String bioHobbies = "";
    String bioAge = "";
    String bioAddress="";
    String bioEmail="";

    String bioHeight = "";
    String bioComplexion = "";//not required
    String bioBirthPlace = "";
    String bioCityLiving = "";

    String bioReligion = "";
    String bioCaste = "";//not required
    String bioZodiac = "";//not required
    String bioCasteExtra = "";//not required
    String bioEducation = "";
    String bioOccupation = "";//merged occupation and organization into one field
    String bioOrganisation = "";//merged occupation and organization into one field
    String bioSalary = "";

    String bioFatherName = "";
    String bioMotherName = "";
    String bioSibling = "";
    String bioPaternal = "";//not required
    String bioMaternal = "";//not required

    String bioAboutFamily = "";//not required
    String bioAboutMe = "";

    String bioContact = "";
    String bioLookingFor = "";
    String bioProfileImage = "";

    public String getBioName() {
        return bioName;
    }

    public void setBioName(String bioName) {
        this.bioName = bioName;
    }

    public String getBioDob() {
        return bioDob;
    }

    public void setBioDob(String bioDob) {
        this.bioDob = bioDob;
    }

    public String getBioTime() {
        return bioTime;
    }

    public void setBioTime(String bioTime) {
        this.bioTime = bioTime;
    }


    public String getBioWeight() {
        return bioWeight;
    }

    public void setBioWeight(String bioWeight) {
        this.bioWeight = bioWeight;
    }

    public String getBioAge() {
        return bioAge;
    }

    public void setBioAge(String bioAge) {
        this.bioAge = bioAge;
    }

    public String getBioHobbies() { return bioHobbies; }
    public void setBioHobbies(String bioHobbies) {
        this.bioHobbies = bioHobbies;
    }

    public String getBioLanguage() {
        return bioLanguage;
    }

    public void setBioLanguage(String bioLanguage) {
        this.bioLanguage = bioLanguage;
    }

    public String getBioBloodGroup() {
        return bioBloodGroup;
    }

    public void setBioBloodGroup(String bioBloodGroup) {
        this.bioBloodGroup = bioBloodGroup;
    }

    public String getBioAddress() {
        return bioAddress;
    }

    public void setBioAddress(String bioAddress) {
        this.bioAddress = bioAddress;
    }

    public String getBioEmail() {
        return bioEmail;
    }

    public void setBioEmail(String bioEmail) {
        this.bioEmail = bioEmail;
    }



    public String getBioHeight() {
        return bioHeight;
    }

    public void setBioHeight(String bioHeight) {
        this.bioHeight = bioHeight;
    }

    public String getBioComplexion() {
        return bioComplexion;
    }

    public void setBioComplexion(String bioComplexion) {
        this.bioComplexion = bioComplexion;
    }

    public String getBioBirthPlace() {
        return bioBirthPlace;
    }

    public void setBioBirthPlace(String bioBirthPlace) {
        this.bioBirthPlace = bioBirthPlace;
    }

    public String getBioCityLiving() {
        return bioCityLiving;
    }

    public void setBioCityLiving(String bioCityLiving) {
        this.bioCityLiving = bioCityLiving;
    }

    public String getBioReligion() {
        return bioReligion;
    }

    public void setBioReligion(String bioReligion) {
        this.bioReligion = bioReligion;
    }

    public String getBioCaste() {
        return bioCaste;
    }

    public void setBioCaste(String bioCaste) {
        this.bioCaste = bioCaste;
    }

    public String getBioZodiac() {
        return bioZodiac;
    }

    public void setBioZodiac(String bioZodiac) {
        this.bioZodiac = bioZodiac;
    }

    public String getBioCasteExtra() {
        return bioCasteExtra;
    }

    public void setBioCasteExtra(String bioCasteExtra) {
        this.bioCasteExtra = bioCasteExtra;
    }

    public String getBioEducation() {
        return bioEducation;
    }

    public void setBioEducation(String bioEducation) {
        this.bioEducation = bioEducation;
    }

    public String getBioOccupation() {
        return bioOccupation;
    }

    public void setBioOccupation(String bioOccupation) {
        this.bioOccupation = bioOccupation;
    }

    public String getBioOrganisation() {
        return bioOrganisation;
    }

    public void setBioOrganisation(String bioOrganisation) {
        this.bioOrganisation = bioOrganisation;
    }

    public String getBioSalary() {
        return bioSalary;
    }

    public void setBioSalary(String bioSalary) {
        this.bioSalary = bioSalary;
    }

    public String getBioFatherName() {
        return bioFatherName;
    }

    public void setBioFatherName(String bioFatherName) {
        this.bioFatherName = bioFatherName;
    }

    public String getBioMotherName() {
        return bioMotherName;
    }

    public void setBioMotherName(String bioMotherName) {
        this.bioMotherName = bioMotherName;
    }

    public String getBioSibling() {
        return bioSibling;
    }

    public void setBioSibling(String bioSibling) {
        this.bioSibling = bioSibling;
    }

    public String getBioPaternal() {
        return bioPaternal;
    }

    public void setBioPaternal(String bioPaternal) {
        this.bioPaternal = bioPaternal;
    }

    public String getBioMaternal() {
        return bioMaternal;
    }

    public void setBioMaternal(String bioMaternal) {
        this.bioMaternal = bioMaternal;
    }

    public String getBioAboutFamily() {
        return bioAboutFamily;
    }

    public void setBioAboutFamily(String bioAboutFamily) {
        this.bioAboutFamily = bioAboutFamily;
    }

    public String getBioAboutMe() {
        return bioAboutMe;
    }

    public void setBioAboutMe(String bioAboutMe) {
        this.bioAboutMe = bioAboutMe;
    }

    public String getBioContact() {
        return bioContact;
    }

    public void setBioContact(String bioContact) {
        this.bioContact = bioContact;
    }

    public String getBioLookingFor() {
        return bioLookingFor;
    }

    public void setBioLookingFor(String bioLookingFor) {
        this.bioLookingFor = bioLookingFor;
    }

    public String getBioProfileImage() {
        return bioProfileImage;
    }

    public void setBioProfileImage(String bioProfileImage) {
        this.bioProfileImage = bioProfileImage;
    }

    @Override
    public String toString() {
        return "UserBiodataModel{" +
                "bioName='" + bioName + '\'' +
                ", bioDob='" + bioDob + '\'' +
                ", bioTime='" + bioTime + '\'' +
                ", bioHeight='" + bioHeight + '\'' +
                ", bioWeight='" + bioWeight + '\'' +//1
                ", bioAge='" + bioAge + '\'' +//2
                ", bioEmail='" + bioEmail + '\'' +//3
                ", bioBloodGroup='" + bioBloodGroup + '\'' +//4
                ", bioAddress='" + bioAddress + '\'' +//5
                ", bioLanguage='" + bioLanguage + '\'' +//6
                ", bioHobbies='" + bioHobbies + '\'' +//7
                ", bioComplexion='" + bioComplexion + '\'' +
                ", bioBirthPlace='" + bioBirthPlace + '\'' +
                ", bioCityLiving='" + bioCityLiving + '\'' +
                ", bioReligion='" + bioReligion + '\'' +
                ", bioCaste='" + bioCaste + '\'' +
                ", bioZodiac='" + bioZodiac + '\'' +
                ", bioCasteExtra='" + bioCasteExtra + '\'' +
                ", bioEducation='" + bioEducation + '\'' +
                ", bioOccupation='" + bioOccupation + '\'' +
                ", bioOrganisation='" + bioOrganisation + '\'' +
                ", bioSalary='" + bioSalary + '\'' +
                ", bioFatherName='" + bioFatherName + '\'' +
                ", bioMotherName='" + bioMotherName + '\'' +
                ", bioSibling='" + bioSibling + '\'' +
                ", bioPaternal='" + bioPaternal + '\'' +
                ", bioMaternal='" + bioMaternal + '\'' +
                ", bioAboutFamily='" + bioAboutFamily + '\'' +
                ", bioAboutMe='" + bioAboutMe + '\'' +
                ", bioContact='" + bioContact + '\'' +
                ", bioLookingFor='" + bioLookingFor + '\'' +
                ", bioProfileImage='" + bioProfileImage + '\'' +
                '}';
    }
}
