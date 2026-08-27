package oop.sealed_classes;

/*
Classes que herdam de sealed classes precisam ser sealed, non-sealed ou final.
Considerando que se a classe for sealed ela precisa obrigatóriamente que uma
classe herde dela através da keyword 'permits'. Se a classe for non-sealed,
ela passa a permitir que qualquer outra classe herde diretamente dela. Caso
não queira que a classe não permita mais sub-classes, basta declara a classe
como 'final'.
 */
public non-sealed class NonSealedClass extends SealedClass {

}
