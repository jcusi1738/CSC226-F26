package staff_assignment;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.NoSuchElementException;

import medical_action_tracking.TreatmentHistory;
import medical_action_tracking.TreatmentRecord;

public class StaffRoster {
    // Week 3 stack-based history; every assignment is recorded here so it can be undone.
    private final TreatmentHistory history = new TreatmentHistory();

    // Outer map groups staff by seniority; each inner set is sorted by StaffMember's ordering.
    private final TreeMap<Seniority, TreeSet<StaffMember>> tiers = new TreeMap<>();


    //  Add the staff member to the correct tier, and reject a duplicate staffId.
    public void addStaff(StaffMember staff) {
        if (staff == null || findById(staff.getStaffId()) != null) {
            throw new IllegalArgumentException("Staff member is null or has a duplicate staff ID");
        }
        tiers.putIfAbsent(staff.getSeniority(), new TreeSet<>());
        tiers.get(staff.getSeniority()).add(staff);
    }

    //  Pick the least-loaded staff member at or above "required", raise their load by 1, and return them.
    public StaffMember assign(Seniority required) {
        StaffMember leastLoaded = null;
        for (Seniority seniority : tiers.keySet()) {
            if (seniority.compareTo(required) >= 0) {
                TreeSet<StaffMember> tier = tiers.get(seniority);
                if (!tier.isEmpty()
                        && (leastLoaded == null
                        || tier.first().getCaseLoad() < leastLoaded.getCaseLoad())) {
                    leastLoaded = tier.first();
                }
            }
        }
        if (leastLoaded == null) {
            throw new NoSuchElementException("No staff member meets the required seniority");
        }
        changeLoad(leastLoaded, leastLoaded.getCaseLoad() + 1);
        return leastLoaded;
    }

    //  Lower the staff member's load by 1 (never below 0) and keep the tree ordered.
    public void release(StaffMember staff) {
        if (staff != null) {
            changeLoad(staff, staff.getCaseLoad() - 1);
        }
    }

    //  Return how many staff members are in the roster.
    public int size() {
        int total = 0;
        for (TreeSet<StaffMember> tier : tiers.values()) {
            total += tier.size();
        }
        return total;
    }

    // TODO: Print each tier, most senior first, listing its staff in order.
    public void displayRoster() {
        for (Seniority seniority : tiers.descendingKeySet()) {
            System.out.println(seniority + ":");
            for (StaffMember member : tiers.get(seniority)) {
                System.out.println("  " + member);
            }
        }
    }
    

    // TODO: Remove the member, set the new load, then add them back (the only safe way to change a load).
    private void changeLoad(StaffMember member, int newLoad) {
        if (member == null || newLoad < 0) {
            return;
        }
        for (TreeSet<StaffMember> tier : tiers.values()) {
            if (tier.remove(member)) {
                member.setCaseLoad(newLoad);
                tier.add(member);
                return;
            }
        }
    }

    // TODO: Call assign(), record the treatment in history with the chosen staffId, and return that staff member.
    public StaffMember assignTreatment(String patientID, String treatment, String timestamp, Seniority required) {
        if (patientID == null || treatment == null || timestamp == null) {
            return null;
        }
        StaffMember staff = assign(required);
        if (staff != null) {
            history.addTreatment(patientID, treatment, timestamp, staff.getStaffId());
        }
        return staff;
    }

    // TODO: Pop the globally most recent treatment with your Week 3 undo, release whoever performed it, and return them (null if none).
    public StaffMember undoLastAssignment() {
        TreatmentRecord record = history.undoLastAction();
        if (record == null) {
            return null;
        }
        StaffMember staff = findById(record.getPerformedBy());
        if (staff != null) {
            release(staff);
        }
        return staff;
    }

    public String displayHistory() {
        return history.displayHistory();
    }

    // TODO: Return the staff member with this staffId, or null if they are not in the roster.
    private StaffMember findById(String staffId) {
        if (staffId == null) {
            return null;
        }
        for (TreeSet<StaffMember> tier : tiers.values()) {
            for (StaffMember member : tier) {
                if (staffId.equals(member.getStaffId())) {
                    return member;
                }
            }
        }
        return null;
    }
}
