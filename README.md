# PElectrodomestico
Prueba Individual N2

La evaluación partió con la creación de la superclase Electrodoméstico, con la instanciación
de los atributos indicados en la descripción del proyecto "Programación Orientada a Objetos"
y se le asignaron sus valores por defecto, se crearon los contructores y los métodos indicados.
En el caso de los métodos de comprabarConsumoEnergetico() y comprobar color() se crearon como
métodos privados y se instanciaron como el valor correspondientes a los atributos cuando el
constructor lo solicitó. Las clases hijas Lavadora y Televisión, se extendieron de la superclase
con todos sus atributos y se le asignaron otros según la clase.

Tanto la superclase como las subclases contemplaban el método precioFinal(), pero no se consideró
eficiente realizar una Interfase ya que era sólo uno. En su lugar, en la superclase se realizaró
la instanciación de una variable local llamada valorRetorno la que se igualó al precioBase la que
se modifico mediante el uso de bucles de sentencias if y else if según el rango entre los cuales
variaba el precio. En el caso de las clases hijas también de instanció la variable local valorRetorno,
pero en este caso la variable fue igualada al valor del metodo precioFinal() entregado por la
superclase ya que este ya contenía las modificaciones de precio antes descritas.

La clase Lista es la clse main en ella se instació un arreglo llamado electrodomesticos el cual se
relleno con objetos de la super clase Electrodomestico y sus hijas (Lavadora y Television).
Para recorer el arreglo se utilizó un for y se anidó en el una sentencia if en la cual se usó el 
operador instanceof para identificar las lavadoras del arreglo y luego poder imprimir el metodo
precioFinal() corresondiente a los objetos Lavadora. Luego se repitió el bucle pero esta vez el 
instanceof identifico los telesivores.
Finalmente se aplicó un bucle for para sumar todos los valores de precioFinal() de los objetos
Electrodomestico al interior del arreglo, y una vez cerrado el bucle se imprimió el valor de la suma
total, utilizando la variable valorTotal instanciada al comienzo de la clase.
