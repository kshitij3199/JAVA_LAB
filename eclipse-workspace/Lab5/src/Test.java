import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Test {
public static Student readStudent() throws IOException{
	
	
	  Scanner in = new Scanner(System.in); 
	  String fname = in.nextLine();
	  String mname = in.nextLine();
	  String lname = in.nextLine();
	  
	  int format = in.nextInt();
	  int age = in.nextInt();
	  String name;
	  if (format==1){
		  name=fname+","+mname+","+lname;
		  
	  }
	  else {
		  name = fname+";"+lname+";"+mname;
	  }
	  Name nm = new Name(name);
	  Student st = new Student(nm, age);
	  return st;
	  
	  
}
public static void main(String args[]) throws IOException{
	/* 1. Write java code for reading details of 10 students and add them
	in the static list of StudentList class.*/
	for(int i=0;i<2;i++){
		StudentList.list[i]=readStudent();
	}
	/* 2. Write java code for displaying all the students with age 20 from
	static list field of StudentList class*/
//	Student[] al = StudentList.getStudentsWithAge(20);
//	if (al ==null)
//		System.out.println("no such list");
//	else
//	{
//		for (Student st :al){
//		System.out.println(st.name +":"+ st.getAge());
//		}	
//	}
	/* 3. Write java code for displaying the student details for all students
	having last name “Sharma” from static list of StudentList class*/

//	Student[] ll = StudentList.getStudentsWithLastName("Sharma");
//	if (ll ==null)
//		System.out.println("no such last name list");
//	else
//	{
//		for (Student st :ll){
//		System.out.println(st.name +":"+ st.getAge());
//		}	
//	}
	/* 4. Write java code for displaying all the students whose age falls in
	 the range minAge = 16 and maxAge = 20 from static list of StudentList
	 class*/
	Student[] rl = StudentList.getStudentsInRange(16, 20);
	if (rl ==null)
		System.out.println("no such range  list");
	else
	{
		for (Student st :rl){
		System.out.println(st.name +":"+ st.getAge());
		}	
	}

	
}
}

