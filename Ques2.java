abstract class Animal
{
	String color, breed , name;
	public void speak()
	{
		System.out.println("Animals produce sounds");
	};
	public abstract void eat();
}
class Dog extends Animal
{
   public void eat()
   {
	System.out.println("Dogs eat Bones");
   }
   public static void main(String args[])
   {
	Animal obj = new Dog();
	obj.eat();
	obj.speak();
   }
}