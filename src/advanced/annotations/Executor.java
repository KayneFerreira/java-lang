package advanced.annotations;

import java.lang.reflect.Method;

public class Executor {

    public static void executeMethod(Object obj, String methodName, boolean isAdmin) throws Exception {
        // 1. Busca o método na classe
        Method method = obj.getClass().getMethod(methodName);

        // 2. Verifica se a etiqueta @RequireAdmin está no método
        if (method.isAnnotationPresent(RequireAdmin.class)) {
            // Se tiver a etiqueta e NÃO for admin, bloqueia
            if (!isAdmin) {
                System.out.println("X ERRO: Acesso negado para o método '" + methodName + "'. Requer perfil Admin.");
                return; // Encerra sem executar o método
            }
        }

        // 3. Se passou pela checagem (ou não tinha a etiqueta), executa o método
        method.invoke(obj);
    }
}