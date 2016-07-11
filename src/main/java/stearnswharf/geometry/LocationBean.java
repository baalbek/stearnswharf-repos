package stearnswharf.geometry;

/**
 * Created by rcs on 25.04.15.
 *
 */
public class LocationBean {
    private int oid;
    private String description;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toHtml() {
        if (oid == -1) {
            return "-";
        }
        else {
            return String.format("%d - %s", oid, description);
        }
    }
}
