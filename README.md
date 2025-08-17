# Foro API REST – Java & Spring Boot

API REST para un foro donde los usuarios pueden **crear, listar y eliminar tópicos**.  
Incluye **autenticación JWT** para proteger rutas críticas.

---

## Funcionalidades

- **Registro de usuarios:** `POST /auth/register`  
- **Login y JWT:** `POST /auth/login` → devuelve token Bearer  
- **Listar tópicos:** `GET /topics`  
- **Crear tópicos:** `POST /topics` (requiere token)  
- **Eliminar tópicos:** `DELETE /topics/{id}` (requiere token)  

---
##Seguridad
Endpoints de creación y eliminación requieren Bearer token en el header:
Authorization: Bearer <JWT>

##Base de datos

1. Compatible con H2, MySQL o PostgreSQL.
2. Para pruebas rápidas, se puede usar H2 en memoria:
3. jdbc:h2:mem:forodb
---

## Modelo de Tópico
```json
{
  "userId": 1,
  "title": "Mi primer tópico",
  "message": "Tengo una duda sobre Java",
  "course": "Java Básico"
}



🔹 Pruebas con Insomnia
-Registrar usuario → POST /auth/register
-Login → POST /auth/login → copiar token
-Crear tópico → POST /topics con token
-Listar tópicos → GET /topics
-Eliminar tópico → DELETE /topics/{id} con token
