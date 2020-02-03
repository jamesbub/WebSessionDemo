package com.biswajeet.websessiondemo.service;

public class UserInfo {
	private String userId, firstName, lastName;
	  
	public UserInfo() {}
	  
	  /**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		  StringBuffer output = new StringBuffer();
		  output.append(super.toString() + " {\n");
		  output.append("\tuserId=[" + userId + "]\n" );
		  output.append("\tfirstName=[" + firstName + "]\n");
		  output.append("\tlastName=[" + lastName + "]\n");
		  output.append("}");
		  return output.toString();
	  }
}
