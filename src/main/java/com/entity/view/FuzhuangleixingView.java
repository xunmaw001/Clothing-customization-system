package com.entity.view;

import com.entity.FuzhuangleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 服装类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
@TableName("fuzhuangleixing")
public class FuzhuangleixingView  extends FuzhuangleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuzhuangleixingView(){
	}
 
 	public FuzhuangleixingView(FuzhuangleixingEntity fuzhuangleixingEntity){
 	try {
			BeanUtils.copyProperties(this, fuzhuangleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
