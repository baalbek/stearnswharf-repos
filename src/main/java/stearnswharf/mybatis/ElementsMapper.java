package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import java.util.List;

import stearnswharf.elements.DistLoad;
import stearnswharf.elements.SteelBeam;

public interface ElementsMapper {
    /*
    List<NodeBean> fetchAllNodes(@Param("pid") int projectId);

    List<NodeBean> fetchNodes(@Param("pid") int projectId,
                              @Param("cosyid") int coordSysId);
    List<Integer> fetchCoordSys(@Param("pid") int projectId);
    */

    List<SteelBeam> fetchSteelBeams();
    void newDistLoad(DistLoad load);
}
