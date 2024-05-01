package src.sealed_class_interface;


sealed class AClass implements AInter permits BClass, CClass {
    String nome;

    @Override
    public void myMethod() {

    }
}
