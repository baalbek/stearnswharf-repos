package stearnswharf.geometry;

import clojure.lang.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rcs on 25.04.15.
 *
 */
public class ProjectBean {
    private int oid;
    private String projectName;
    private Date createdDate;
    private Boolean selected;

    public ProjectBean() {
    }
    public ProjectBean(int oid,
                       String projectName,
                       Boolean selected) {
        this.oid = oid;
        this.projectName = projectName;
        this.selected = selected;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Boolean isSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }


    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    public LocalDate getCreatedLocalDate() {
        return createdDate.toLocalDate();
    }

    /*
    public String toHtml() {
        if (oid == -1) {
            return "-";
        }
        else {
            return String.format("%d - %s", oid, projectName);
        }
    }
    //*/

    public IPersistentMap asClojureMap()  {
        Map<Keyword,String> myMap = new HashMap<>();
        myMap.put(Keyword.intern("content"), this.toString());
        myMap.put(Keyword.intern("value"), String.format("%d",oid));
        return PersistentArrayMap.create(myMap);
    }

    public String toHtml(){
        if (oid == -1) {
            return "-";
        }
        else {
            LocalDate lb = createdDate.toLocalDate();
            return String.format("[%d] %s, %d-%d-%d", oid, projectName, lb.getYear(), lb.getMonthValue(), lb.getDayOfMonth());
        }
    }

}
