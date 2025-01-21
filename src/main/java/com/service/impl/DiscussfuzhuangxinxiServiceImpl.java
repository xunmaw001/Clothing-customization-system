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


import com.dao.DiscussfuzhuangxinxiDao;
import com.entity.DiscussfuzhuangxinxiEntity;
import com.service.DiscussfuzhuangxinxiService;
import com.entity.vo.DiscussfuzhuangxinxiVO;
import com.entity.view.DiscussfuzhuangxinxiView;

@Service("discussfuzhuangxinxiService")
public class DiscussfuzhuangxinxiServiceImpl extends ServiceImpl<DiscussfuzhuangxinxiDao, DiscussfuzhuangxinxiEntity> implements DiscussfuzhuangxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfuzhuangxinxiEntity> page = this.selectPage(
                new Query<DiscussfuzhuangxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussfuzhuangxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfuzhuangxinxiEntity> wrapper) {
		  Page<DiscussfuzhuangxinxiView> page =new Query<DiscussfuzhuangxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfuzhuangxinxiVO> selectListVO(Wrapper<DiscussfuzhuangxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfuzhuangxinxiVO selectVO(Wrapper<DiscussfuzhuangxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfuzhuangxinxiView> selectListView(Wrapper<DiscussfuzhuangxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfuzhuangxinxiView selectView(Wrapper<DiscussfuzhuangxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
