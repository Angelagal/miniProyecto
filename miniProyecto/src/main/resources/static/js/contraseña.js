const { createApp, ref } = Vue;

createApp({
  setup() {
    const email = ref("");
    const password = ref("");
    const repeatPassword = ref("");
    const message = ref("");

    const submit = async () => {
      if (password.value !== repeatPassword.value) {
        message.value = "Las contraseñas no coinciden";
        return;
      }

      try {
        const response = await fetch("/api/password-reset", {
          method: "POST",
          headers: { "Content-Type": "application/json" },
          body: JSON.stringify({
            email: email.value,
            password: password.value,
          }),
        });

        if (response.ok) {
          message.value = "Contraseña actualizada correctamente.";
        } else {
          message.value = "Error al actualizar la contraseña.";
        }
      } catch (error) {
        message.value = "Error de conexión con el servidor.";
      }
    };

    return { email, password, repeatPassword, message, submit };
  },
}).mount("#app");
