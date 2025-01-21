package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 服装信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
@TableName("fuzhuangxinxi")
public class FuzhuangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuzhuangxinxiEntity() {
		
	}
	
	public FuzhuangxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 服装名称
	 */
					
	private String fuzhuangmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：服装名称
	 */
	public void setFuzhuangmingcheng(String fuzhuangmingcheng) {
		this.fuzhuangmingcheng = fuzhuangmingcheng;
	}
	/**
	 * 获取：服装名称
	 */
	public String getFuzhuangmingcheng() {
		return fuzhuangmingcheng;
	}
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
