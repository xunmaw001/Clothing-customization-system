package com.dao;

import com.entity.DiscussfuzhuangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfuzhuangxinxiVO;
import com.entity.view.DiscussfuzhuangxinxiView;


/**
 * 服装信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface DiscussfuzhuangxinxiDao extends BaseMapper<DiscussfuzhuangxinxiEntity> {
	
	List<DiscussfuzhuangxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
	
	DiscussfuzhuangxinxiVO selectVO(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
	
	List<DiscussfuzhuangxinxiView> selectListView(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);

	List<DiscussfuzhuangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
	
	DiscussfuzhuangxinxiView selectView(@Param("ew") Wrapper<DiscussfuzhuangxinxiEntity> wrapper);
	

}
