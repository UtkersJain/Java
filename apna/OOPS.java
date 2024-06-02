package apna;

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen() ;
        // p1.setColor("Blue");
        // p1.setTip(4);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

 
        // BankAccount myAcc = new BankAccount() ;
        // myAcc.username = "Utkers" ;
        // // myAcc.password = "abcd" ;   //will show error 
        // myAcc.setPassword("abcd");

        Student s1 = new Student() ;
        s1.name = "Utkers" ;
        s1.roll_no = 456 ;
        s1.passw = "asc" ;
        s1.marks[0] = 100 ;
        s1.marks[1] = 95 ;
        s1.marks[2] = 98 ;
        
        
        Student  s2 = new Student(s1) ;
        s2.passw = "xyz" ;
        s1.roll_no = 414 ;
        s1.marks[0] = 200 ;
        s2.printValues();
        
    }
}

class Pen {
    private String color ;
    private int tip ;

    String getColor() {
        return this.color ;
    }

    int getTip() {
        return this.tip ;
    }
    
    void setColor(String newColor) {
        color = newColor ;
    }

    void setTip(int tip) {
        this.tip = tip ;
    }
}

class BankAccount {
    public String username ;
    private String password ;

    public void setPassword(String pwd) {
        password = pwd ;
    }
    

}

class Student {
    String name ;
    int roll_no ;
    String passw ;
    int marks[] ;

    Student () {
        marks = new int[3] ;
    }
    
    // //shallow constructor
    // Student(Student s1) {
    //     marks = new int[3] ;
    //     this.name = s1.name ;
    //     this.roll_no = s1.roll_no ;
    //     this.marks = s1.marks ;
    // }

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3] ;
        this.name = s1.name ;
        this.roll_no = s1.roll_no ;
        for(int i=0 ; i<marks.length ; i++) {
            this.marks[i] = s1.marks[i] ;
        }
    }
    void printValues() {
        System.out.println("Name : "+this.name);
        System.out.println("Roll_no : "+this.roll_no);
        System.out.println("Password : "+this.passw);
        System.out.println(this.marks[0]);
    }
}
