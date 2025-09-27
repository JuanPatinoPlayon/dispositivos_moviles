# AppU2 - Aplicación Android

## 📱 Descripción
Aplicación móvil desarrollada en **Java con Android Studio** que incluye un flujo básico de inicio y gestión de datos con SQLite.  
El proyecto cumple con los requerimientos de la actividad:  
- Pantalla de **Splash** (5 segundos).  
- Pantalla de **Login** conectada a base de datos SQLite.  
- **Menú principal de usuario** con navegación.  
- Implementación de **CRUD en SQLite** (crear, leer, actualizar y eliminar registros).  

---

## 🚀 Características principales
- **Splash Screen**: aparece al inicio durante 5 segundos y redirige al login.  
- **Login**: valida credenciales de usuario contra la base de datos SQLite.  
- **Base de datos SQLite**: gestionada con un `SQLiteOpenHelper` para persistencia.  
- **Menú de usuario**: acceso a opciones de la app.  
- **CRUD**: operaciones básicas sobre la tabla definida en SQLite.  

---

## 🛠️ Tecnologías utilizadas
- Java  
- Android Studio  
- SQLite  

---

## 📂 Estructura del proyecto
- `SplashActivity.java` → Pantalla de presentación.  
- `LoginActivity.java` → Inicio de sesión con base de datos.  
- `MainActivity.java` → Menú principal del usuario.  
- `DBHelper.java` → Clase de ayuda para la gestión de la base de datos SQLite.  

---

## ▶️ Cómo ejecutar el proyecto
1. Clonar el repositorio:
   ```bash
   git clone https://github.com/TU_USUARIO/TU_REPO.git
