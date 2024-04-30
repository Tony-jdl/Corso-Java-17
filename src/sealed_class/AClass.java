package src.sealed_class;

sealed class AClass permits BClass, CClass {
    String nome;
}
