package com.zjk.test;

import java.util.ArrayList;
import java.util.List;

import com.zjk.base.XmlBase;
import com.zjk.test.vo.Car;
import com.zjk.util.Xml4bigKit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xpath=System.getProperty("user.dir")+"/src/test/java/CarDataBig.xml";
		System.out.println(System.getProperty("user.dir"));
		String dataStartTag =null;
		List<Class<? extends XmlBase>> clslist = new ArrayList<Class<? extends XmlBase>>();
		clslist.add(Car.class);
		Xml4bigKit.parseXml(xpath, dataStartTag,clslist,new XmlHandler1());
		
	}

}
