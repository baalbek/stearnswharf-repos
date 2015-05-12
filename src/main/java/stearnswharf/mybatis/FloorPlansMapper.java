package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import stearnswharf.systems.*;

import java.util.List;

public interface FloorPlansMapper {
    List<ProjectBean> fetchProjects();
    List<BuildingBean> fetchBuildings(@Param("pid") int projectId);
    List<FloorPlanBean> fetchFloorPlans(@Param("bid") int buildingId);
    List<FloorPlanBean> fetchFloorPlanSystems(@Param("bid") int buildingId,
                                              @Param("fid") int floorPlanId);
    void newSystem(SystemBean sys);
    void addToFloorPlans(SystemBean sys);
    void newVinapuElement(VinapuElementBean v);
}
