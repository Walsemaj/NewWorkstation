package com.mkyong.web.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.google.gson.Gson;

public class GsonTextFileToJsonFormattedString {

	public static void main(String[] args) {
		Gson gson = new Gson();

		try {
			// file.json {"data1":100,"data2":"hello","list":["String 1","String
			// 2","String 3","String 4"]}

			System.out.println(GsonTextFileToJsonFormattedString.getJsonFormattedString());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public synchronized static String getJsonFormattedString() throws Exception {
		System.out.println("GsonTextFileToJsonFormattedString");

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader br = new BufferedReader(
				new FileReader(new File(classloader.getResource("file.json").getFile())));
		// BufferedReader br = new BufferedReader(new
		// FileReader("E:/workspace_spring/testGsonJson/src/main/webapp/WEB-INF/pages/file.json"));

		Gson gson = new Gson();
		DataObject obj = gson.fromJson(br, DataObject.class);
		return gson.toJson(obj);
	}
	
	public synchronized static String getJsonFileContent() throws Exception {
		System.out.println("GsonTextFileToJsonFormattedString");

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader br = new BufferedReader(
				new FileReader(new File(classloader.getResource("file.json").getFile())));

		return br.readLine();
	}
}
