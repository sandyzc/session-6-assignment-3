package com.assignment3.banking;

public class ThreadBanking {
	
	
	public synchronized void login(){
		
		System.out.println("Enter your login details ");	
	}
	
	public synchronized void deposit(){
		
		System.out.println("Amount deposited");			
	}
		
	public synchronized void withdrawl(){
		
		System.out.println("Amount witdrawn ");
		
	}
	
	public synchronized void transction(){
		
		System.out.println("Transaction succesful");
		
	
	}
	
}


