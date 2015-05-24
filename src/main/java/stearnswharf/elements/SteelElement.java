package stearnswharf.elements;

public class SteelElement {
    //oid | sys_id | n1 | n2 | profile_id | status
    private int oid;
    private int sysId;
    private int n1;
    private int n2;
    private int profileId;
    private int loadId;
    private int status;

    public SteelElementLoad createElementLoad() {
        return new  SteelElementLoad(oid,loadId);
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

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public String toHtml() {
        return String.format("[ %d ] sys id: %d, profile id: %d", oid, sysId, profileId);
    }
}
