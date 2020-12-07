package com.company.yellowpages;

public class Company {
    //region Properties
    private String name;
    private String address;
    private int numberOfEmployees;
    private String mapLink;
    private String websiteURL;
    private String phoneNumber;
    //endregion

    //region Constructors

    public Company() {
    }

    public Company(String name, String address, int numberOfEmployees, String mapLink, String websiteURL,String phoneNumber) {
        this.name = name;
        this.address = address;
        this.numberOfEmployees = numberOfEmployees;
        this.mapLink = mapLink;
        this.websiteURL = websiteURL;
        this.phoneNumber = phoneNumber;
    }

    //endregion

    //region Public Methods
    public void printCompanyInfo(){
        System.out.println("Company: " + this.name);
        System.out.println("Address: "+ this.address);
        System.out.println("Number of employees: "+ this.numberOfEmployees);
        System.out.println("Map link: " + this.mapLink);
        System.out.println("Website: " + this.websiteURL);
        System.out.println("Phone number: " + this.phoneNumber);

    }

    //endregion

    //region Setters and Getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }

    public void setWebsiteURL(String websiteURL) {
        this.websiteURL = websiteURL;
    }

    //endregion
}
