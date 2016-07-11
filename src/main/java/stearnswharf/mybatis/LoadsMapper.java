package stearnswharf.mybatis;

import stearnswharf.materials.LoadBean;

import java.util.List;

/**
 * Created by rcs on 10.05.15.
 *
 */
public interface LoadsMapper {
    List<LoadBean> fetchVinapuDeadLoads();
    List<LoadBean> fetchVinapuLiveLoads();
}
