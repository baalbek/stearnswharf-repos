package stearnswharf.loads;

/**
 * Created by rcs on 10.05.15.
 *
 */
public class VinapuLoadBean {
    private int oid;
    private String dsc;
    private double loadFactor;
    private int loadCategory;
    private double q;

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

    public double getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(double loadFactor) {
        this.loadFactor = loadFactor;
    }

    public int getLoadCategory() {
        return loadCategory;
    }

    public void setLoadCategory(int loadCategory) {
        this.loadCategory = loadCategory;
    }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public String toHtml() {
        String lcatStr = loadCategory == 1 ? "Egenlast" : "Nyttelast";
        return String.format("[ %d ] [ %s ] - %s", oid, lcatStr, dsc);
    }
}
