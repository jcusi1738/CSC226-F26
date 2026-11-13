package staff_assignment;

public class StaffMember implements Comparable<StaffMember> {
    private final String staffId;
    private final String name;
    private final Seniority seniority;
    private int caseLoad;

    public StaffMember(String staffId, String name, Seniority seniority) {
        this.staffId = staffId;
        this.name = name;
        this.seniority = seniority;
        this.caseLoad = 0;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public Seniority getSeniority() {
        return seniority;
    }

    public int getCaseLoad() {
        return caseLoad;
    }

    // Package-private so only StaffRoster can change the load (see "Updating a Load" in the assignment).
    void setCaseLoad(int caseLoad) {
        this.caseLoad = caseLoad;
    }

    // TODO: Order by caseLoad (lowest first), then by staffId to break ties.
    @Override
    public int compareTo(StaffMember other) {
        int loadOrder = Integer.compare(caseLoad, other.caseLoad);
        return loadOrder != 0 ? loadOrder : staffId.compareTo(other.staffId);
    }

    @Override
    public String toString() {
        return name + " (" + staffId + ", " + seniority + ", load " + caseLoad + ")";
    }
}
