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


import com.dao.FuzhuangdingzhiDao;
import com.entity.FuzhuangdingzhiEntity;
import com.service.FuzhuangdingzhiService;
import com.entity.vo.FuzhuangdingzhiVO;
import com.entity.view.FuzhuangdingzhiView;

@Service("fuzhuangdingzhiService")
public class FuzhuangdingzhiServiceImpl extends ServiceImpl<FuzhuangdingzhiDao, FuzhuangdingzhiEntity> implements FuzhuangdingzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangdingzhiEntity> page = this.selectPage(
                new Query<FuzhuangdingzhiEntity>(params).getPage(),
                new EntityWrapper<FuzhuangdingzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangdingzhiEntity> wrapper) {
		  Page<FuzhuangdingzhiView> page =new Query<FuzhuangdingzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangdingzhiVO> selectListVO(Wrapper<FuzhuangdingzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangdingzhiVO selectVO(Wrapper<FuzhuangdingzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangdingzhiView> selectListView(Wrapper<FuzhuangdingzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangdingzhiView selectView(Wrapper<FuzhuangdingzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
