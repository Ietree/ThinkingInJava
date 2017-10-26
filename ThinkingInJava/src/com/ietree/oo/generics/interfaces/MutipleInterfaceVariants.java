package com.ietree.oo.generics.interfaces;

/**
 * 实现参数化接口
 * @author tree
 */
public class MutipleInterfaceVariants {

}

interface Payable<T>{}

class Employee implements Payable<Employee>{}

// The interface Payable cannot be implemented more than once with different arguments: Payable<Employee> and Payable<Hourly>
//class Hourly extends Employee implements Payable<Hourly>{}
