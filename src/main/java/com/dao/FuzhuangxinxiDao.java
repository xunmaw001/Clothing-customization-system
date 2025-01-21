package com.dao;

import com.entity.FuzhuangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangxinxiVO;
import com.entity.view.FuzhuangxinxiView;


/**
 * 服装信息
 * 
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangxinxiDao extends BaseMapper<FuzhuangxinxiEntity> {
	
	List<FuzhuangxinxiVO> selectListVO(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
	
	FuzhuangxinxiVO selectVO(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
	
	List<FuzhuangxinxiView> selectListView(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);

	List<FuzhuangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
	
	FuzhuangxinxiView selectView(@Param("ew") Wrapper<FuzhuangxinxiEntity> wrapper);
	

}
