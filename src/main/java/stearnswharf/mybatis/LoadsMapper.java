package stearnswharf.mybatis;

import stearnswharf.loads.VinapuLoadBean;

import java.util.List;

/**
 * Created by rcs on 10.05.15.
 *
 */
public interface LoadsMapper {
    List<VinapuLoadBean> fetchVinapuDeadLoads();
    List<VinapuLoadBean> fetchVinapuLiveLoads();
}
