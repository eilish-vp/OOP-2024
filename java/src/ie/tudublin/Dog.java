package ie.tudublin;

public class Dog extends Animal
{
	String name;
	


	// A constructor that takes name
	public Dog(String name)
	{
		this.name = name;
	}

	public void speak()
	{
		System.out.println("Woof. I am " + name);
	}
}