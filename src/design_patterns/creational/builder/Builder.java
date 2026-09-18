import design_patterns.creational.builder.UserEntity;

/**
 *
 */
void main() {

    UserEntity u1 = new UserEntity.UserBuilder("Roberto Rongo")
            .build();

    UserEntity u2 = new UserEntity.UserBuilder("Poucas Trancas")
            .setEmail("poucas.trancas@email.com")
            .build();

    UserEntity u3 = new UserEntity.UserBuilder("Quase Nada")
            .setEmail("quase.nada@email.com")
            .setAge(35)
            .build();

    System.out.println(u1);
    System.out.println(u2);
    System.out.println(u3);
}