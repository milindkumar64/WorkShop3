package com.bridgelabz;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		try {
		//System.out.println();
		throw new CustomException("Invalid arithmetic operation");
		}
		catch(CustomException e) {
			
			System.out.println("Exception has been caught");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}

}
