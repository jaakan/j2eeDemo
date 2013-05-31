/*******************************************************************************
 * Copyright (c) 2005 Eteration A.S. and others. All rights reserved. This
 * program and the accompanying materials are made available under the terms of
 * the Eclipse Public License v1.0 which accompanies this distribution, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: Eteration A.S. - initial API and implementation
 ******************************************************************************/
package test.actions;

import java.io.IOException;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	private String action=null;
	public String execute() throws Exception{
		
		String result=null;
		if(action.equalsIgnoreCase("ok")){
			result="success";
		}else if(action.equalsIgnoreCase("fail")){
			result="fail";
		}else{
			result="error";
		}
		return result;
		
	}
	
	public void setAction(String action){
		this.action=action;
	}
	public String getAction(){
		return action;
	}
}