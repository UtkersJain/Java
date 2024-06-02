package apna;


public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Utkers");
        s1.roll = 457;
        s1.schoolName = "avbd";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    int returnPercentage(int math, int phy, int chem) {

        return (math + phy + chem) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    void getName() {

    }

}
