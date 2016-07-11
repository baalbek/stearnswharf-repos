package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import java.util.List;

import stearnswharf.elements.*;
import stearnswharf.materials.SteelBeam;

public interface ElementsMapper {
    /*
    List<NodeBean> fetchAllNodes(@Param("pid") int projectId);

    List<NodeBean> fetchNodes(@Param("pid") int projectId,
                              @Param("cosyid") int coordSysId);
    List<Integer> fetchCoordSys(@Param("pid") int projectId);
    */

    //List<WoodElement> fetchWoodStClass();
    List<WoodStClass> fetchWoodStClass();
    List<SteelBeam> fetchSteelBeams();
    List<SteelElement> fetchSteelElements(@Param("sysid") int sysId);
    void newDistLoad(DistLoad load);
    List<DistLoad> fetchDistLoads(@Param("sysid") int sysId);
    void newSteelElement(SteelElement element);
    void newSteelElementLoad(ElementLoad load);
    void newNodeLoad(NodeLoad load);
    void newWoodElement(WoodElement element);
    void newWoodElementLoad(ElementLoad load);
}
