package com.cf.app;

import java.io.Serializable;
import java.util.*;

public class Transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Operation> operationsList;

	/**
	 * @return the operationsList
	 */
	public List<Operation> getOperationsList() {
		return operationsList;
	}

	/**
	 * @param operationsList
	 *            the operationsList to set
	 */
	public void setOperationsList(List<Operation> operationsList) {
		this.operationsList = operationsList;
	}

}
