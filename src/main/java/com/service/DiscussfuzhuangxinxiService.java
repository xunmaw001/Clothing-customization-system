package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfuzhuangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfuzhuangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfuzhuangxinxiView;


/**
 * 服装信息评论表
 *
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface DiscussfuzhuangxinxiService extends IService<DiscussfuzhuangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfuzhuangxinxiVO> selectListVO(Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
   	
   	DiscussfuzhuangxinxiVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
   	
   	List<DiscussfuzhuangxinxiView> selectListView(Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
   	
   	DiscussfuzhuangxinxiView selectView(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
   	

}

