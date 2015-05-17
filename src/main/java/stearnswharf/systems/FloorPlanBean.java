package stearnswharf.systems;

import java.util.List;

public class FloorPlanBean {
    private int projectId;
    private int systemId;
    private int buildingId;
    private int groupId;
    private int floorPlan;
    private String buildingDsc;
    private String systemDsc;
    private List<VinapuElementBean> vinapuElements;

    public int getOid() {
        return systemId;
    }
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }


    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(int floorPlan) {
        this.floorPlan = floorPlan;
    }

    public String getBuildingDsc() {
        return buildingDsc;
    }

    public void setBuildingDsc(String buildingDsc) {
        this.buildingDsc = buildingDsc;
    }

    public String getSystemDsc() {
        return systemDsc;
    }

    public void setSystemDsc(String systemDsc) {
        this.systemDsc = systemDsc;
    }

    public List<VinapuElementBean> getVinapuElements() {
        return vinapuElements;
    }

    public void setVinapuElements(List<VinapuElementBean> vinapuElements) { this.vinapuElements = vinapuElements; }

    public String toHtml() {
        return String.format("[ %d ] %s",systemId, systemDsc);
    }
}
