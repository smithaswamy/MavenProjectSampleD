package com.demo;

public class HelloWorld {

	public int add(int a,int b)
	{
		return a+b;
	}
	

	public int sub(int a,int b)
	{
		return a-b;
	}
	
	public static void main(String[] args) {
		
		HelloWorld hw=new HelloWorld();
		System.out.println(hw.add(4, 3));
		System.out.println(hw.sub(4, 3));
	}

}
