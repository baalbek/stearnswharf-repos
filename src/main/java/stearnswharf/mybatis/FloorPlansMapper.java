package stearnswharf.mybatis;

import org.apache.ibatis.annotations.Param;
import stearnswharf.systems.BuildingBean;
import stearnswharf.systems.FloorPlanBean;
import stearnswharf.systems.ProjectBean;

import java.util.List;

public interface FloorPlansMapper {
    List<ProjectBean> fetchProjects();
    List<BuildingBean> fetchBuildings(@Param("pid") int projectId);
    List<FloorPlanBean> fetchFloorPlans(@Param("bid") int buildingId);
    List<FloorPlanBean> fetchFloorPlanSystems(@Param("bid") int buildingId,
                                              @Param("fid") int floorPlanId);
    void newSystem(FloorPlanBean floorPlan);
    void addToFloorPlans(FloorPlanBean floorPlan);
}
