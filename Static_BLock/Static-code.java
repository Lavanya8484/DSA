
Code:
public class q2{
    public static void main(String[] args){
        Demo d1 = new Demo();
        Demo d2 = new Demo();
    }
}
//when craeted objects constructor invoked automatically.
class Demo{
    static{//syntax for static block-(singleton-block)
        System.out.println("stb");
    }
    Demo(){//constructor->initialization of objectts
        System.out.println("cns");
    }
}

//we created two objects so 2 times the constructor will be called!
