package com.java.demo.lambdaDemo;

import com.java.demo.lambdaDemo.ImplementationOfFunctionalInterface.HelloWorld;

public class RunTheCode {

	public static void main(String[] args) {
		//Approach 1 an inner class implementing Function Interface 
		ImplementationOfFunctionalInterface impl = new ImplementationOfFunctionalInterface();
		HelloWorld myHelloWorld = impl.getHelloWorldInstance();
		myHelloWorld.sayHello();
		
		//Approach 2 Local Class implementing Functional Interface
		class ChineseHelloWorld implements FunctionalInterfaceDemo {

			@Override
			public void sayHello() {
				System.out.println("Nee How!");
			}
			
		}
		
		ChineseHelloWorld ch = new ChineseHelloWorld();
		ch.sayHello();
		
		//Approach 3 Anonymous Class implements Functional Interface
		(new FunctionalInterfaceDemo() {
			@Override
			public void sayHello() {
				System.out.println("Hi Bro!");	
			}
		}).sayHello();
		
		//Approach 4 Lambda Function implements Function Interface

		
		useLambda(
				() -> System.out.println("Welcome to world of lamda expression")
		);
	}
	
	public static void useLambda(FunctionalInterfaceDemo f){
		f.sayHello();
	}

}
