package com.ndejje.gis.hostels;
public class GROUP3HOSTELS {
    public static void main(String[] args) {
        // Group 3 Dataset Array
        Hostel[] group3Hostels = new Hostel[5];
        group3Hostels[0] = new Hostel("H11", "Lugoba Hostel", "Not self-contained (Single)", 400000, "Partially Occupied", 0.60381995, 32.47741500);
        group3Hostels[1] = new Hostel("H12", "Blue Sheets Hostel", "Self-contained (Single)", 700000, "Occupied", 0.60435603, 32.47706700);
        group3Hostels[2] = new Hostel("H13", "Sofi Hostel", "Self-contained (Single)", 1200000, "Partially Occupied", 0.60272802, 32.47707000);
        group3Hostels[3] = new Hostel("H14", "Bwino Hostel", "Not self-contained (Single)", 400000, "Occupied", 0.60202834, 32.47737100);
        group3Hostels[4] = new Hostel("H15", "Elpa 2 Hostel", "Self-contained", 900000, "Partially Occupied", 0.60055991, 32.47730500);
        double totalRent = 0;
        int countOccupied = 0;
        int countNotOccupied = 0;
        System.out.println("==========================================");
        System.out.println("  GEO2102 GROUP 3 FIELD MAPPING REPORT    ");
        System.out.println("==========================================\n");
        // Loop through array to print details and compute counts
        for (Hostel group3Hostel : group3Hostels) {
            group3Hostel.printHostelDetails();
            totalRent = totalRent + group3Hostel.getRentalPrice();
            // Selection statement to check occupancy status
            if (group3Hostel.isOccupied()) {
                countOccupied++;
            } else {
                countNotOccupied++;
            }
        }
        // Calculate average price
        double avgPrice = totalRent / group3Hostels.length;
        System.out.println("==========================================");
        System.out.println("            SUMMARY RESULTS               ");
        System.out.println("==========================================");
        System.out.println("Average Rental Price: UGX " + avgPrice);
        System.out.println("Number of Fully Occupied Hostels: " + countOccupied);
        System.out.println("Number of Not Fully Occupied Hostels: " + countNotOccupied);
        System.out.println("==========================================");
    }
}