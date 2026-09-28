package com.ndejje.gis.hostels;
public class Hostel {
    // Attributes matching the dataset
    private final String hostelId;
    private final String hostelName;
    private final String accommodationType;
    private final double rentalPrice;
    private final String occupancyStatus;
    private final double latitude;
    private final double longitude;
    // Constructor to initialize hostel objects
    public Hostel(String hostelId, String hostelName, String accommodationType, double rentalPrice, String occupancyStatus, double latitude, double longitude) {
        this.hostelId = hostelId;
        this.hostelName = hostelName;
        this.accommodationType = accommodationType;
        this.rentalPrice = rentalPrice;
        this.occupancyStatus = occupancyStatus;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    // Check if status is fully occupied
    public boolean isOccupied() {
        return occupancyStatus.equalsIgnoreCase("Occupied");
    }
    // Getter for rental price calculation
    public double getRentalPrice() {
        return rentalPrice;
    }
    // Display function for hostel records
    public void printHostelDetails() {
        System.out.println("ID: " + hostelId + " | Name: " + hostelName);
        System.out.println("Type: " + accommodationType);
        System.out.println("Price: UGX " + rentalPrice + " | Status: " + occupancyStatus);
        System.out.println("Coordinates: (" + latitude + ", " + longitude + ")");
        System.out.println("Fully Occupied: " + isOccupied());
        System.out.println("------------------------------------------------");
    }
}