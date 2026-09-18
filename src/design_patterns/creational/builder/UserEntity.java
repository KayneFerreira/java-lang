package design_patterns.creational.builder;

public class UserEntity {

    private final String name;
    private final String email;
    private final Integer age;

    private UserEntity(UserBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
    }

    public static class UserBuilder {
        private String name;
        private String email;
        private Integer age;

        // Campos obrigatórios são inseridos no construtor do builder
        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

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
