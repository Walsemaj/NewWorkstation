package com.mkyong.web.controller;

import java.io.File;
import java.io.FileWriter;

import com.google.gson.Gson;

public class GsonObjToJsonFormmattedString {
	public static void main(String[] args) {
		
		String content ="";
		
		try{			
			FileWriter writer = new FileWriter("src/main/resources/file.json");
			content = GsonObjToJsonFormmattedString.getJsonFormattedString();
			writer.write(content);
			writer.close();
		} catch(Exception ex) {
			ex.printStackTrace();			
		}
		
		System.out.println(content);	
	}
	
	public synchronized static String getJsonFormattedString() {
		DataObject obj = new DataObject();
		Gson gson = new Gson();
		
		//Convert java Obj to JSON
		//and returned as JSON formatted string
		String json = gson.toJson(obj);
				
		return json;
	}
}
