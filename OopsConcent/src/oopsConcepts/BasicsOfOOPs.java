package oopsConcepts;

public class BasicsOfOOPs {
   int age=32;
	public static void main(String[] args) {
		System.out.println("selected");
	/*
	 * OOPS-object orianed programing
	 * class-it is a templet collection of objects
	 * object-collections of data member(variable and method)
	 * instance-just a reference to the object
	 * 
	 * types of opps-java says 4 but there is 7 oops concent without class object instance 
	 * we can not do oops concent
	 * 1 class
	 * 2 object
	 * 3 instance
	 * 4 inheritance
	 * 5 polymorphysum
	 * 6 encapsulation
	 * 7 abstaction
	 * 
	 */
   BasicsOfOOPs instance=new BasicsOfOOPs();
   System.out.println(instance.age);
   System.out.println(new BasicsOfOOPs().age);//interview question-this is not error
   
   
	}

}
//do you thik i am creating multiple class within the class-yes we can
  class a{
	 int val=32;
 }
  class b{
	 String name="ram";
 }