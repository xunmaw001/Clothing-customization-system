package com.entity.model;

import com.entity.FuzhuangdingzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 服装定制
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-03 09:15:37
 */
public class FuzhuangdingzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
