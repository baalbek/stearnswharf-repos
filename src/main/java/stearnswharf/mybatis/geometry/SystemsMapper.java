package stearnswharf.mybatis.geometry;

import org.apache.ibatis.annotations.Param;
import stearnswharf.geometry.SystemBean;

import java.util.List;

/**
 * Created by rcs on 11.07.16.
 *
 */
public interface SystemsMapper {
    List<SystemBean> fetchSystems(@Param("locId") int locationId);
    void insertSystem(SystemBean systemBean);

}
