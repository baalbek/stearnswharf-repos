package stearnswharf.elements;

/**
 * Created by rcs on 21.05.15.
 *
 */
public class SteelElementLoad {
    private int loadCase;
    private int elementId;
    private int loadId;

    public SteelElementLoad() {
    }

    public SteelElementLoad(int elementId, 
                            int loadId) {
        this.loadCase = 1;
        this.elementId = elementId;
        this.loadId = loadId;
    }

    public int getLoadCase() {
        return loadCase;
    }

    public void setLoadCase(int loadCase) {
        this.loadCase = loadCase;
    }

    public int getElementId() {
        return elementId;
    }

    public void setElementId(int elementId) {
        this.elementId = elementId;
    }

    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }
}
