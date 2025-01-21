package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangleixingView;


/**
 * 服装类型
 *
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangleixingService extends IService<FuzhuangleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangleixingVO> selectListVO(Wrapper<FuzhuangleixingEntity> wrapper);
   	
   	FuzhuangleixingVO selectVO(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
   	
   	List<FuzhuangleixingView> selectListView(Wrapper<FuzhuangleixingEntity> wrapper);
   	
   	FuzhuangleixingView selectView(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangleixingEntity> wrapper);
   	

}

