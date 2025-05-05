<template>
  <body>
    <div class="container">
      <form @submit.prevent="submitEmail">
        <label for="email">Correo electrónico:</label>
        <input type="email" id="email" v-model="email" required />

        <button type="submit">Enviar enlace</button>

        <p v-if="message" class="message">{{ message }}</p>
      </form>
    </div>
  </body>
</template>

<script setup>
import { ref } from "vue";

const email = ref("");
const message = ref("");

const submitEmail = async () => {
  try {
    const response = await fetch("/api/password-recovery", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({ email: email.value }),
    });

    if (response.ok) {
      message.value = "Se ha enviado un enlace a tu correo.";
    } else {
      message.value = "Error al enviar el enlace. Verifica tu correo.";
    }
  } catch (error) {
    message.value = "Error de conexión con el servidor.";
  }
};
</script>

<style scoped>
body {
  background-image: url(../img/fina.jpg);
  background-repeat: no-repeat;
}
.container {
  max-width: 400px;
  margin: auto;
  padding: 1rem;
  border: 1px solid #770000;
  border-radius: 8px;
}
input {
  width: 100%;
  padding: 0.5rem;
  margin-top: 0.5rem;
  margin-bottom: 1rem;
}
button {
  padding: 0.5rem 1rem;
  background-color: #000000;
  border: none;
  color: rgb(0, 0, 0);
  cursor: pointer;
}
.message {
  margin-top: 1rem;
  color: green;
}
</style>
