package interFace;


/*
 * interface is templet to acheive 100% of abstraction.
 * by defaut all the method is abstract in inerface
 * it supports multiple inheritance(implements)
 */
public interface ParentInterface {
	void add();
	void multiply();

}
interface ParentTwoInterface{
	void sub();
	
}
class InterFaceCall implements ParentInterface,ParentTwoInterface{
	/*
	 * how to remove error
	 * 1 make class as abstract class
	 * 2 override all the methods
	 */
	public void add() {}
	public void mltiply() {}
	public void sub() {}
	
}
//why in interface
interface A{
	void add();
	}
interface B{
	void add();
	
}
class C implements A,B{
	public void add() {}
}
//why not in class
abstract class d{
	void add() {}
}

abstract class E{
	void add() {
		
	}
	class F extends d,E{
		public void add() {}
	}
}