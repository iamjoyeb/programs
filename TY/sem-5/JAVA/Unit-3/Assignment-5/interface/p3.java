/* write a java program to demonstrate code for demonstarate the use of Multiple inheritance using interface */

interface Animal{
	void eat();
}

interface Pet{
	void play();
}

class Dog implements Animal,Pet{
	public void eat(){
		System.out.println("Dog is eating food");
	}

	public void play(){
		System.out.println("Dog is playing with ball");
	}
}

class p3{
	public static void main(String args[]){
		Dog d=new Dog();
		d.eat();
		d.play();
	}
}

/*
	OUTPUT:
	Dog is eating food
	Dog is playing with ball
*/
