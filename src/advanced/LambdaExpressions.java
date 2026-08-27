/*
Lambda Expressions permitem passar uma função como argumento para um método ou
armazená-la em uma variável de forma curta e direta, sem a necessidade de criar
classes inteiras ou usar classes anônimas verbosas.
 */
@SuppressWarnings("all")
void main() {

    List<Integer> numeros = List.of(1, 2, 3, 4, 5);

    // Lambda completa (declarando tipo de entrada e bloco com return)
    numeros.stream()
            .map((Integer n) -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo
    numeros.stream()
            .map((n) -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem parênteses
    numeros.stream()
            .map(n -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem chaves ou return
    numeros.stream()
            .map((n) ->  n * 2)
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem parênteses, chaves ou return (idiomático)
    numeros.stream()
            .map(n -> n * 2)
            .forEach(n -> System.out.println(n));


    // Method Reference (afunilamento máximo)
    numeros.stream()
            .map(n -> n * 2)
            .forEach(System.out::println);

}