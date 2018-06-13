interface MyInterface
{
   public void speak();
   public void eat();
}
class Dog implements MyInterface
{
   public void speak()
   {
	System.out.println("Dogs Bark");
   }
   public void eat()
   {
	System.out.println("Dog eat Bones");
   }
}
class Cat implements MyInterface
{
	public void speak()
   {
	System.out.println("Cats Meow");
   }
   public void eat()
   {
	System.out.println("Cats drink Milk");
   }
}

class Interface
{
	public static void main(String arg[])
   {
		MyInterface obj = new Dog();
		MyInterface obj1 = new Cat();
		obj.speak();
		obj.eat();
		obj1.speak();
		obj1.eat();
	}
}