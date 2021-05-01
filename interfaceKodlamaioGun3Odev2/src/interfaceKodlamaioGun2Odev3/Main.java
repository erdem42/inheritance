package interfaceKodlamaioGun2Odev3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("erdem");
		student1.setLastName("Yksl");
		student1.setAlinanKurslar(new String[] { "java", "C#" });

		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("engin");
		instructor1.setLastName("demiroð");
		instructor1.setVerilenKurslar(new String[] { "java", "C#", "Fundamentals" });

	//	User[] users = { student1, instructor1 };
		
		
		
		UserUI userUI=new UserUI(student1,new StudentManager());
		UserUI userUI2=new UserUI(instructor1,new InstructorManager());

		userUI.add();
		userUI2.add();
	}

}
