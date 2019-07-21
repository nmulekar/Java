package assignment;

public abstract class Demo3 {

	abstract void getName(String name);

	abstract void getGender(String gender);

}

abstract class AbstClass extends Demo3 {

	abstract void getCity(String city);

	abstract void getCountry(String country);
}

class SubClasses extends AbstClass {

	String name, gender, city, country;

	@Override
	void getCity(String city) {

		this.city = city;

	}

	@Override
	void getCountry(String country) {

		this.country = country;

	}

	@Override
	void getName(String name) {

		this.name = name;

	}

	@Override
	void getGender(String gender) {

		this.gender = gender;
	}

	void Display() {

		System.out.println("Name : " + name);

		System.out.println("Gender : " + gender);

		System.out.println("City : " + city);

		System.out.println("Country : " + country);

	}
}
