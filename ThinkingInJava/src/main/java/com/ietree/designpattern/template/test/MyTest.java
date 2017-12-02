package com.ietree.designpattern.template.test;

import com.ietree.designpattern.template.ClothesShopping;
import com.ietree.designpattern.template.ShoesShopping;
import com.ietree.designpattern.template.Shopping;

public class MyTest {
	public static void main(String[] args) {
		Shopping shoesShopping = new ShoesShopping();
		shoesShopping.buyGoods();
		System.out.println("-------------------");
		Shopping clothesShopping = new ClothesShopping();
		clothesShopping.buyGoods();
	}
}
