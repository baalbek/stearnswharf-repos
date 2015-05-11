package stearnswharf.nodes;


public class NodeBean {
    private int oid;
    private int projectId; 
    private int coordSys; 
    private double x;
    private double y;
    private double z;
    private int dofX;
    private int dofZ;
    private int dofM;
    private String dsc;

    public int getOid() {
        return oid;
    }
    public void setOid(int value) {
        oid = value;
    }

    public int getProjectId() {
        return projectId;
    }
    public void setProjectId(int value) {
        projectId = value;
    }

    public int getCoordSys() {
        return coordSys;
    }
    public void setCoordSys(int value) {
        coordSys = value;
    }

    public String getDsc() {
        return dsc;
    }
    public void setDsc(String value) {
        dsc = value;
    }

    public String toHtml() {
        return String.format("[ %d ] %s", oid, dsc);
    }
}
