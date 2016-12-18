package stearnswharf.materials;

/**
 * Created by rcs on 10.05.15.
 *
 */
public class LoadBean {
    private int oid;
    private String dsc;
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
        return String.format("[ %d ] [ %s ] - %s - %.2f", oid, lcatStr, dsc, q);
    }
}
