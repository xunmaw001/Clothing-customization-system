package com.entity.view;

import com.entity.FuzhuangdingzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装定制
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
@TableName("fuzhuangdingzhi")
public class FuzhuangdingzhiView  extends FuzhuangdingzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangdingzhiView(){
	}
 
 	public FuzhuangdingzhiView(FuzhuangdingzhiEntity fuzhuangdingzhiEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangdingzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
