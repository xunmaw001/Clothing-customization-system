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
 * 服装定制
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
@TableName("fuzhuangdingzhi")
public class FuzhuangdingzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FuzhuangdingzhiEntity() {
		
	}
	
	public FuzhuangdingzhiEntity(T t) {
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
	 * 订单编号
	 */
					
	private String dingdanbianhao;
	
	/**
	 * 服装名称
	 */
					
	private String fuzhuangmingcheng;
	
	/**
	 * 面料
	 */
					
	private String mianliao;
	
	/**
	 * 服装颜色
	 */
					
	private String fuzhuangyanse;
	
	/**
	 * 尺码
	 */
					
	private String chima;
	
	/**
	 * 定制内容
	 */
					
	private String dingzhineirong;
	
	/**
	 * 定制价格
	 */
					
	private Float dingzhijiage;
	
	/**
	 * 定制数量
	 */
					
	private Integer dingzhishuliang;
	
	/**
	 * 总价格
	 */
					
	private Float zongjiage;
	
	/**
	 * 下单时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiadanshijian;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 邮寄地址
	 */
					
	private String youjidizhi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：订单编号
	 */
	public void setDingdanbianhao(String dingdanbianhao) {
		this.dingdanbianhao = dingdanbianhao;
	}
	/**
	 * 获取：订单编号
	 */
	public String getDingdanbianhao() {
		return dingdanbianhao;
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
	 * 设置：尺码
	 */
	public void setChima(String chima) {
		this.chima = chima;
	}
	/**
	 * 获取：尺码
	 */
	public String getChima() {
		return chima;
	}
	/**
	 * 设置：定制内容
	 */
	public void setDingzhineirong(String dingzhineirong) {
		this.dingzhineirong = dingzhineirong;
	}
	/**
	 * 获取：定制内容
	 */
	public String getDingzhineirong() {
		return dingzhineirong;
	}
	/**
	 * 设置：定制价格
	 */
	public void setDingzhijiage(Float dingzhijiage) {
		this.dingzhijiage = dingzhijiage;
	}
	/**
	 * 获取：定制价格
	 */
	public Float getDingzhijiage() {
		return dingzhijiage;
	}
	/**
	 * 设置：定制数量
	 */
	public void setDingzhishuliang(Integer dingzhishuliang) {
		this.dingzhishuliang = dingzhishuliang;
	}
	/**
	 * 获取：定制数量
	 */
	public Integer getDingzhishuliang() {
		return dingzhishuliang;
	}
	/**
	 * 设置：总价格
	 */
	public void setZongjiage(Float zongjiage) {
		this.zongjiage = zongjiage;
	}
	/**
	 * 获取：总价格
	 */
	public Float getZongjiage() {
		return zongjiage;
	}
	/**
	 * 设置：下单时间
	 */
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：邮寄地址
	 */
	public void setYoujidizhi(String youjidizhi) {
		this.youjidizhi = youjidizhi;
	}
	/**
	 * 获取：邮寄地址
	 */
	public String getYoujidizhi() {
		return youjidizhi;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
