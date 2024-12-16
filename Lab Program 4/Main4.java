
abstract class Animal {
    abstract void eat();

    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Hunt");
    }

    @Override
    void sleep() {
        System.out.println("Sleeping");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Grass");
    }

    @Override
    void sleep() {
        System.out.println("Deer Resting");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger is eating!");
    }

    @Override
    void sleep() {
        System.out.println("Tiger Sleeping");
    }
}

public class Main4 {
    public static void main(String[] args) {
        System.out.println("1BM23CS085, Dama Yohitesh Naveen Sai");
        Animal l = new Lion();
        l.eat();
        l.sleep();
        Animal d = new Deer();
        d.eat();
        d.sleep();
        Animal t = new Tiger();
        t.eat();
        t.sleep();
        
    }
}
