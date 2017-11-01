package conceptTest;
class Base2 {
static void display() {
System.out.println("Static or class method from Base");
}
public void print() {
System.out.println("Non-static or instance method from Base");
}
}
class Derived extends Base2 {
static void display() {
System.out.println("Static or class method from Derived");
}
public void print() {
System.out.println("Non-static or instance method from Derived");
}

}

public class base {
	public static void main(String args[])
	{
	Base2 obj1= new Derived();
	obj1.display();
	obj1.print();
	}
}
