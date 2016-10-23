package com.andrios.welcomehome;

/**
 * Created by Corey on 8/27/2016.
 */
public class Location {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String hours;
    private String locationType;
    private String phoneNumber;
    private int imageIcon = NO_IMAGE_PROVIDED;
    private int imagePoster = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Constructor with icon
     * @param name
     * @param address
     * @param city
     * @param state
     * @param zipCode
     * @param hours
     * @param locationType
     * @param phoneNumber
     * @param imageIcon
     * @param imagePoster
     */
    public Location(String name, String address, String city, String state, String zipCode,
                    String hours, String locationType, String phoneNumber,
                    int imageIcon, int imagePoster){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.hours = hours;
        this.locationType = locationType;
        this.phoneNumber = phoneNumber;
        this.imageIcon = imageIcon;
        this.imagePoster = imagePoster;
    }

    /**
     * Constructor without Icon
     * @param name
     * @param address
     * @param city
     * @param state
     * @param zipCode
     * @param hours
     * @param locationType
     * @param phoneNumber
     * @param imagePoster
     */
    public Location(String name, String address, String city, String state, String zipCode,
                    String hours, String locationType, String phoneNumber,
                    int imagePoster){
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.hours = hours;
        this.locationType = locationType;
        this.phoneNumber = phoneNumber;
        this.imagePoster = imagePoster;
    }

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

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(int imageIcon) {
        this.imageIcon = imageIcon;
    }

    public int getImagePoster() {
        return imagePoster;
    }

    public void setImagePoster(int imagePoster) {
        this.imagePoster = imagePoster;
    }

    public boolean hasIcon() {
        return imageIcon != NO_IMAGE_PROVIDED;
    }

    public boolean hasPoster() {
        return imagePoster != NO_IMAGE_PROVIDED;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getFormattedAddress(){
        return address + "\n" + city + ", " + state + " " + zipCode;
    }
}
