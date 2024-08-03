package inheritanceConcept;

public class MultipleParentOne {
	
	int age=32;
   void add() {}
}
class MultipleParentTwo{
	String name="ram";
	void add() {} //java dosent know which method to call
}

class MultipleChild extends MultipleParentOne,MultipleParentTwo{
	//java says i am not going to allow you multiple inheritance of classes because of ambiguity 
}
class access {
	public void access() {
		MultipleChild instance=new MultipleChild();
		System.out.println(instance.age);
		System.out.println(instance.name);
	}
}
