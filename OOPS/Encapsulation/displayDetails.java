package OOPS.Encapsulation;

class Student{
    private String name;
    private int rollNumber;
    private int marks;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public int getRollNumber(){
        return rollNumber;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
        
}

public class displayDetails {
    public static void main(String[] args) {
        
        Student obj = new Student();

        obj.setName("Pallavi");
        obj.setRollNumber(210);
        obj.setMarks(456);

        System.out.println(obj.getName());
        System.out.println(obj.getRollNumber());
        System.out.println(obj.getMarks());

    }
}
