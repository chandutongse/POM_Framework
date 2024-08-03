package polymorphysum;

import java.util.concurrent.atomic.AtomicStampedReference;

public class MethodOverriding {
	/*
	 * rule 1-it is alwayes outside of class
	 * rule 2-same signature with return type should match
	 */
	void add(int a,int b) {}
	//addition of number
	public static void main(String[] args) {
		QTP ref=new QTP();
		System.out.println(ref.getToolCost());
		Appium a=new Appium();
		System.out.println(a.getToolCost());
		AtomationTool b=new Selenium();
		System.out.println(b.getToolCost());
		
		}

	}
class ChildOverrriding extends MethodOverriding{
	void add(int a,int b) {}
	//sub of number
}
class AtomationTool{
	int getToolCost() {return 0;}
}
class QTP extends AtomationTool{
	int getToolCost() {return 1000;}
}
class Appium extends AtomationTool{
	int getToolCost() {return 2000;}
	
}
class Selenium extends AtomationTool{
	int getToolCost() {return 10000;}	
}
class access{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}