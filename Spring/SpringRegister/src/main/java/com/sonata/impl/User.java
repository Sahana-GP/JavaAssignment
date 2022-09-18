package com.sonata.impl;

import com.sonata.intf.UserInterface;

public class User implements UserInterface{
	@Override
	public boolean validateuser(String username, String password) {
		String uname = "sahana";
        String pass = "root@2022";
        if (username.equals(uname) && password.equals(pass)) {
            return true;
        } else {return false;}
	}
}