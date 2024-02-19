Ejercicio: Sistema de Vehículos
1. Descripción
La actividad se centra en el diseño y desarrollo de un sistema de gestión de vehículos utilizando el paradigma de la programación orientada a objetos. Se creará una jerarquía de clases que modelará vehículos genéricos y especializados, tales como automóviles y motocicletas, cada uno con propiedades y comportamientos específicos. Además, se integrará una funcionalidad para gestionar una característica particular en los automóviles relacionada con la conducción británica, a través del uso de métodos de clase.
2. Objetivo
Desarrollar un entendimiento profundo de la herencia y la sobreescritura en la programación orientada a objetos. Practicar la implementación de métodos de clase para modificar atributos aplicables a toda una categoría de objetos. Reforzar el manejo de visibilidad y control de acceso a los miembros de las clases.
3. Trabajo a realizar
Definir la clase base Vehiculo con propiedades comunes y sus métodos correspondientes. Implementar la clase derivada Automovil, añadiendo propiedades específicas y un método de clase para gestionar la condición de conducción británica. Desarrollar la clase derivada Motocicleta, con propiedades únicas y la sobreescritura de métodos para reflejar su comportamiento especializado.
4. Estructura de Clases:
4.1. Clase Base Vehiculo
Propiedades: marca (String), modelo (String), capacidadCombustible (Float), combustibleActual (Float), kilometrosActuales (Int).
• obtenerInformacion() -> String, Retorna los kilómetros que el vehículo puede recorrer con el combustible actual (suponemos que cada litro da para 10 km).
calcularAutonomia() -> Int, que retorna un valor Int (Suponemos que cada litro da para 10 km.).
realizaViaje(distancia: Int) -> Int: Realiza un viaje hasta donde da combustibleActual. Ajusta el combustible gastado y el kilometraje realizado de acuerdo con el viaje. Devuelve la distancia restante.
repostar(cantidad: float)-> Float : Incrementa combustibleActual hasta el máximo de capacidadCombustible si no se pasa cantidad o si cantidad es 0 o negativa. Sino, incrementa en cantidad hasta llegar a capacidadCombustible. Devuelve la cantidad repostada.
• NOTA: Redondear a dos decimales todo... cálculos y asignación de valores tipo Float.
4.2. Clase Derivada Automovil
Propiedades Específicas:
О
esElectrico (Boolean) : Indica si el automóvil es eléctrico o no. En este caso, se refiere a un coche híbrido.
condicionBritania (Boolean) : Propiedad de clase que Indica si el automóvil está configurado para conducción británica (volante a la derecha).
Comportamiento Especializado:
О
calcularAutonomia() -> Int: Modifica el cálculo de autonomía asumiendo un rendimiento de 5 km menos por litro si es
eléctrico.
Comportamiento Adicional:
о cambiar CondicionBritania(nuevaCondicion: Boolean) : Método de clase que permite modificar la configuración de conducción británica para todos los automóviles.
。 realizaDerrape()-> Float : método que simula un derrape. Realiza una gasto adicional en el combustible, retornando el combustible restante. El gasto equivale a haber realizado 5 kilómetros.
3. Clase Derivada Motocicleta
• Propiedad específica: cilindrada (Int).
• Comportamiento Especializado:
calcularAutonomia() -> Int: Modifica el cálculo de autonomía asumiendo un rendimiento de 20 km por litro.
■ realizaViaje(distancia: Int) -> Boolean : Ajusta el cálculo de combustible necesario para viajes basándose en su autonomía específica.
• Comportamiento Adicional:
■ realizaCaballito()-> Float : realiza una gasto adicional en el combustible, retornando el combustible restante. El gasto equivale a haber realizado 5 kilómetros.
