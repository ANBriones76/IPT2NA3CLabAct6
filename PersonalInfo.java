/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personalInfo;

import java.util.Scanner;

public class PersonalInfo{
	public static void main(String args[]){
	String name;
	int age;
	String address;
	int phonenumber;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your name: ");
	name = input.next();
	System.out.print("Enter your age: ");
	age = input.nextInt();
	System.out.print("Enter your address: ");
	address = input.next();
	System.out.print("Enter your phonenumber: ");
	phonenumber = input.nextInt();
}	
}