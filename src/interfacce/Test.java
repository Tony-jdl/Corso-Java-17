package src.interfacce;

public class Test {
     public static void main(String[] args){
//        AClass a = new AClass();
//        IMyInterface in = a;
//        in.myMethod1();
//
//        IMyInterface in2 = new AClass();
//        in2.myMethod1();

         AClass a = new AClass();
         BClass b = new BClass();

         IMyInterface mi1 = a;
         mi1.myMethod1();

         IMyInterface2[] mi2 = {a,b};
         for (IMyInterface2 i : mi2){
             i.myMethod2();
         }
    }
}
