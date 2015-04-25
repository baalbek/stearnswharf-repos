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
}
