package org.cap.boot;

public class MainClass {
 public static void main(String[] args) {
	display();
	SalesClass sales=new SalesClass();
	sales.show();
	sales.greetings();
}
	public  static void display (){
		System.out.println("Hello....");
	}
}
