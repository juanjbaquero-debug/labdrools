# Laboratorio: Sistema de Reglas de Negocio con Spring Boot y Drools

Este proyecto implementa un Sistema de Gestión de Reglas de Negocio (BRMS) utilizando **Spring Boot** y el motor de reglas **Drools**. El proyecto se divide en dos módulos prácticos diseñados para demostrar la separación de la lógica de negocio del código fuente.

## Módulos del Proyecto

1. **Evaluación de Créditos (MVC):** Una interfaz web renderizada con Thymeleaf que evalúa datos de clientes para aprobar o rechazar solicitudes de crédito y asignar tasas de interés.
2. **Aerolínea Virtual (API REST):** Un endpoint que evalúa los datos de un pasajero y su vuelo para otorgar beneficios (ascensos a clase ejecutiva, descuentos por equipaje, acceso a sala VIP, etc.) basado en 10 reglas de negocio.

## Tecnologías Utilizadas
* **Java 17**
* **Spring Boot**
* **Drools (KIE Container)**
* **Thymeleaf**
* **Maven**

## Instrucciones de Ejecución

1. Asegúrate de tener **JDK 17** instalado en tu sistema.
2. Clona este repositorio:
   ```bash
   git clone [https://github.com/juanjbaquero-debug/labdrools.git](https://github.com/juanjbaquero-debug/labdrools.git)