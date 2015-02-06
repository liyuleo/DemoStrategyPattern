package com.leo.demo;

public class Demo {
	public static void main(String[] args) {
		Role qiaoFeng = new Role("乔峰");
		qiaoFeng.setAttack(new AttackXLSBZ());
		qiaoFeng.setDefend(new DefendCSF());
		
		Role duanYu = new Role("段誉");
		duanYu.setAttack(new AttackLMSJ());
		duanYu.setDefend(new DefendLBWB());
		
		qiaoFeng.attack();
		qiaoFeng.defend();
		
		System.out.println("------------------------------");
		
		duanYu.attack();
		duanYu.defend();
	}
}
