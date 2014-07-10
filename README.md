## Proyecto 1 Templeate
Generar el proyecto 1

### Crear el proyecto para IDEA
````
gradle idea
````

### Crear un jar
````
gradle jar
````

### Checar la version de JPOS
````
gradle version
````

### Crear una aplicacin distribuible
````
gradle dist
````
This creates a tar gzipped file in the `build/distributions` directory.

### Install application in 'build/install' directory
````
gradle installApp
````
Installs application in `build/install` with everything you need to run jPOS. Once the directory is created, you can `cd build/install` and call `java -jar your-project-version.jar` or the `bin/q2` (or `q2.bat`) script available in the `bin` directory.

### Generate an install a Maven artifact
````
gradle install
````

### List available Gradle tasks
````
gradle tasks
````
