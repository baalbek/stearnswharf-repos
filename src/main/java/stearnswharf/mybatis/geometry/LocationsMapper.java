package stearnswharf.mybatis.geometry;

import org.apache.ibatis.annotations.Param;
import stearnswharf.geometry.LocationBean;

import java.util.List;

/**
 * Created by rcs on 11.07.16.
 *
 */
public interface LocationsMapper {
    List<LocationBean> fetchLocations(@Param("projectId") int projectId);
}
