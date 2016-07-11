package vinapu.elements;

/**
 * Created by rcs on 01.05.15.
 *
 */
public class VinapuElementBean {
    private int oid;
    private int systemId;
    private int n1;
    private String n1dsc;
    private int n2;
    private String n2dsc;
    private Integer wnode = null;
    private double plw;
    private double w1;
    private Double w2;
    private double angle;
    private int loadId;
    private String loadDsc;
    private double loadFactor;
    private double formFactor;
    private int loadCategory;
    private double loadQ;
    private double serviceLimit;
    private double ultimateLimit;
    private String dsc;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
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

    public double getPlw() {
        return plw;
    }

    public void setPlw(double plw) {
        this.plw = plw;
    }

    public double getW1() {
        return w1;
    }

    public void setW1(double w1) {
        this.w1 = w1;
    }

    public Double getW2() {
        return w2;
    }

    public void setW2(Double w2) {
        this.w2 = w2;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public String getLoadDsc() {
        return loadDsc;
    }

    public void setLoadDsc(String loadDsc) {
        this.loadDsc = loadDsc;
    }

    public double getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(double loadFactor) {
        this.loadFactor = loadFactor;
    }

    public double getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(double formFactor) {
        this.formFactor = formFactor;
    }

    public int getLoadCategory() {
        return loadCategory;
    }

    public void setLoadCategory(int loadCategory) {
        this.loadCategory = loadCategory;
    }

    public double getLoadQ() {
        return loadQ;
    }

    public void setLoadQ(double loadQ) {
        this.loadQ = loadQ;
    }

    public double getServiceLimit() {
        return serviceLimit;
    }

    public void setServiceLimit(double serviceLimit) {
        this.serviceLimit = serviceLimit;
    }

    public double getUltimateLimit() {
        return ultimateLimit;
    }

    public void setUltimateLimit(double ultimateLimit) {
        this.ultimateLimit = ultimateLimit;
    }

    public Integer getWnode() {
        return wnode;
    }

    public void setWnode(Integer wnode) {
        this.wnode = wnode;
    }

    public String getN1dsc() {
        return n1dsc;
    }

    public void setN1dsc(String n1dsc) {
        this.n1dsc = n1dsc;
    }

    public String getN2dsc() {
        return n2dsc;
    }

    public void setN2dsc(String n2dsc) {
        this.n2dsc = n2dsc;
    }

    public int getSystemId() {
        return systemId;
    }

    public void setSystemId(int systemId) {
        this.systemId = systemId;
    }
}
