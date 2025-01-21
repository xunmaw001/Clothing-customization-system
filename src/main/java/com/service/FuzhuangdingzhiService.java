package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangdingzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangdingzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangdingzhiView;


/**
 * 服装定制
 *
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangdingzhiService extends IService<FuzhuangdingzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangdingzhiVO> selectListVO(Wrapper<FuzhuangdingzhiEntity> wrapper);
   	
   	FuzhuangdingzhiVO selectVO(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
   	
   	List<FuzhuangdingzhiView> selectListView(Wrapper<FuzhuangdingzhiEntity> wrapper);
   	
   	FuzhuangdingzhiView selectView(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangdingzhiEntity> wrapper);
   	

}

