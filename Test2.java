Aptitude

1 11 ,34


2 Zudio


3 Hello.50


4  sum is 200
 length is 4
 
 
 
 
 6) method parameters :
            Parameters are variables defined in the method declaration after the method name, inside the parentheses.
 This includes primitive types such as int, float, boolean, etc, and
 non-primitive  types such as an array, String. 
 You can pass values to the method parameters, at the method call.
 
 
 
 
 
 
 7) Compile time polymorphism achieve in method overloading.
   the same method having the different parameters.
   compile time polymorphism or virtual polymorphism ,
   method overloading not overloaded the user assumption that the one method perform the multiple task,but one method perform one task.
   
   
   
   
   
   
   8) var args is a short name for variable arguments.
   the varargs allows the mehthod to accept arguments
   
   Syntax:
   return_type method_name(data_type... variableName)
   {
	   
   }
   
   
   
   
   
   9) A java package is a group of similar types of classes, interfaces and sub-packages.

             Package in java can be categorized in two form,
                      * built-in package and 
                      * user-defined package.
					  
					  
					 Types of imports:
					 * Explicit import
					 * implicit import
					 
					 Explicit import : Classes are available inside the package.
					                   Explicit means direct 
									   when we give the proper path of the java class it will call as explicit import.
					 Implicit import : Implicit means indirect.
					 When we load all the classes of the package in our java code by using (*) it will call as implicit import.
	
	
	
	
	10) Constructor chaining is call the another constructer inside the constructor.
	             it is calling the constructor from the another constructor.
	        
			
			We can achieve constructor chaining in two ways:

Within the same class: If the constructors belong to the same class, we use this.
From the base class: If the constructor belongs to different classes (parent and child classes),
 we use the super keyword to call the constructor from the base class.

	
	    ex:      public class Student {
               
               
            	public Student(){
				    System.out.println("default construcor");
                 }
				public Student(int rollNo, String name){
                    this.rollNo = rollNo;
                    this.name=name
                }
                public Student(int rollNo,String name, int class){
				
                   this(rollNo,name);
				   this.class=class;
			    }
				   public static viod main(string[] args){
				   new Student();
				   Student student=new Student(31,"harsh",7);
				  System.out.println(student.rollNo);
				  System.out.println(student.name);
				  System.out.println(student.class);
				  
				}
			  }
			  
			  
			  
	
	
	


   11)	Fibonacci sequence using recursion:
             
			 
			 class Fibonacci{  
             public static void main(String args[])  
            {    
                int n1=0,n2=1,n3,i,count=10;    
                System.out.print(n1+" "+n2);    
    
                  for(i=2;i<count;++i)   
                      {    
                        n3=n1+n2;    
                       System.out.print(" "+n3);    
                         n1=n2;    
                         n2=n3;
					  }
			    }
			 }




   12)   By creating an isListOdd() function that takes a list of integers as input and 
           returns true if all the elements in the list are odd.
         Otherwise, it returns false.
		 
		 public class Odd{
			 public static void main(String[] args){
				 
				 boolean returnedValue=isListOddNumbers();
				 System.out.println("returnedValue);
				 
				 public static boolean isListOddNumbers(){
					 
					 if(the number is odd)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
			 }
		 }
		 }




   13) public class Array{
	         public static void main(String[] args){
				 
				 int[] ageOfStudents = {16,17,18};
	   		 System.out.println(noOfStudents[0]);
			 System.out.println(noOfStudents[1]);
			 System.out.println(noOfStudents[2]);
			 
			 int[] noOfStudents = {10,20,30};
	   		 System.out.println(noOfStudents[0]);
			 System.out.println(noOfStudents[1]);
			 System.out.println(noOfStudents[2]);
			 }
   }
			 
	      







14)Enumeration  : Enum is a speciaal class ,which contains the group of constants.
the enum constants are public , static,final.
enum cannot be used to create objects and it cannot extends other classes.
 

Example:
public class Exam {                                                           
			final static String inventedBy = "Henry Fischel";
			ExamModes mode;
			ExamResult result;
		
		
		
public static void main(String[] args)
	{
				

Exam exam = new Exam();
		System.out.println(exam.inventedBy);
		exam.mode = ExamModes.ONLINE;
		exam.result = ExamResult.PASS;
		System.out.println(exam.mode);
		System.out.println(exam.result);
		
	
	}
}

         enum ExamModes{                 //enum class
			ONLINE,OFFLINE;
		}
		enum ExamResult{
			PASS,FAIL,ABSENT,WITHHELD;
		}
		
		
		
		
		
		
		       (compiled)
 15) Name.java----------->Name.class
     
     
	            Jvm
	 java Name-------------->class loader
	 
	 the class loader loaded all the class ,and search for main mehod if it main method is present stack memory is created.
	 inside the stack memory stack frame will be created.
	 in that stack frame main() method ,variables , and and execution line present......
	 
	 the obeject is created inside the instance memory...for that object the address is created..
	 
	 next search for method and same repeated ...after the execution the stack frame will be deleted...
	 after the coplete execution stack memory will be deleted.
	 
	





	
	 
 16)     * static members: the static is fixed not changing.used to initialize the data members.
	 
	    * nonstatic members:he members declare inside the class and outside the method.




   
     
  




	
   