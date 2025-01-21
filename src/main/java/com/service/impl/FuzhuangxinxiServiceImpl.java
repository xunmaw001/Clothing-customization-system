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


import com.dao.FuzhuangxinxiDao;
import com.entity.FuzhuangxinxiEntity;
import com.service.FuzhuangxinxiService;
import com.entity.vo.FuzhuangxinxiVO;
import com.entity.view.FuzhuangxinxiView;

@Service("fuzhuangxinxiService")
public class FuzhuangxinxiServiceImpl extends ServiceImpl<FuzhuangxinxiDao, FuzhuangxinxiEntity> implements FuzhuangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuzhuangxinxiEntity> page = this.selectPage(
                new Query<FuzhuangxinxiEntity>(params).getPage(),
                new EntityWrapper<FuzhuangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuzhuangxinxiEntity> wrapper) {
		  Page<FuzhuangxinxiView> page =new Query<FuzhuangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuzhuangxinxiVO> selectListVO(Wrapper<FuzhuangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuzhuangxinxiVO selectVO(Wrapper<FuzhuangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuzhuangxinxiView> selectListView(Wrapper<FuzhuangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuzhuangxinxiView selectView(Wrapper<FuzhuangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
