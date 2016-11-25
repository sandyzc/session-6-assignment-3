package com.assignment3.banking;

import java.util.Scanner;

public class MainBanking {
	
	
	
	
	
	static ThreadBanking tb = new ThreadBanking();
	
	
	public static void main(String[] args) {
	
	
		
		
		
	
		Thread threadOne = new Thread(){
			
			public void run() {
				tb.login();
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		};
		
		Thread threadTwo = new Thread(){
			
	 		public void run(){
	 			tb.deposit();
	 			try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		
		Thread threadThree = new Thread(){
			
	 		public void run(){
	 			try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tb.withdrawl();
				
			}
		};
		
		Thread threadFour = new Thread(){
			
	 		public void run(){
	 			try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				tb.transction();
				
			}
		};
		
		
		
		
	threadOne.start();
	threadTwo.start();
	threadThree.start();
	threadFour.start();
	
	
	}

}
