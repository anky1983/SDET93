package assignments;

public class Student {
int sub1;
int sub2;
int sub3;
int sub4;
int total;

public int totalMarks() {
	total = sub1 + sub2 + sub3 + sub4;
	System.out.println("Total marks: " + total);
	return total;
}

public void average() {
	float average  = total/4;
	System.out.println("Average marks: " + average);
	System.out.println();
}

public static void main(String[] args) {
	Student stu1 = new Student();
	stu1.sub1 = 48;
	stu1.sub2 = 87;
	stu1.sub3 = 71;
	stu1.sub4 = 69;
	System.out.println("Student1:");
	stu1.totalMarks();
	stu1.average();
	
	Student stu2 = new Student();
	stu2.sub1 = 89;
	stu2.sub2 = 95;
	stu2.sub3 = 73;
	stu2.sub4 = 87;
	System.out.println("Student2:");
	stu2.totalMarks();
	stu2.average();
	
	Student stu3 = new Student();
	stu3.sub1 = 99;
	stu3.sub2 = 72;
	stu3.sub3 = 94;
	stu3.sub4 = 88;
	System.out.println("Student3:");
	stu3.totalMarks();
	stu3.average();
	
	Student stu4 = new Student();
	stu4.sub1 = 69;
	stu4.sub2 = 85;
	stu4.sub3 = 74;
	stu4.sub4 = 86;
	System.out.println("Student4:");
	stu4.totalMarks();
	stu4.average();
	
}
}
