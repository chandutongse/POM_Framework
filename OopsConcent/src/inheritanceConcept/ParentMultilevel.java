package inheritanceConcept;

public class ParentMultilevel {

	int age=32; 
		
	}
class ChildMutilevel extends ParentMultilevel{
	String name="ram";
	
}
class ChildOFChild extends ChildMutilevel{
	int dept=4;
	
	public void accessmutilevel(){
		
    ChildOFChild instance=new ChildOFChild();
    System.out.println(instance.age);
    System.out.println(instance.name);
    System.out.println(instance.dept);
    
    ChildMutilevel inst=new ChildOFChild();
    System.out.println(inst.age);
    System.out.println(inst.name);
    //System.out.println(inst.dept);//not possible becase access common variable
    ParentMultilevel ref1=new ChildOFChild();
    System.out.println(ref1.age);//only one access
    
    
    //ChildOFChild ref=new ParentMultilevel();//error beacuse child cant ref parent memory
                                        //parent ref child memory
     
    
		
	}
	
}


