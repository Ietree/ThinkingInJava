package com.ietree.designpattern.template;

public class ShoesShopping extends Shopping {

	@Override
	public void buy() {
		System.out.println("购买鞋子");
	}

	@Override
	public void pay() {
		System.out.println("使用支付宝支付");
	}

}
