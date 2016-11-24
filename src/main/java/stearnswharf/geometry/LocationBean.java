package stearnswharf.geometry;

/**
 * Created by rcs on 25.04.15.
 *
 */
public class LocationBean {
    private int oid;
    private int projectId;
    private String locationName;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String toHtml() {
        if (oid == -1) {
            return "-";
        }
        else {
            return String.format("[%d] %s (project id: %d)", oid, locationName, projectId);
        }
    }
}
