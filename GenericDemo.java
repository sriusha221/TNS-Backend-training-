package com.tnsif.genricdemo;
//Demo for generic
public class GenericDemo<T> {
   
	//variable
	private  T message;
	
	public void setMesg (T message) {
		this.message=message;
	}
	 public T getMesg() {
		 return message;
		
		// TODO Auto-generated method stub

	}

}
