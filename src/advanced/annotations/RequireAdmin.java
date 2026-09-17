package advanced.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // Só pode ser usada em métodos
@Retention(RetentionPolicy.RUNTIME) // Fica salva para ser lida com o sistema rodando
public @interface RequireAdmin {
}