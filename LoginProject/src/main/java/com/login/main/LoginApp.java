package com.login.main;
/**
 * 
 * @author likith.hp
 *
 */

import java.util.Scanner;

import com.login.model.User;
import com.login.service.LoginService;
import com.login.service.LoginServiceImpl;

public class LoginApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter userId:");// Enter user Id
		int id = input.nextInt();// userId

		System.out.println("Enter password:");// enter user password
		String pwd = input.next();// password

		LoginService loginService = new LoginServiceImpl();
		User user = new User();
		user.setUserId(id);
		user.setPassword(pwd);

		User ans = loginService.readByUserIdAndPasswordService(user);
		if (ans != null) {
			System.out.println("welcome" + ans.getUserName());
		}

	}

}
