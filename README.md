🛠️ 1. Compila el proyecto
Desde la terminal, ubícate en la carpeta PokemonSOAP y ejecuta: " mvn clean compile ", luego "  mvn exec:java ".

🧩 Requisitos
Java + Maven
Postman instalado

📦 2. Pokemon SOAP API - Uso con Postman
Este proyecto expone un servicio SOAP desarrollado en Java que permite gestionar cartas Pokémon. Puedes agregar, listar, buscar, actualizar y eliminar cartas usando Postman.

📍 WSDL del Servicio
Abre en tu Postman para y coloca la dirección WSDL: " http://localhost:8080/cartas?wsdl ".

🛠 Cómo usar en Postman
1. Crear una nueva petición
3. Método: POST
   URL: http://localhost:8080/cartas

🧾 3. Configurar los headers
Ve a la pestaña Headers y agrega:

Key= " Content-Type "	Value= " text/xml; charset=UTF-8 " 

🧪 4. Escribir el body (SOAP XML)
Ve a la pestaña Body:

Marca la opción raw
Selecciona el tipo XML en el combo de la derecha

🧩 5. Escribe un ejemplo de petición
✏️ Agregar una carta Pokémon

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://pokemon.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:agregarCarta>
         <codigo>001</codigo>
         <nombre>Pikachu</nombre>
         <precio>3000.0</precio>
         <rareza>Rara</rareza>
      </ser:agregarCarta>
   </soapenv:Body>
</soapenv:Envelope>

✅ Obtener todas las cartas:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://pokemon.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:obtenerCartas/>
   </soapenv:Body>
</soapenv:Envelope>

🔍 Buscar por código o nombre:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://pokemon.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:buscarCarta>
         <criterio>Pikachu</criterio>
      </ser:buscarCarta>
   </soapenv:Body>
</soapenv:Envelope>

🛠️ Actualizar una carta:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://pokemon.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:actualizarCarta>
         <codigo>001</codigo>
         <nuevoNombre>Pikachu EX</nuevoNombre>
         <nuevoPrecio>5000.0</nuevoPrecio>
         <nuevaRareza>Ultra Rara</nuevaRareza>
      </ser:actualizarCarta>
   </soapenv:Body>
</soapenv:Envelope>

❌ Eliminar una carta:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://pokemon.com/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:eliminarCarta>
         <codigo>001</codigo>
      </ser:eliminarCarta>
   </soapenv:Body>
</soapenv:Envelope>
