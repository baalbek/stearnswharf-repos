package stearnswharf.geometry;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by rcs on 09.05.15.
 *
 */
public class SystemBean {
    private int oid;
    private int locationId;
    private String systemName;
    private Date createdDate;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String toHtml() {
        if (oid == -1) {
            return "-";
        }
        else {
            LocalDate lb = createdDate.toLocalDate();
            return String.format("[%d] %s, %d-%d-%d", oid, systemName, lb.getYear(), lb.getMonthValue(), lb.getDayOfMonth());
        }
    }
}
