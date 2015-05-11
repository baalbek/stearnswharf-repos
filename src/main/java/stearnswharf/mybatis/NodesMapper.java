package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import stearnswharf.nodes.NodeBean;

public interface NodesMapper {
    List<NodeBean> fetchAllNodes(@Param("pid") int projectId);

    List<NodeBean> fetchNodes(@Param("pid") int projectId,
                              @Param("cosyid") int coordSysId);
    List<Integer> fetchCoordSys(@Param("pid") int projectId);

}
