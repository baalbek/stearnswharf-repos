package stearnswharf.elements;

/**
 * Created by rcs on 26.05.15.
 *
 */
public class WoodElement {
    // oid | sys_id | n1  | n2  | st_class_id | w  |  h  | status
    private int oid;
    private int sysId;
    private int n1;
    private int n2;
    private int stClass;
    private int w;
    private int h;
    private int loadId;
    private int status = 0;

    public ElementLoad createElementLoad() {
        return new ElementLoad(oid,loadId);
    }

    public boolean hasElementLoad() {
        return loadId > 0;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getStClass() {
        return stClass;
    }

    public void setStClass(int stClass) {
        this.stClass = stClass;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }
}
