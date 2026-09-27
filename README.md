# PROCESSING HOSTEL MAPPING DATA IN JAVA - Group 3

## PARTICULARS
- Course Code: GEO2102
- Course Name: COMPUTER APPLICATIONS AND PROGRAMMING

## Group 3 Members
1. NATUMANYA CYNTHIA ARINDA — 25/1/324/D/334
2. OBANGATEK EMMANUEL — 25/1/324/D/001
3. NSANGI MARGRET — 25/1/324/D/1261
4. NAKAFEERO CYNTHIA — 25/1/324/D/1145
5. SSEMPIIRA GEORGE — 25/1/324/D/296
6. AHABWE CANAN — 25/1/324/D/465
7. KIZITO SIMON PETER — 25/1/324/D/303
8. MICH BARBARA — 25/1/324/D/2060
9. ATUNGONZA JOYCE — 25/1/324/D/1960
10. NSEMIRIIRWE MACKLEAN — 25/1/324/D/2115
11. DOKOTHO EVELYN — 25/1/324/DJ/528

## Project Overview
This Java application processes field mapped hostel spatial and attribute data collected around Ndejje University. The system uses an array of Hostel objects to store records, applies selection logic to evaluate occupancy statuses, calculates average rental prices, and generates formatted summary statistics.

## Dataset Processed
- Lugoba Hostel (H11)
- Blue Sheets Hostel (H12)
- Sofi Hostel (H13)
- Bwino Hostel (H14)
- Elpa 2 Hostel (H15)

## Work Methodology
Data Structuring: We designed an Object-Oriented `Hostel` class encapsulating attributes for hostel ID, name, accommodation type, price, status, and GPS coordinates (latitude, longitude).
We then populated an array of `Hostel` objects in the main class containing Group 3 field mapping data. Used a `for` loop to iterate through the array to display individual records.
Lastly, we implemented conditional logic (`if-else`) to categorize hostels by occupancy and calculated total rental costs across all processed records.

## Technical Errors Encountered & Resolution
- Error 1: `ClassNotFoundException` / Main Class Mismatch
  - Issue: We got a build error (`Could not find or load main class`) when executing Maven commands because the default project run configuration looked for `Main` while our class was named `GROUP3HOSTELS`.
  - Fix: Configured the project properties in NetBeans to point directly to `com.ndejje.gis.hostels.GROUP3HOSTELS` as the main execution class.
- Error 2: File Name and Class Name Mismatch
  - Issue: Compiler warnings occurred due to capitalization differences between the physical `.java` filenames and declared public class names.
  - Fix: Refactored class definitions to strictly match file names (`Hostel.java` and `GROUP3HOSTELS.java`).
- Error 3: Variable Reading Warnings
  - Issue: The application flagged unused private field variables in the constructor.
  - Fix: Added `printHostelDetails()` and getter methods to actively read and display all instance variables in console output.

## How to Run
1. Open Apache NetBeans IDE.
2. Open the project folder GROUP-3-HOSTELS.
3. Locate GROUP3HOSTELS.java in the com.ndejje.gis.hostels package.
4. Right click the file and select Run File (or press Shift + F10).

## Execution Output
```text
==========================================
   GEO2102 GROUP 3 FIELD MAPPING REPORT    
==========================================

ID: H11 | Name: Lugoba Hostel
Type: Not self-contained (Single)
Price: UGX 400000.0 | Status: Partially Occupied
Coordinates: (0.60381995, 32.477415)
Fully Occupied: false
------------------------------------------------
ID: H12 | Name: Blue Sheets Hostel
Type: Self-contained (Single)
Price: UGX 700000.0 | Status: Occupied
Coordinates: (0.60435603, 32.477067)
Fully Occupied: true
------------------------------------------------
ID: H13 | Name: Sofi Hostel
Type: Self-contained (Single)
Price: UGX 1200000.0 | Status: Partially Occupied
Coordinates: (0.60272802, 32.47707)
Fully Occupied: false
------------------------------------------------
ID: H14 | Name: Bwino Hostel
Type: Not self-contained (Single)
Price: UGX 400000.0 | Status: Occupied
Coordinates: (0.60202834, 32.477371)
Fully Occupied: true
------------------------------------------------
ID: H15 | Name: Elpa 2 Hostel
Type: Self-contained
Price: UGX 900000.0 | Status: Partially Occupied
Coordinates: (0.60055991, 32.477305)
Fully Occupied: false
------------------------------------------------
==========================================
            SUMMARY RESULTS                
==========================================
Average Rental Price: UGX 720000.0
Number of Fully Occupied Hostels: 2
Number of Not Fully Occupied Hostels: 3
==========================================