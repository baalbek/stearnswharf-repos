package stearnswharf.mybatis.geometry;

import stearnswharf.geometry.ProjectBean;

import java.util.List;

public interface ProjectsMapper {
    List<ProjectBean> fetchProjects();
    void insertProject(ProjectBean project);

    /*
    List<LocationBean> fetchLocations(@Param("pid") int projectId);
    List<FloorPlanBean> fetchFloorPlans(@Param("bid") int buildingId);
    List<FloorPlanBean> fetchFloorPlanSystems(@Param("bid") int buildingId,
                                              @Param("fid") int floorPlanId);
    void newSystem(SystemBean sys);
    void addToFloorPlans(SystemBean sys);
    void newVinapuElement(ElementLoadBean v);
    void newVinapuElementLoad(VinapuElementLoadBean load);
                                              */
}
