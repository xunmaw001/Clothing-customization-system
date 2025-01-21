package com.dao;

import com.entity.FuzhuangleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuzhuangleixingVO;
import com.entity.view.FuzhuangleixingView;


/**
 * 服装类型
 * 
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public interface FuzhuangleixingDao extends BaseMapper<FuzhuangleixingEntity> {
	
	List<FuzhuangleixingVO> selectListVO(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
	
	FuzhuangleixingVO selectVO(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
	
	List<FuzhuangleixingView> selectListView(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);

	List<FuzhuangleixingView> selectListView(Pagination page,@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
	
	FuzhuangleixingView selectView(@Param("ew") Wrapper<FuzhuangleixingEntity> wrapper);
	

}
