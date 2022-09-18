package com.sonata.impl;

import com.sonata.intf.LoginInterface;
import com.sonata.intf.OrderInterface;
import com.sonata.intf.UserInterface;
public class Order implements OrderInterface{
	LoginInterface login;
	//UserInterface validateuser;

	
	//public void setValidateuser(UserInterface validateuser) {
	//	this.validateuser = validateuser;
	//}

	public void setLogin(LoginInterface login) {
		this.login = login;
	}

	@Override
	public boolean placeOrder(String username, String password, double orderTotal) {
		login.login(username, password);
		if(login.login(username, password)) {
            return true;
        } else {return false;}
		
	}

}