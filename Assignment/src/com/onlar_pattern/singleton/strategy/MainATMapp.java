package com.onlar_pattern.singleton.strategy;

public class MainATMapp {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		ATMMachineContext atmMachine = new ATMMachineContext(new SBIATMStrategy());

		atmMachine.processCard();

		atmMachine = new ATMMachineContext(new HDFCATMStrategy());

		atmMachine.processCard();

		}

}
