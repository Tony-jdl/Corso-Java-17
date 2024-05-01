package src.sealed_class_interface;


sealed interface AInter permits AClass, BInter {
    void myMethod();
}
