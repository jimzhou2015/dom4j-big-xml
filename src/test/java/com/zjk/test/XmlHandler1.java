package com.zjk.test;

import java.util.List;
import java.util.Map;

import com.zjk.handler.XmlHandler;
import com.zjk.test.vo.Car;

public class XmlHandler1 implements XmlHandler{

	public void hande(Map<String, List<Object>> reMap) {
		
		System.out.println("=======hande==========");
		List<Object> list = reMap.get("Car");
		
		for(Object obj:list){
			Car car = (Car) obj;
			
			System.out.println(car.getType());
		}
	}

}
