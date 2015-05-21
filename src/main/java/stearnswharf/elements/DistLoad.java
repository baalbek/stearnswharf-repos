package stearnswharf.elements;

/**
 * Created by rcs on 20.05.15.
 *
 */
public class DistLoad {
    private int oid;
    private int sysId;
    private double qx1;
    private double qx2;
    private double qy1;
    private double qy2;
    private double qz1;
    private double qz2;
    private double loadFactor;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public double getQx1() {
        return qx1;
    }

    public void setQx1(double qx1) {
        this.qx1 = qx1;
    }

    public double getQx2() {
        return qx2;
    }

    public void setQx2(double qx2) {
        this.qx2 = qx2;
    }

    public double getQy1() {
        return qy1;
    }

    public void setQy1(double qy1) {
        this.qy1 = qy1;
    }

    public double getQy2() {
        return qy2;
    }

    public void setQy2(double qy2) {
        this.qy2 = qy2;
    }

    public double getQz1() {
        return qz1;
    }

    public void setQz1(double qz1) {
        this.qz1 = qz1;
    }

    public double getQz2() {
        return qz2;
    }

    public void setQz2(double qz2) {
        this.qz2 = qz2;
    }

    public double getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(double loadFactor) {
        this.loadFactor = loadFactor;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public String toHtml() {
        return String.format("[ %d ] x: %.1f/%.1f, y: %.1f/%.1f, z: %.1f/%.1f, lf: %.2f",
                oid,
                qx1,
                qx2,
                qy1,
                qy2,
                qz1,
                qz2,
                loadFactor);
    }

}
