package odev3Kodlama;

import odev3Kodlama.Management.InstructorManager;
import odev3Kodlama.Management.StudentManager;
import odev3Kodlama.Management.UserManager;
import odev3Kodlama.Persons.Instructor;
import odev3Kodlama.Persons.Student;


public class Main {

	public static void main(String[] args) {
		
		//Öğrenci bilgileri
		Student student1 =new Student();
		student1.set_firstName("kayhan");
		student1.set_lastName("Çetinkaya");
		student1.set_id(1);;
		student1.set_eMail("ahmetkayhanc@gmail.com");
		student1.set_adress("Karabük");
		student1.set_nationalIdentity("12345678978");
		student1.set_password("1234");
		student1.set_telephone("5555555555");
		student1.setSchoolName("BSEU");
		
		//eğitmen bilgileri 
		Instructor ınstructor1 =new Instructor();
		ınstructor1.set_firstName ("Engin");
		ınstructor1.set_lastName("Demiroğ");
		ınstructor1.set_id(2);;
		ınstructor1.set_eMail("engindemirog@xxxxx.xxx");
		ınstructor1.set_adress("Sakarya");
		ınstructor1.set_nationalIdentity("98765432112");
		ınstructor1.set_password("5264");
		ınstructor1.set_telephone("666666666");
		ınstructor1.setSalary(5000);
		
		

		StudentManager studentManager = new StudentManager();
		InstructorManager ınstructorManager = new InstructorManager();
		
		studentManager.add(student1); 
		ınstructorManager.add(ınstructor1);
		
		

	
	}

}
