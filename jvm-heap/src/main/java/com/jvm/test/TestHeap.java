package com.jvm.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenf
 * @Date: 2021/8/12 14:35
 */
public class TestHeap {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		while (true) {
			User user = new User();
			user.setId(1L);
			user.setUsername("user");
			user.setPassword("pass");
			if (System.currentTimeMillis() % 2 == 0) {
				//加入到集合，不符合条件的就成了垃圾对象
				userList.add(user);
				System.out.println("add to list, size = " + userList.size());
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

