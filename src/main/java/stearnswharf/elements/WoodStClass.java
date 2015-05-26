package stearnswharf.elements;

/**
 * Created by rcs on 26.05.15.
 *
 */
public class WoodStClass {

    private int oid;
    private String stClassName;
    private double fmk;
    private double fvk;
    private double e0mean;
    private double ft0k;
    private double ft90k;
    private double fc0k;
    private double fc90k;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getStClassName() {
        return stClassName;
    }

    public void setStClassName(String stClassName) {
        this.stClassName = stClassName;
    }

    public double getFmk() {
        return fmk;
    }

    public void setFmk(double fmk) {
        this.fmk = fmk;
    }

    public double getFvk() {
        return fvk;
    }

    public void setFvk(double fvk) {
        this.fvk = fvk;
    }

    public double getE0mean() {
        return e0mean;
    }

    public void setE0mean(double e0mean) {
        this.e0mean = e0mean;
    }

    public double getFt0k() {
        return ft0k;
    }

    public void setFt0k(double ft0k) {
        this.ft0k = ft0k;
    }

    public double getFt90k() {
        return ft90k;
    }

    public void setFt90k(double ft90k) {
        this.ft90k = ft90k;
    }

    public double getFc0k() {
        return fc0k;
    }

    public void setFc0k(double fc0k) {
        this.fc0k = fc0k;
    }

    public double getFc90k() {
        return fc90k;
    }

    public void setFc90k(double fc90k) {
        this.fc90k = fc90k;
    }

    public String toHtml() {
        return String.format("[ %s ] %s",oid,stClassName);
    }
}
