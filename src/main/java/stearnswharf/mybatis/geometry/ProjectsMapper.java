package stearnswharf.mybatis.geometry;

import org.apache.ibatis.annotations.Param;
import stearnswharf.geometry.LocationBean;
import stearnswharf.geometry.ProjectBean;
import stearnswharf.geometry.SystemBean;
import vinapu.elements.VinapuElementBean;
import vinapu.elements.VinapuElementLoadBean;

import java.util.List;

public interface ProjectsMapper {
    List<ProjectBean> fetchProjects();
    /*
    List<LocationBean> fetchLocations(@Param("pid") int projectId);
    List<FloorPlanBean> fetchFloorPlans(@Param("bid") int buildingId);
    List<FloorPlanBean> fetchFloorPlanSystems(@Param("bid") int buildingId,
                                              @Param("fid") int floorPlanId);
    void newSystem(SystemBean sys);
    void addToFloorPlans(SystemBean sys);
    void newVinapuElement(VinapuElementBean v);
    void newVinapuElementLoad(VinapuElementLoadBean load);
                                              */
}
