package com.bharath.patterns.singleton;

public class LoggerTest {

	public static void main(String[] args) {
		Logger logger = Logger.getInstance();
		logger.log("Testing Logger class.");
	}

}
