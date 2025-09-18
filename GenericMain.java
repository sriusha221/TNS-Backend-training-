package com.tnsif.genricdemo;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericDemo<String> ob=new GenericDemo<String> ();
		ob.setMesg("hello this is generic class");
		System.out.println(ob.getMesg());
		
		GenericDemo<Integer> o=new GenericDemo<Integer> ();
		o.setMesg(345);
		System.out.println(o.getMesg());

	}

}
