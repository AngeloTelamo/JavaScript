class Animal {

  private  int age;
  public String name;
  protected String type;
  
  public Animal()
  {
	age = 0;
	name = "Blacky";
	type = "";
	System.out.println("Initialization is from super class default constructor.");
  }
  
   //constructor with parameters
  public Animal(int a, String n, String t) 
  {
	  age = a;
	  name = n;
	  type = t;	  
	  System.out.println("The initial values are: " + age + " " + name + " " + type);
	  System.out.println("This is from Animal. Constructor with parameter.");
  }
  
  
  public void eat() {
    System.out.println("I can eat");
  }
  
  public int getAge() {
	    return age;
	  }
  
  public String getName() {
	    return name;
	  }

  public String getType() {
	    return type;
	  }

}