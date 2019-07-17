package com.nt.singletoneTest;

import com.nt.beans.PrinterUtil;

public class SingleToneTest {

	public static void main(String[] args) throws Exception {
               
		PrinterUtil pu1=null,pu2=null;
		pu1=PrinterUtil.getIntance();
		pu2=PrinterUtil.getIntance();
		System.out.println("pu1==pu2"+(pu1==pu2));
		System.out.println(pu1.hashCode()+"..."+pu2.hashCode());
	}

}
