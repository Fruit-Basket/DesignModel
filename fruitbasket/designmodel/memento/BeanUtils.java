package fruitbasket.designmodel.memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class BeanUtils {

	/**
	 * 把bean的所有属性及其值放入到HashMap中
	 * @param bean
	 * @return
	 */
	public static HashMap<String,Object> backupProp(Object bean){
		HashMap<String,Object> result=new HashMap<String,Object>();
		
		try{
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			
			for(PropertyDescriptor descriptor:descriptors){
				//读取属性的名字
				String fieldName=descriptor.getName();
				Method getter=descriptor.getReadMethod();
				//读取属性的值
				Object fieldValue=getter.invoke(bean, new Object[]{});
				if(fieldName.equalsIgnoreCase("class")==false){
					result.put(fieldName, fieldValue);
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 将HashMap中存放的值恢复到bean中
	 * @param bean
	 * @param propMap
	 */
	public static void restoreProp(Object bean,HashMap<String,Object> propMap){
		try{
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			
			for(PropertyDescriptor descriptor:descriptors){
				String fieldName=descriptor.getName();
				if(propMap.containsKey(fieldName)==true){
					Method setter=descriptor.getWriteMethod();
					setter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
