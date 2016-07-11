package stearnswharf.materials;

public class SteelBeam {
    private int oid;
    private String name;

    //--------------------- oid -------------------
    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    //--------------------- name -------------------
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public String toHtml() {
        return String.format("[ %d ] %s",oid,name);
    }
}

