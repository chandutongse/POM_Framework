package inheritanceConcept;

/*
 * inheritance-means aquire the propery of another class
 * 5 types of inheritance
 * 1 single
 * 2 multilevel
 * 3 hyrachical
 * 4 multiple
 * 5 haybrid/dimond
 */

//single inheritance

public class ParentSingleInheritance {
	int age=32;
	}
class ChildInheritance extends ParentSingleInheritance{
	String name="ram";
	
}
class AccessInheritance{
	
	public void access() {
	
	ChildInheritance instance=new ChildInheritance();
	System.out.println(instance.age);
	System.out.println(instance.name);
	
	ParentSingleInheritance inst=new ChildInheritance();
	System.out.println(inst.age);
	//System.out.println(inst.name);//cant access child variable beacuse not common
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}