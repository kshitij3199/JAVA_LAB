import java.util.*;
public class Name {
private String fname;
private String mname;
private String lname;

Name(String name){
	if (name.indexOf(",")>-1){
		
	
	StringTokenizer st = new StringTokenizer(name,",");
	fname = st.nextToken();
	mname = st.nextToken();
	lname = st.nextToken();
	}
	else {
	StringTokenizer st = new StringTokenizer(name,";");
	fname = st.nextToken();
	lname = st.nextToken();
	mname = st.nextToken();
	}
}

public String getFname() {
	return fname;
}



public String getMname() {
	return mname;
}


public String getLname() {
	return lname;
}
public String getName(){
	return fname+" "+mname+" "+lname;
}
public String toString(){
	return fname+mname+lname;
}

}
