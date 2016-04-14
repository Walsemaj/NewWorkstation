package com.test.testLambda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ListToMap {
	
	public static void main(String[] args) {
		List<Hosting> list = new ArrayList<>();
		list.add(new Java8ListToMap().new Hosting(1, "liquidweb.com", new Date()));
		list.add(new Java8ListToMap().new Hosting(2, "linode.com", new Date()));
		list.add(new Java8ListToMap().new Hosting(3, "digitallocean.com", new Date()));
		
		System.out.println("Example to convert a List into a stream, then collect it with Collectors.toMap");
		Map<Integer, String> result1 = (Map<Integer, String>) list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getName));
		System.out.println("Result 1: " + result1);
		
		System.out.println("Example 2");
		Map<Integer, String> result2 = list.stream().collect(Collectors.toMap(x->x.getId(), x->x.getName()));
		System.out.println("Result 2: " + result2);
	}
	
	class Hosting {
		private int id;
		private String name;
		private Date createdDate;
		
		public Hosting(int id, String name, Date createdDate) {
			this.id = id;
			this.name = name;
			this.createdDate = createdDate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Date createdDate) {
			this.createdDate = createdDate;
		}
	}
}
