package employeeManagementSystem;

import java.util.Scanner;

public class StaffMember {
    private int staffId;
    private String staffName;
    private String jobTitle;
    private double annualSalary;

    private static StaffMember[] staffList = new StaffMember[100];
    private static int staffCount = 0;

    public StaffMember(int staffId, String staffName, String jobTitle, double annualSalary) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.jobTitle = jobTitle;
        this.annualSalary = annualSalary;
    }

    public static void addNewStaffMember(int staffId, String staffName, String jobTitle, double annualSalary) {
        if (staffCount < staffList.length) {
            staffList[staffCount++] = new StaffMember(staffId, staffName, jobTitle, annualSalary);
            System.out.println("Staff Member ID " + staffId + " has been successfully added.");
        } else {
            System.out.println("Cannot add more staff members, list is full.");
        }
        showAllStaffMembers();
    }

    public static void removeStaffMember(int staffId) {
        for (int i = 0; i < staffCount; i++) {
            if (staffList[i].staffId == staffId) {
                for (int j = i; j < staffCount - 1; j++) {
                    staffList[j] = staffList[j + 1];
                }
                staffList[--staffCount] = null;
                System.out.println("Staff Member ID " + staffId + " has been removed.");
                showAllStaffMembers();
                return;
            }
        }
        System.out.println("No staff member found with ID " + staffId + ".");
    }

    public static void findStaffMember(int staffId) {
        for (StaffMember staffMember : staffList) {
            if (staffMember != null && staffMember.staffId == staffId) {
                System.out.println("Staff Member details: " + staffMember);
                return;
            }
        }
        System.out.println("No staff member found with ID " + staffId + ".");
    }

    public static void showAllStaffMembers() {
        System.out.println("------------------------------------------------------");
        System.out.printf("| %-10s | %-20s | %-15s | %-10s |\n", "Staff ID", "Name", "Job Title", "Salary");
        System.out.println("------------------------------------------------------");
        for (StaffMember staffMember : staffList) {
            if (staffMember != null) {
                System.out.printf("| %-10d | %-20s | %-15s | %-10.2f |\n", staffMember.staffId, staffMember.staffName, staffMember.jobTitle, staffMember.annualSalary);
            }
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "staffId=" + staffId +
                ", staffName='" + staffName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", annualSalary=" + annualSalary +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----- Staff Management System -----");
            System.out.println("1. Add New Staff Member");
            System.out.println("2. Remove Staff Member");
            System.out.println("3. Search for Staff Member");
            System.out.println("4. Display All Staff Members");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Staff ID: ");
                    int staffId = scanner.nextInt();
                    System.out.print("Enter Staff Name: ");
                    String staffName = scanner.next();
                    System.out.print("Enter Job Title: ");
                    String jobTitle = scanner.next();
                    System.out.print("Enter Annual Salary: ");
                    double annualSalary = scanner.nextDouble();
                    addNewStaffMember(staffId, staffName, jobTitle, annualSalary);
                    break;
                case 2:
                    System.out.print("Enter Staff ID: ");
                    int removeId = scanner.nextInt();
                    removeStaffMember(removeId);
                    break;
                case 3:
                    System.out.print("Enter Staff ID: ");
                    int searchId = scanner.nextInt();
                    findStaffMember(searchId);
                    break;
                case 4:
                    showAllStaffMembers();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}