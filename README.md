Exemple d'ús de Caché en Spring
=================================
La idea d'aquest programa és veure els avantatges que ofereixen els serveis de caché en el desenvolupament d'aplicacions web.

En l'exemple es desenvolupa un simple servei REST de colors en llengua catalana que a partir de la petició d'un color en català et diu el seu valor RGB

    $ curl localhost:8080/color/Vermell
    {"id":71,"nom":"Vermell","rgb":"#FF0000"}

Es poden veure tots els colors que hi ha a la base de dades amb (els he tret de la wikipèdia): 

     $ curl localhost:8080/colors

La petició als colors individuals s'ha "tunejat" perquè tardi 5 segons de manera que la primera petició a cada un dels colors tardarà una mica.

Programari
-----------------
Cal tenir **Maven** i **Java** instal·lats per poder fer servir el programa

* Fa servir **Spring Boot** però el que cal ja s'ho descarregarà Maven.
* Es fa servir **EhCache** per fer que les subsegüents peticions ja no tardin tan perquè no es torna a executar el mètode sinó que es retorna el resultat de la caché
* Està preparat per funcionar amb una base de dades a memòria **H2** de manera que no cal instal·lar cap servidor de base de dades

Iniciar el programa
--------------------

Al estar en Maven i Spring Boot per compilar-lo i posar-lo en marxa només cal executar: (el primer cop tardarà una mica perquè es descarrega les dependències) 

    $ mvn spring-boot:run
    ...
    ... Started ColorsCacheApplication in 4.963 seconds (JVM running for 7.153)

Quan el programa estigui en marxa es pot portar el navegador a http://localhost:8080/colors o  http://localhost/color/Vermell (o qualsevol altre color) per veure els resultats.

De totes formes és més fàcil fer les proves amb `curl` o `httpie` 

    $ curl http://localhost:8080/color/Groc



    