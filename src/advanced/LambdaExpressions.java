/*
Lambda Expressions permitem passar uma função como argumento para um método ou
armazená-la em uma variável de forma curta e direta, sem a necessidade de criar
classes inteiras ou usar classes anônimas verbosas.
 */
@SuppressWarnings("all")
void main() {

    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    // Lambda completa (declarando tipo de entrada e bloco com return)
    numbers.stream()
            .map((Integer n) -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo
    numbers.stream()
            .map((n) -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem parênteses
    numbers.stream()
            .map(n -> { return n * 2; })
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem chaves ou return
    numbers.stream()
            .map((n) ->  n * 2)
            .forEach(n -> System.out.println(n));


    // Inferência de tipo sem parênteses, chaves ou return (idiomático)
    numbers.stream()
            .map(n -> n * 2)
            .forEach(n -> System.out.println(n));


    // Method Reference (afunilamento máximo)
    numbers.stream()
            .map(n -> n * 2)
            .forEach(System.out::println);


    // Concept
    numbers.forEach((Integer n) -> { System.out.println(n); } );
    numbers.forEach((n) -> { System.out.println(n); } );
    numbers.forEach((n) -> System.out.println(n) );
    numbers.forEach(n -> System.out.println(n) );
    numbers.forEach( System.out::println );
}