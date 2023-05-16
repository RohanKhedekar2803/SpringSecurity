package com.example.mongosetup.Entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class User {
		private ObjectId id;
		private String info;
		private int age;
		private String name;
		private String password;
		private String role;
		
		public User(String info, int age, String name, String password, String role) {
			super();
			this.info = info;
			this.age = age;
			this.name = name;
			this.password = password;
			this.role = role;
		}
		public User(ObjectId id, String info, int age, String name, String password, String role) {
			super();
			this.id = id;
			this.info = info;
			this.age = age;
			this.name = name;
			this.password = password;
			this.role = role;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public User(String info, int age, String name, String password) {
			super();
			this.info = info;
			this.age = age;
			this.name = name;
			this.password = password;
		}
		public User(ObjectId id, String info, int age, String name, String password) {
			super();
			this.id = id;
			this.info = info;
			this.age = age;
			this.name = name;
			this.password = password;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public ObjectId getId() {
			return id;
		}
		public void setId(ObjectId id) {
			this.id = id;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public User(ObjectId id, String info, int age, String name) {
			super();
			this.id = id;
			this.info = info;
			this.age = age;
			this.name = name;
		}
		public User(String info, int age, String name) {
			super();
			this.info = info;
			this.age = age;
			this.name = name;
		}
		public User() {
			super();
		}
		
		
}
