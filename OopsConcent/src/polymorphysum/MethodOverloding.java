package polymorphysum;


/*
 * polymorphysum-one can be perform in multiple way
 * types of poly-2
 * 1 compile time,method overloding,static binding,early binding
 * 2 run time,method overiding,dynamic binding,late binding
 */
public class MethodOverloding {
	//Methodoverloding
	//rule 1-it is always within a same class
	//rule 2-same method name diffrent #(number) of parameters
	void add() {}
	void add(int a) {}
	void add(int a,int b) {}
	//rule 3-same method name same number of parameter but order is diffrent
	void add(int a,String b) {}
	void add(String a,int b) {}
	//rule 4 -same method name same number of paranmeter but data type is deffrent
	void add(String a,String b) {}
	void add(char a,char b) {}
	//rule 5-return type dose not matter,signature matters
	//int add() {return 1;}
	
	//void print(int a,int b,int c) {}
	//void print(int x,int y,int c) {}//not possible beacuse same data type
	
	 
}
