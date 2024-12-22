package com.entity.view;

import com.entity.XueshengzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户作业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 16:29:36
 */
@TableName("xueshengzuoye")
public class XueshengzuoyeView  extends XueshengzuoyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengzuoyeView(){
	}
 
 	public XueshengzuoyeView(XueshengzuoyeEntity xueshengzuoyeEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengzuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}