package design_patterns.creational.builder;

public class UserEntity {

    private final String name;
    private final String email;
    private final Integer age;

    // Construtor padrão privado. Acessado somente pelo builder
    private UserEntity(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    // Classe builder estática
    public static class UserBuilder {
        private final String name;
        private String email;
        private Integer age;

        // Campos obrigatórios são inseridos no construtor do builder
        public UserBuilder(String name) {
            this.name = name;
        }

        // Setters constroem o objeto inteiro e retornam ele mesmo
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        // Retorna o objeto construído
        public UserEntity build() {
            return new UserEntity(this);
        }
    }

    public String toString() {
        return "\n======================================" +
                "\nNovo Usuário: " +
                "\n\tNome: " + this.name +
                "\n\tIdade: " + this.age +
                "\n\tEmail: " + this.email;
    }
}
