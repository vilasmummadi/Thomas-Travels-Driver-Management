package com;

public class TestDriver {

	public static void main(String[] args) {
		Driver d1 = new Driver(101, "Car", "Vilas", 1000);
		Driver d2 = new Driver(102, "Car", "Rahul", 2500);
		Driver d3 = new Driver(103, "Auto", "Ravi", 1500);

		Driver arr[] = { d1, d2, d3 };
		Travel ca = new Travel();

		boolean result1 = ca.isCarDriver(d1);
		System.out.println(result1);

		String result2 = ca.retrivebyDriverId(arr, 102);
		System.out.println(result2);

		int result3 = ca.retriveCountOfDriver(arr, "Car");
		System.out.println(result3);

		Driver[] result4 = ca.retriveDriver(arr, "Car");
		for (Driver d : result4) {
			System.out.println(d);
		}

		Driver result5 = ca.retriveMaximumDistanceTravelledDriver(arr);
		System.out.println(result5);
	}
}
