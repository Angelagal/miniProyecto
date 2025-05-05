package gm.grp.service;
import org.springframework.stereotype.Service;

@Service
public class PasswordResetService {

    public boolean resetPassword(String email, String newPassword) {
        // Aquí deberías buscar el usuario en la base de datos
        // y actualizar la contraseña (encriptada).
        // Esto es un ejemplo simulado:

        System.out.println("Restableciendo contraseña para: " + email);
        System.out.println("Nueva contraseña: " + newPassword);
        return true;
    }
}