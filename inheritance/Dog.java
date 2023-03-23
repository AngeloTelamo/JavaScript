class Dog extends Animal {
 
	public String name;
	
	public Dog(int i)
	  {	  
		  super();
		  System.out.println("Name " + super.name);
		  System.out.println("This is from Dog.");	  
	  }
  
	public Dog(int i, String n)
	  {	  
		  super(0,"Rohu","Pets");
		  System.out.println("Name " + name);		  
		  System.out.println("This is from Dog 2 para.");	  
	  }

	
  //method in subclass
  public void display() {
    //System.out.println("My name is " + name);
    //System.out.println("I am a " + type);
	  System.out.println("Display method");
  }
}