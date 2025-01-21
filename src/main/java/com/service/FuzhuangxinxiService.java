package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzhuangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuzhuangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuzhuangxinxiView;


/**
 * 服装信息
 *
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangxinxiService extends IService<FuzhuangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuzhuangxinxiVO> selectListVO(Wrapper<FuzhuangxinxiEntity> wrapper);
   	
   	FuzhuangxinxiVO selectVO(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
   	
   	List<FuzhuangxinxiView> selectListView(Wrapper<FuzhuangxinxiEntity> wrapper);
   	
   	FuzhuangxinxiView selectView(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuzhuangxinxiEntity> wrapper);
   	

}

