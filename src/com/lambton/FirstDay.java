package com.lambton;

import sun.jvm.hotspot.types.CIntegerField;
import sun.jvm.hotspot.types.CIntegerType;

public class FirstDay
{
    public static void main(String[] args)
    {
System.out.println("welcome to java programming");
//variable declaration
int a,b,c;
//value assignment
a=10;
b=130;

//perform multiplication
c=a+b;

System.out.println("Sum is " + c);
int x = Integer.MAX_VALUE;
System.out.println("x  " + x);

int y= x +1;
System.out.println("y" +1);
System.out.println("min 1" + Integer.MAX_VALUE);

student s1 =new student();
        s1.setvalues();
s1.display();
student s2 = new student();
s2.studentID=2;
s2.student_name="anmol sharma";
s2.display();
student s3=new student();
s3.studentID=3;
s3.student_name="rizul goyal";


s3.display();
    }
}
