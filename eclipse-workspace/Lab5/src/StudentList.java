
public class StudentList {
public static  Student[] list = new Student[2];
public static int count=0;

public static void addStudent(Student std){
	if (count>=10) return;
	list[count]=std;
	count++;
}
public static Student[] getStudentsWithAge(int age){
	int num=0; 
	for (int i=0;i<2;i++){
		 if (list[i].getAge()==age){
			 num++;
			 
		 }
	 }
	 Student[] agelist = new Student[num];
	 int j=0;
	 
	 for (int i=0;i<2;i++){
		 if (list[i].getAge()==age){
			 agelist[j]=list[i];
			 j++;
		 }
	 }
	 if (j==0) return null;
	 else return agelist;
	
	
}
public static Student[] getStudentsWithLastName(String lastName){
	int num=0; 
	for (int i=0;i<2;i++){
		 if (list[i].getName().getLname().equalsIgnoreCase(lastName)){
			 num++;
			 
		 }
	 }
	 Student[] lastnamelist = new Student[num];
	 int j=0;
	 for (int i=0;i<2;i++){
		 if (list[i].getName().getLname().equalsIgnoreCase(lastName)){
			 lastnamelist[j]=list[i];
			 j++;
		 }
	 }
	 if (j==0) return null;
	 else return lastnamelist;
	
	
}
public static Student[] getStudentsInRange(int minAge,int maxAge){
	int num=0;
	for (int i=0;i<2;i++){
		 if ((list[i].getAge()<=maxAge) && (list[i].getAge()>=minAge)){
			num++;
		 }
	 }

	Student[] agelist = new Student[num];
	 int j=0;
	 for (int i=0;i<2;i++){
		 if ((list[i].getAge()<=maxAge) && (list[i].getAge()>=minAge)){
			 agelist[j]=list[i];
			 j++;
		 }
	 }
	 if (j==0) return null;
	 else return agelist;
	
	
}

}
