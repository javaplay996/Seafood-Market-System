package com.entity.view;

import com.entity.MiaoshashangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 秒杀商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-08 09:39:22
 */
@TableName("miaoshashangpin")
public class MiaoshashangpinView  extends MiaoshashangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MiaoshashangpinView(){
	}
 
 	public MiaoshashangpinView(MiaoshashangpinEntity miaoshashangpinEntity){
 	try {
			BeanUtils.copyProperties(this, miaoshashangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
