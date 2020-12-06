package com.bharath.patterns.singleton;

import java.io.Serializable;


public class Logger implements Serializable, Cloneable {

	private static Logger instance;

	private Logger() {

	}

	public static Logger getInstance() {
		if (instance == null) {
			synchronized (Logger.class) {
				instance = new Logger();
			}
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void log(String message){
		System.out.println(message);
	}
}
