package org.sample;

public class Mainclass extends Abstractthree {

	@Override
	public void abstractMethodeThree() {
		System.out.println("from abstract class3 to normal class");
	
	}

	
	
		public Mainclass(int id, char block) {
			this("mithul",123456789);
			System.out.println("atmpin is :"+id + "block is :"+block);
			
		}
		
		
		
		public Mainclass(String name , long mobile ) {
			System.out.println("name is :"+name + "mobile no is :"+mobile);
		}
		
		
		public Mainclass() {
			this (1234,'a');
			System.out.println("defaultconstroctor");
		}
		
		

















}



