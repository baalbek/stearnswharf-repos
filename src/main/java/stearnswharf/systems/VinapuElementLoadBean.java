package stearnswharf.systems;

/**
 * Created by rcs on 01.05.15.
 *
 */
public class VinapuElementLoadBean {
    private int elementId;
    private int loadId;
    private double formFactor;

    public VinapuElementLoadBean() {
    }

    public VinapuElementLoadBean(int elementId,
                                 int loadId,
                                 double formFactor) {
        this.elementId = elementId;
        this.loadId = loadId;
        this.formFactor = formFactor;
    }

    public int getElementId () {
        return elementId;
    }

    public void setElementId (int elementId) {
        this.elementId = elementId;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    public double getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(double formFactor) {
        this.formFactor = formFactor;
    }
}
