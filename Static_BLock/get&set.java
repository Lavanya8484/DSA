import java.util.*;
class Main{
    public static void main(String[] args){
        Student obj = new Student();
        obj.setAge(19);
        int res = obj.getAge();
        obj.setName("lavanya");
        String res1 = obj.getName();
        obj.setIspassedout(true);
        boolean res2 = obj.getIspassedout();
        obj.setMarks(89);
        float res3 = obj.getMarks();
        obj.setErp(220303);
        long res4 = obj.getErp();
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
    }
}
class Student{
     int age; 
     String name;
     boolean passed;
     float marks;
     long ERP;
void setAge(int age1){
    this.age=age1;
}
int getAge(){
    return age;
}
void setName(String name1){
    this.name = name1;
}
String getName(){
    return name;
}
void setIspassedout(boolean passed1){
    this.passed = passed1;
}
boolean getIspassedout(){
    return passed;
}
void setMarks(float marks1){
    this.marks=marks1;
}
float getMarks(){
    return marks;
}
void setErp(long ERP1){
    this.ERP=ERP1;
}
long getErp(){
    return ERP;
}
}
