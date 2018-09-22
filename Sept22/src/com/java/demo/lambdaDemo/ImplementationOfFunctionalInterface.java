package com.java.demo.lambdaDemo;

public class ImplementationOfFunctionalInterface {
	
	class HelloWorld implements FunctionalInterfaceDemo {

		@Override
		public void sayHello() {
			System.out.println("Hello World");
		}
		
	}
	
	public HelloWorld getHelloWorldInstance(){
		return new HelloWorld();
	}

}
