package com.onlar_pattern.singleton.strategy;

public class ATMMachineContext {
	
	//private variable memeber
	private IATMStrategy iatmStrategy;

	// constructor
	public ATMMachineContext(IATMStrategy iatmStrategy){

	this.iatmStrategy = iatmStrategy;

	}

	
	public void processCard(){

	this.iatmStrategy.connectTo();

	}

	

}
