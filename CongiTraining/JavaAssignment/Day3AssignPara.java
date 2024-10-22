package JavaAssignment;

public class Day3AssignPara{
String studentName;
int studentAge;
//constructor
Day3AssignPara(String name, int age){
studentName = name;
studentAge = age;
}
void display(){
System.out.println(studentName+ " "+studentAge);
}
public static void main(String args[])
{
	Day3AssignPara myObj = new Day3AssignPara("Manan" , 19);
myObj.display();
}
}