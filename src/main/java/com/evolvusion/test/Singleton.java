package com.evolvusion.test;

import org.apache.camel.processor.ThroughputLogger;

public class Singleton  implements Cloneable {
	
	public static volatile Singleton instance;

	private Singleton() {

	}

	public static synchronized Singleton getinstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		//return super.clone();
		
		throw new CloneNotSupportedException("not supported");
	}
}
