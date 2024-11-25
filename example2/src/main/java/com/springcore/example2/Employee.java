package com.springcore.example2;

public class Employee {
		private String name;
		private String department;
		
		public Employee(String name, String department) {
			this.name = name;
			this.department = department;
		}
		
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", department=" + department + "]";
		}
		
		
		
		public String getName() {
			return name;
		}
		
		public String getDepartment() {
			return department;
		}
		
		
}
