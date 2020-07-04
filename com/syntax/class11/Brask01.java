package com.syntax.class11;

public class Brask01 {
public static void main(String [] args) {
System.out.println("=========== array for loop ============");
	String[] cars = {"Honda", "Jetta", "BMW", "Ford", "Benz", "Cadillac"};
	
	for (String carList : cars) {
		System.out.print(carList + " ");
	}
	System.out.println();

System.out.println("=========array enchanced for loop=============");

int [] numbers = {12, 22, 34, 46, 69, 80};
	int sum = 0;
	
	for (int num : numbers) {
		sum += num;
	}
System.out.println(sum);

System.out.println("===using another for loop===");
int total = 0;
for (int i = 0; i < numbers.length; i++) {
	int num = numbers[i];
	total += num;
}
System.out.println(total);

System.out.println("============Ellion Way=========");

String [] countries = {"USA", "Jamaica", "Canada", "Mexico"};
String [] capitalCities = {"DC", "Kingston", "Ontario", "Cancun"};

for (int i = 0; i < countries.length; i++) {
	String country = countries[i];
	String city = capitalCities[i];
	
	System.out.println(country + " " + city);
}


System.out.println("======");
for (String country : countries) {
	if (country.equals("USA") || country.equals("US")) {
		System.out.println("DC");
	} else if (country.equals ("Jamaica")) {
		System.out.println("Kingston");
	} else if (country.equals("Canada")) {
		System.out.println("Ontario");
	} else if (country.equals("Mexico")) {
		System.out.println("Cancun");
	} else {
		System.out.println("NA");
	}
}

for (int i = 0; i < countries.length; i++) {
	String country = countries[i];
	if (country.equals("USA") || country.equals("US")) {
		System.out.println("DC");
	} else if (country.equals ("Jamaica")) {
		System.out.println("Kingston");
	} else if (country.equals("Canada")) {
		System.out.println("Ontario");
	} else if (country.equals("Mexico")) {
		System.out.println("Cancun");
	} else {
		System.out.println("NA");
	}
}

System.out.println("===2nd way to count in array===");
for (int i = 0; i < countries.length; i++) {
	switch (countries[i]) {
	case "USA":
		System.out.println("DC");
		break;
	case "Jamaica":
		System.out.println("Kingston");
		break;
	case "France":
		System.out.println("Paris");
		break;
	case "Canada":
		System.out.println("Ontario");
		break;
	case "Mexico":
		System.out.println("Cancun");
		break;
		default:
			System.out.println("NA");
	}
}+
} 
}
