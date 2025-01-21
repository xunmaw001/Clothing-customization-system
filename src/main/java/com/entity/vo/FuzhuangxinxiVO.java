package com.entity.vo;

import com.entity.FuzhuangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 服装信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public class FuzhuangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 服装类型
	 */
	
	private String fuzhuangleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 服装颜色
	 */
	
	private String fuzhuangyanse;
		
	/**
	 * 面料
	 */
	
	private String mianliao;
		
	/**
	 * 定制价格
	 */
	
	private Integer dingzhijiage;
		
	/**
	 * 样品介绍
	 */
	
	private String yangpinjieshao;
				
	
	/**
	 * 设置：服装类型
	 */
	 
	public void setFuzhuangleixing(String fuzhuangleixing) {
		this.fuzhuangleixing = fuzhuangleixing;
	}
	
	/**
	 * 获取：服装类型
	 */
	public String getFuzhuangleixing() {
		return fuzhuangleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：服装颜色
	 */
	 
	public void setFuzhuangyanse(String fuzhuangyanse) {
		this.fuzhuangyanse = fuzhuangyanse;
	}
	
	/**
	 * 获取：服装颜色
	 */
	public String getFuzhuangyanse() {
		return fuzhuangyanse;
	}
				
	
	/**
	 * 设置：面料
	 */
	 
	public void setMianliao(String mianliao) {
		this.mianliao = mianliao;
	}
	
	/**
	 * 获取：面料
	 */
	public String getMianliao() {
		return mianliao;
	}
				
	
	/**
	 * 设置：定制价格
	 */
	 
	public void setDingzhijiage(Integer dingzhijiage) {
		this.dingzhijiage = dingzhijiage;
	}
	
	/**
	 * 获取：定制价格
	 */
	public Integer getDingzhijiage() {
		return dingzhijiage;
	}
				
	
	/**
	 * 设置：样品介绍
	 */
	 
	public void setYangpinjieshao(String yangpinjieshao) {
		this.yangpinjieshao = yangpinjieshao;
	}
	
	/**
	 * 获取：样品介绍
	 */
	public String getYangpinjieshao() {
		return yangpinjieshao;
	}
			
}
