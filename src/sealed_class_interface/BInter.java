package src.sealed_class_interface;

// può essere sia seald che non-seald
non-sealed interface BInter extends AInter {
    @Override
    void myMethod();
}
