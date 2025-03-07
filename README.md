# 📄 Descripció - Enunciat de l'exercici

## Nivell 1 - Exercici 1: Manipulació d'ArrayList i HashSet

En aquest exercici, es crea una classe anomenada **Month** amb un atribut "name" per emmagatzemar el nom del mes de l'any.

1. Es creen **11 objectes Month** i s'afegeixen a un **ArrayList**, excepte "Agost".
2. Es realitza la inserció de "Agost" en la posició correcta per mantenir l'ordre dels mesos.
3. Es converteix l'**ArrayList** en un **HashSet** per assegurar-se que no permet duplicats.
4. Es recorre la llista utilitzant **un bucle for** i **un iterador**.

---

## Nivell 1 - Exercici 2: Llistes i ListIterator

1. Es crea i emplena un **List<Integer>** amb diversos valors.
2. Es crea un segon **List<Integer>** on s'insereixen els elements de la primera llista en **ordre invers**.
3. Es fa ús d'**objectes ListIterator** per llegir els elements de la primera llista i inserir-los a la segona.

---
## Nivell 1 - Exercici 3: Quiz de Capitals

**Objectiu**
- Desenvolupar un programa en Java que llegeixi un fitxer de text countries.txt, on cada línia conté el nom d’un país i la seva capital separats per una coma. El programa guardarà aquestes dades en un HashMap<String, String> i realitzarà un joc de preguntes per a l'usuari.

**Funcionament**
- Llegir el fitxer countries.txt i emmagatzemar els països i capitals en un HashMap<String, String>.
Demanar el nom de l'usuari/ària.
- Mostrar 10 països de forma aleatòria i demanar a l'usuari que escrigui la seva capital.
Si l'usuari encerta, suma 1 punt.
- Al final del joc, desar el nom de l’usuari i la seva puntuació en el fitxer classificacio.txt.

**Requisits**
- Utilitzar un HashMap<String, String> per emmagatzemar les dades.
- Llegir i escriure fitxers amb FileReader i FileWriter o equivalents.
- Fer servir una estructura repetitiva per gestionar les 10 preguntes.
- Usar un Random per seleccionar els països de manera aleatòria.
  
---

# 💻 Tecnologies Utilitzades

- **Java**
- **Col·leccions en Java (ArrayList, HashSet, ListIterator)**
- **Iteradors en Java**

---

# 📋 Requisits

Per a executar aquest projecte, es requereix:

- **JDK 8 o superior**
- Un entorn de desenvolupament com **IntelliJ IDEA, Eclipse o VS Code** amb extensió per a Java
- Coneixements bàsics de **Java** i **col·leccions**

### Per compilar i executar el programa des de terminal:
```sh
javac Month.java Main.java
java Main
```

