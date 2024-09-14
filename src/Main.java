
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellow World");
		Human person1 = new Human("David", 16, 'M');
		Human person2 = new Human("Huang Zheng", 58, 'M');
		
		person1.whoAreYou();
		person2.whoAreYou();
		
		person1.whatAreYouDoing();
		person2.whatAreYouDoing();
		
		person1.run();
		person2.talk();
		
		person1.whatAreYouDoing();
		person2.whatAreYouDoing();
		
		person1.talk();
		
		person1.whatAreYouDoing();
		person2.whatAreYouDoing();
		
		System.out.println("==========================");
		/*System.out.println("person1 info:");
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.gender);
		System.out.println(person1.isRunning);
		System.out.println(person1.isTalking);
		
		person1.isRunning = false;
		person1.whatAreYouDoing();*/
		
		String aName = person1.getName();
		System.out.println(aName);
		
		person1.setName("Derek");
		System.out.println(person1.getName());
		
		System.out.println(person2.getName());
		person2.setName("AnyName");
		
		person2.whoAreYou();
		
		Human person3 = new Human("Mary", 8, 'F');
		person3.whoAreYou();
		
		System.out.println(person1.getGender());
	}

}


class Human {
	private String name=null;
	private int age=0;
	private char gender = 'M';
	
	private boolean isRunning = false;
	private boolean isTalking = false;
	
	public Human(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getGender() {
		// TODO Auto-generated method stub
		if (this.gender == 'M')
			return "Male";
		else if (this.gender == 'F')
			return "Female";
		else 
			return "Unknow";
	}

	public void setName(String x) {
		// TODO Auto-generated method stub
		this.name = x;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	void run() {
		this.isRunning = true;
	}
	
	void talk() {
		this.isTalking = true;
	}
	
	void whoAreYou() {
		
		String sGender = null;
		if (this.gender == 'M')
		{
			if (this.age<18) {
				sGender = "boy";
			}
			else {
				sGender = "man";
			}
		}
		else if (this.gender == 'F') {
			if (this.age<18) {
				sGender = "girl";
			} else {
				sGender = "woman";
			}
		}
		else {
			sGender = "unknow gender";
		}
		
		System.out.println("I am "+this.name+". I am a "+sGender+"."+" I am "+this.age+" years old.");
	}
	
	void whatAreYouDoing() {
		if (this.isRunning)
			System.out.println("I("+this.name+") am running.");
		if (this.isTalking) {
			System.out.println("I("+this.name+")I am talking.");
		}
		
		if (!this.isRunning && !this.isTalking) {
			System.out.println("I("+this.name+") am doing nothing.");
		}
	}
}

// y = kx+m;
// f(x) = kx+m
// f(x,y) = x+y
