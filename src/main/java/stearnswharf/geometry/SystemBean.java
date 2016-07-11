package stearnswharf.geometry;

/**
 * Created by rcs on 09.05.15.
 *
 */
public class SystemBean {
    private int oid;
    private int projectId;
    private int buildingId;
    private int floorPlan;
    private String sd;
    private int groupId;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(int floorPlan) {
        this.floorPlan = floorPlan;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
