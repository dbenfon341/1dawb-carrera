// Propiedades: marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales.
// obtenerInformación: Retorna los kilómetros que el vehículo puede recorrer con el combustible actual (cada litro da para 10km).
// calcularAutonomia: Retorna un valor Int (cada litro da para 10km).
// realizaViaje: Realiza un viaje hasta donde da combustibleActual. Ajusta el combustible gastado y el kilometraje realizado de acuerdo con el viaje. Devuelve la distancia restante.
// repostar: Incrementa combustibleActual hasta el maximo de capacidadCombustible si no se pasa de cantidad o si cantidad es 0 o negativa. Si no, incrementa en cantidad hasta llegar a capacidadCombustible.
// Devuelve la cantidad repostada.



open class Vehiculo(var marca: String, var modelo: String, var capacidadCombustible: Float, var combustibleActual: Float, var kilometrosActuales: Int) {

    open fun obtenerInformacion() {
        return
    }

    open fun calcularAutonomia() {
        return
    }

    open fun realizaViaje(distancia: Float){
        return
    }

    open fun repostar(cantidad: Float) {
        return
    }


}