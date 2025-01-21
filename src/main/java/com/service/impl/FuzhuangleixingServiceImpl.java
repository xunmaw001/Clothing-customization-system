package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FuzhuangleixingDao;
import com.entity.FuzhuangleixingEntity;
import com.service.FuzhuangleixingService;
import com.entity.vo.FuzhuangleixingVO;
import com.entity.view.FuzhuangleixingView;

@Service("fuzhuangleixingService")
public class FuzhuangleixingServiceImpl extends ServiceImpl<FuzhuangleixingDao, FuzhuangleixingEntity> implements FuzhuangleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangleixingEntity> page = this.selectPage(
                new Query<FuzhuangleixingEntity>(params).getPage(),
                new EntityWrapper<FuzhuangleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangleixingEntity> wrapper) {
		  Page<FuzhuangleixingView> page =new Query<FuzhuangleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangleixingVO> selectListVO(Wrapper<FuzhuangleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangleixingVO selectVO(Wrapper<FuzhuangleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangleixingView> selectListView(Wrapper<FuzhuangleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangleixingView selectView(Wrapper<FuzhuangleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
