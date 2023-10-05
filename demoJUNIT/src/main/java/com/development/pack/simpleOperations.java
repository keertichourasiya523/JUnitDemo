package com.development.pack;

public class simpleOperations {

	
	public int Addition(int x,int y)
	{
		return x+y;
	}
	
	public int findMinVal(int x[]) {
		int small=x[0];
		for (int i=0;i<x.length;i++) {
			if(small>x[i]) 
				small=x[i];
		}
		return small;
		
	}
	
}
