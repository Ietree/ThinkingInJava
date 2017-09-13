package com.ietree.designpattern.adapter.worker.impl;

import com.ietree.designpattern.adapter.worker.ICooker;

public class Cooker implements ICooker {

	public String cook() {
		return "I am a cooker, I will cook delicious food.";
	}

}
