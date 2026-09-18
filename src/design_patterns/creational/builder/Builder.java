import design_patterns.creational.builder.UserEntity;

/**
 * O padrão Builder é um padrão de projeto criacional que resolve o problema de construir objetos complexos
 * passo a passo, evitando construtores gigantescos (conhecidos como _telescoping constructors_) ou objetos
 * em estado inconsistente.
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