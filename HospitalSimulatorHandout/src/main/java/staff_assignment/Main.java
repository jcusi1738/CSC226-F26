package staff_assignment;

public class Main {

    //TODO, create a main file to demonstrate your roster: add staff, assign treatments, undo one, release cases,
    //and show each treatment's performedBy staffId

    public static void main(String[] args) {
        StaffRoster roster = new StaffRoster();

        // Add staff members
        roster.addStaff(new StaffMember("S001", "Alice", Seniority.RESIDENT));
        roster.addStaff(new StaffMember("S002", "Bob", Seniority.ATTENDING));
        roster.addStaff(new StaffMember("S003", "Charlie", Seniority.NURSE));

        // Assign treatments
        StaffMember assigned1 = roster.assignTreatment("P001", "Treatment A", "2024-06-01 10:00", Seniority.RESIDENT);
        System.out.println("Treatment A performed by: " + (assigned1 != null ? assigned1.getStaffId() : "No staff available"));

        StaffMember assigned2 = roster.assignTreatment("P002", "Treatment B", "2024-06-01 11:00", Seniority.ATTENDING);
        System.out.println("Treatment B performed by: " + (assigned2 != null ? assigned2.getStaffId() : "No staff available"));

        // Undo last assignment
        StaffMember undone = roster.undoLastAssignment();
        System.out.println("Undid last assignment, released: " + (undone != null ? undone.getStaffId() : "No assignment to undo"));

        // Release a case
        roster.release(assigned1);
        System.out.println("Released staff member: " + (assigned1 != null ? assigned1.getStaffId() : "No staff to release"));

        // Show treatment history
        System.out.println("Treatment History:");
        System.out.println(roster.displayHistory());
    }
    
}
