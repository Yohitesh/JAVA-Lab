
class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    int age;

    
    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.age = age;
        System.out.println("Father's age is set to " + this.age);
    }
}

class Son extends Father {
    int sonAge;

   
    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge); 
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is set to " + this.sonAge);
    }
}

public class Main8 {
    public static void main(String[] args) {
        System.out.print("1BM23CS085, Dama Yohitesh Naveen Sai\n");
        try {
           Son son1 = new Son(40, 45); 
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
          
            Son son2 = new Son(40, 30);  
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}