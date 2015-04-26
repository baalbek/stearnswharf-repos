package stearnswharf.systems;

/**
 * Created by rcs on 25.04.15.
 *
 */
public class ProjectBean {
    private int oid;
    private String projectName;
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

    public String toHtml() {
        if (oid == -1) {
            return "-";
        }
        else {
            return String.format("%d - %s", oid, projectName);
        }
    }
}
