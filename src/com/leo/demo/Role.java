package com.leo.demo;

public class Role {
	String mName;
	Defend mDefend;
	Attack mAttack;


	public Role(String name){
		mName = name;
	}
	
	public void setDefend(Defend defend) {
		mDefend = defend;
	}

	public void setAttack(Attack attack) {
		mAttack = attack;
	}


	public void attack() {
		if (mAttack != null) {
			mAttack.attack();
		}
	}

	public void defend() {
		if (mDefend != null) {
			mDefend.defend();
		}
	}
}
