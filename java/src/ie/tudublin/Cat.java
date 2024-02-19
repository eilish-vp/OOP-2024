package ie.tudublin;

public class Cat extends Animal {

	String name;
	private int numLives;

	public void setName(String name) {
		this.name = name;
	}

	
	// A constructor that takes name
	public Cat(String name)
	{
		this.numLives = 9;
		this.name = name;
	}

	// A method
	public void speak()
	{
		System.out.println("Meow. I am " + name);
	}


	public int getNumLives ()
	{
		return numLives;
	}

	public void kill()
	{   
		numLives --;
		if( numLives > 0)
		{
			
			System.out.println("Ouch!");
		}
		else
		{
			System.out.println("Dead");
		}      
	}
}
