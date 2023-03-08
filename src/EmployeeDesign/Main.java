package EmployeeDesign;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Map<Object, String> allEmployees = new HashMap<>();

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to company analyzer!!!");
		System.out.println("===============================");

		while (true) {
			display();
			Integer choice = null;
			try {
				choice = Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Please enter an integer value!");
				continue;
			}
			switch (choice) {
			case 1:
				hireDeveloper(scanner, allEmployees);
				break;
			case 2:
				hireManager(scanner, allEmployees);
				break;
			case 3:
				hireRecruiter(scanner, allEmployees);
				break;
			case 4:
				allEmployees.entrySet().stream().forEach(e -> System.out.println(e.getKey()));
				break;
			case 5:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}

	private static void hireRecruiter(Scanner scanner, Map<Object, String> allEmployees)
			throws NumberFormatException {
		Recruiter recruiter;
		System.out.println("Please enter name of the recruiter:");
		String recName = scanner.nextLine();
		System.out.println("How many hours will recruiter work in a month?");
		int hours11 = Integer.parseInt(scanner.nextLine());
		recruiter = new Recruiter(recName, hours11);
		allEmployees.put(recruiter, recName);
	}

	private static void hireManager(Scanner scanner, Map<Object, String> allEmployees) throws NumberFormatException {
		Manager manager;
		System.out.println("Please enter name of the manager:");
		String managerName = scanner.nextLine();
		System.out.println("How many hours will manager work in a month?");
		int hours1 = Integer.parseInt(scanner.nextLine());
		manager = new Manager(managerName, hours1);
		allEmployees.put(manager, managerName);
	}

	private static void hireDeveloper(Scanner scanner, Map<Object, String> allEmployees)
			throws NumberFormatException {
		Developer dev;
		System.out.println("Please enter name of the developer:");
		String devName = scanner.nextLine();
		System.out.println("How many hours will developer work in a month?");
		int hours = Integer.parseInt(scanner.nextLine());
		dev = new Developer(devName, hours);
		allEmployees.put(dev, devName);
	}

	private static void display() {
		System.out.println("\n" + "Please select the new employee position: ");
		System.out.println("1 - Developer");
		System.out.println("2 - Manager");
		System.out.println("3 - Recruiter");
		System.out.println("4 - List of Empleyees");
		System.out.println("5 - Exit");
		System.out.println("===============================");
	}

}
