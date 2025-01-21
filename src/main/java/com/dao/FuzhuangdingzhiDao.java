package com.dao;

import com.entity.FuzhuangdingzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangdingzhiVO;
import com.entity.view.FuzhuangdingzhiView;


/**
 * 服装定制
 * 
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangdingzhiDao extends BaseMapper<FuzhuangdingzhiEntity> {
	
	List<FuzhuangdingzhiVO> selectListVO(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
	
	FuzhuangdingzhiVO selectVO(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
	
	List<FuzhuangdingzhiView> selectListView(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);

	List<FuzhuangdingzhiView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
	
	FuzhuangdingzhiView selectView(@Param("ew") Wrapper<FuzhuangdingzhiEntity> wrapper);
	

}
