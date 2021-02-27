# Centro_Vacunacion
Centro de vacunación para recibir la vacuna contra el Covid. Uso de arrays, matrices, colas, listas ordenadas,  clases abstractas, herencia, interfaces, polimorfismo.

Dada la expectativa por la vacuna contra el Covid, ya es posible inscribirse voluntariamente a un centro de
vacunación para recibirla.

Todo aquel que sea vacunable debe ser capaz de devolver un valor que indica la prioridad para ser
atendido. Tales valores representan: 0 para Prioridad máxima, 1 para Prioridad media y 2 para Prioridad
mínima.

Serán vacunables todas las personas (de las que se pretende saber DNI, nombre, edad y si es o no paciente
de riesgo). 
La máxima prioridad es para aquellas que sean de riesgo o cuya edad supere los 60 años. Las
personas menores de 30 años tendrán prioridad mínima. El resto, prioridad media.

Hay personas consideradas esenciales, como las médicas, de las cuales interesa saber su matrícula y
además siempre tendrán máxima prioridad. También interesa discriminar a personas que se desempeñen
en la educación obligatoria, interesando saber en qué nivel se desempeñan (Inicial, Primario o Secundario).
De este tipo de personas podemos encontrar, concretamente, docentes (guardar su título y darle siempre
prioridad máxima) o auxiliares (guardar su cantidad de horas diarias trabajadas, dando prioridad máxima
en caso de trabajar en el nivel inicial más de 4 horas diarias, de lo contrario, prioridad media).

Por último, también serán vacunables ciertos perros de rescate, de los que interesa saber únicamente su
raza, siempre con prioridad mínima.

Un centro de vacunación consta de 6 colas de candidatos a ser vacunables, los cuales se fueron inscribiendo
en orden de llegada. La idea es poder establecer estadísticas de todos los que estén en espera y luego poder
reordenarlos de acuerdo a la prioridad.

Se pide:

- Desarrollar el método obtenerCantidadesPorColaYPrioridad el cual debe ser capaz de
devolver una matriz de enteros con lo que indica su nombre.

- Desarrollar el método obtenerColaPorPrioridad el cual debe devolver una nueva y única cola
con todos los vacunables a la espera, pero ordenados por prioridad, dejando las colas anteriores
vacías y descartando los no vacunables
