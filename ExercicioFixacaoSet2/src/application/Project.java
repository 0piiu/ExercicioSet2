package application;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.User;

public class Project {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = Arrays.asList("A", "B", "C");
		Set<User> set = new TreeSet<>();

		for(int i = 0; i < list.size(); i++) {
			System.out.print("How many students for course " + list.get(i) + "? ");
			int number = sc.nextInt();
			
			for(int j = 0; j < number; j++) {
				int id = sc.nextInt();
				User user = new User(id);
				set.add(user);
			}
			
		}
		System.out.println("Total Students: "+ set.size());
		sc.close();
	}
}
