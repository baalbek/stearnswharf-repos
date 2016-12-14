package stearnswharf.geometry;


public class NodeBean {
    private int oid;
    private int locationId;
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

    public String getDsc() {
        return dsc;
    }
    public void setDsc(String value) {
        dsc = value;
    }

    public String toHtml() {
        return String.format("[%d] %s (location id: %d)", oid, dsc, locationId);
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getDofX() {
        return dofX;
    }

    public void setDofX(int dofX) {
        this.dofX = dofX;
    }

    public int getDofM() {
        return dofM;
    }

    public void setDofM(int dofM) {
        this.dofM = dofM;
    }

    public int getDofZ() {
        return dofZ;
    }

    public void setDofZ(int dofZ) {
        this.dofZ = dofZ;
    }
}
