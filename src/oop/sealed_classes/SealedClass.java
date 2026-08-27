package oop.sealed_classes;

/*
Introduzido na versão 15, e lançado oficialmente na versão LTS 17, as classes
sealed classes servem para restringir e controlar quais outras classes ou
interfaces podem herdá-las, ou implementá-las. Sealed classes podem ser
abstratas.
 */
public abstract sealed class SealedClass permits NonSealedClass, FinalClass {

}
