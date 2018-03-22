package com.lemonade.qa.testdata;

import java.io.FileInputStream;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class testbase
{
	{
	try {
	Properties prop=new Properties();
	FileInputStream li= new FileInputStream("C:\\Users\\shivangi.gupta\\eclipse-workspace\\pommavenproject\\src\\main\\java\\com\\lemonade\\qa\\config\\config.properties");
	
	prop.load(li);
	}catch(Exception e) {
	System.out.println("e");}

}
}