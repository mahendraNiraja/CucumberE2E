package com.utils;

public class Test {

public static void main(String[] args) {

	ConfigReader d= new ConfigReader();
	String l=d.init_prop().getProperty("browser");
	System.out.println(l);

}
}