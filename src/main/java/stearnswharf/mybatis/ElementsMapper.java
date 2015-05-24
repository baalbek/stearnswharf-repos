package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import java.util.List;

import stearnswharf.elements.*;

public interface ElementsMapper {
    /*
    List<NodeBean> fetchAllNodes(@Param("pid") int projectId);

    List<NodeBean> fetchNodes(@Param("pid") int projectId,
                              @Param("cosyid") int coordSysId);
    List<Integer> fetchCoordSys(@Param("pid") int projectId);
    */

    List<SteelBeam> fetchSteelBeams();
    void newDistLoad(DistLoad load);
    List<DistLoad> fetchDistLoads(@Param("sysid") int sysId);
    void newSteelElement(SteelElement element);
    void newSteelElementLoad(SteelElementLoad load);
    void newNodeLoad(NodeLoad load);
}
