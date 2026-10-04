package com;

public class Travel {

	public boolean isCarDriver(Driver car) {
		boolean result = car.getCategory().equals("Car");
		return result;
	}

	public String retrivebyDriverId(Driver arr[], int driverId) {
		for (int i = 0; i < arr.length; i++) {
			Driver d = arr[i];
			if (d.getDriverId() == driverId) {
				return d.toString();
			}
		}
		return null;
	}

	public int retriveCountOfDriver(Driver arr[], String category) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			Driver d = arr[i];
			if (d.getCategory().equals(category)) {
				count++;
			}
		}
		return count;
	}

	public Driver[] retriveDriver(Driver arr[], String category) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			Driver d = arr[i];
			if (d.getCategory().equals(category)) {
				count++;
			}
		}

		Driver result[] = new Driver[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			Driver d = arr[i];
			if (d.getCategory().equals(category)) {
				result[index] = d;
				index++;
			}
		}
		return result;
	}

	public Driver retriveMaximumDistanceTravelledDriver(Driver arr[]) {
		double max = 0;
		Driver maxDriver = null;
		for (int i = 0; i < arr.length; i++) {
			Driver d = arr[i];
			double distance = d.getTotaldistance();
			if (distance > max) {
				max = distance;
				maxDriver = d;
			}
		}
		return maxDriver;
	}
}
