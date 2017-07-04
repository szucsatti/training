package com.szucsatti.training.immutable;

public class UsingDateWrapper {

	private DateWrapper dateWrapper;

	public UsingDateWrapper() {
		super();
	}
	
	public void calculate(){
		if(dateWrapper != null){
			dateWrapper.getTime();
		}
	}
	
	
}
