package com.ietree.oo.generics.interfaces;

public class MutipleInterfaceVariantsTest {
	public static void main(String[] args) {

	}
}

interface Payables{}

class Employees implements Payables{}

// The interface Payable cannot be implemented more than once with different arguments: Payable<Employee> and Payable<Hourly>
class Hourlys extends Employees implements Payables{}
