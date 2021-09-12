package com.revature.app.inheritance;

	public class Child extends Parent{
		
		public Child(int age) {
			super(age);
		}
		public void childInstanceMethod() {
			super.instanceMethod();
			System.out.println("childInstanceMethod");
			System.out.println(age);
			
		}
		//Method overloading
		public void instanceMethod() {
			super.instanceMethod();
			System.out.println("childInstanceMethod");
			
		}
		public static void main(String[] args)
		{
			Child child = new Child(10);
			child.instanceMethod();
			
		}

	}


