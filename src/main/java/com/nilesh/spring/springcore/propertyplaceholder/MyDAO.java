package com.nilesh.spring.springcore.propertyplaceholder;

public class MyDAO {

	private String dbServer;
	private String dbUser;
	@Override
	public String toString() {
		return "MyDAO [dbServer=" + dbServer + "]";
	}

	public MyDAO(String dbServer) {
		super();
		this.dbServer = dbServer;
	}

	public String getDbUser() {
		return dbUser;
	}

	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
}
