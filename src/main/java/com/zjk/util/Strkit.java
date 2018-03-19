package com.zjk.util;

import java.util.List;

import com.zjk.base.Range;

public class Strkit {
	
	public static Range getRange(StringBuffer sfb,List<String> listTags){
		Range range = new Range();
		int min =0,max=0;
		int ic=0;
		for(String tag: listTags){
			if(ic==0){
				min=sfb.indexOf("<"+tag+">");
				max=sfb.lastIndexOf("</"+tag+">");
				if(min==-1){
					min=0;
					max=0;
				}else{
					max=max+tag.length()+3;
				}
			}else{
				int imin=sfb.indexOf("<"+tag+">");
				int imax=sfb.lastIndexOf("</"+tag+">");
				if(min!=-1){
					
					if(min>imin){
						min=imin;
					}
					imax=imax+tag.length()+3;
					
					if(max<imax){
						max=imax;
					}
					
				}
				
			}
			ic++;
			
		}
		range.setFrom(min);
		range.setTo(max);
		return range;
	}
	
	
}
