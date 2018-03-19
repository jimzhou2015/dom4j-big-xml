package com.zjk.test.vo;
import com.zjk.annotation.Column;
import com.zjk.base.XmlBase;
public class CarEngine extends XmlBase {


	@Column(name="core")
	private Integer core;       
	@Column(name="type")
	private String type;
	public Integer getCore() {
		return core;
	}
	public void setCore(Integer core) {
		this.core = core;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}   
	
	


}
