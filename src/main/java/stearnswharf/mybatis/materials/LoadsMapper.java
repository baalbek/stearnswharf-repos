package stearnswharf.mybatis.materials;

import stearnswharf.materials.LoadBean;

import java.util.List;

/**
 *
 * Created by rcs on 18.12.16.
 */

public interface LoadsMapper {
    List<LoadBean> fetchLoads();
}
