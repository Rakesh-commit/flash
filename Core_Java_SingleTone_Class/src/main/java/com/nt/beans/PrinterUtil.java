package com.nt.beans;

public class PrinterUtil {
	
	private static PrinterUtil instance;
	private static boolean instanciated;
	
	private PrinterUtil()throws Exception {
		
		System.out.println("From constructor()");
		if(instanciated) {
			throw new Exception("Object is already instanciated");
		}
		instanciated=true;
		
	}
	public static PrinterUtil getIntance()throws Exception{
		if(instance==null) {
			instance=new PrinterUtil();
		}
		
		return instance;
	}

}
