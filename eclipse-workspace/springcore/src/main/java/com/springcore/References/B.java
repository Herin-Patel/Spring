package com.springcore.References;

public class B {
	private int y;
	
	public B(){
		super();
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "B [y = " + y + "]";
	}
}
