package stearnswharf.mybatis.vinapu;

import org.apache.ibatis.annotations.Param;
import stearnswharf.vinapu.elements.ElementLoadBean;

import java.util.List;

/**
 *
 * Created by rcs on 13.07.16.
 */
public interface ElementsMapper {
    List<ElementLoadBean> fetchElementLoads(@Param("sysId") int sysId);
}
