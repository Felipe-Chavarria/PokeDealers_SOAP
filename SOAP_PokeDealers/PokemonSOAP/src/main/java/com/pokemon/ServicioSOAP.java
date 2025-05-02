package com.pokemon;

import javax.jws.WebParam;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ServicioSOAP {
    private List<CartaPokemon> cartas = new ArrayList<>();

    @WebMethod
    public String agregarCarta(
        @WebParam(name = "codigo") String codigo,
        @WebParam(name = "nombre") String nombre,
        @WebParam(name = "precio") double precio,
        @WebParam(name = "rareza") String rareza) {

        CartaPokemon carta = new CartaPokemon(codigo, nombre, precio, rareza);
        cartas.add(carta);
        return "Carta agregada: " + carta.getNombre();
}

    @WebMethod
    public List<CartaPokemon> obtenerCartas() {
        return cartas;
    }

    @WebMethod
    public CartaPokemon buscarCarta(
        @WebParam(name = "criterio") String criterio) {
        for (CartaPokemon carta : cartas) {
            if (carta.getCodigo().equals(criterio) 
            || carta.getNombre().equalsIgnoreCase(criterio)) {
                return carta;
            }
        }
        return null;
}

    @WebMethod
    public String actualizarCarta(
        @WebParam(name = "codigo") String codigo,
        @WebParam(name = "nuevoNombre") String nuevoNombre,
        @WebParam(name = "nuevoPrecio") double nuevoPrecio,
        @WebParam(name = "nuevaRareza") String nuevaRareza) {

        for (CartaPokemon carta : cartas) {
            if (carta.getCodigo().equalsIgnoreCase(codigo)) {
                carta.setNombre(nuevoNombre);
                carta.setPrecio(nuevoPrecio);
                carta.setRareza(nuevaRareza);
                return "Carta actualizada: " + carta.getCodigo();
            }
        }
        return "Carta no encontrada: " + codigo;
}

    @WebMethod
    public String eliminarCarta(
        @WebParam(name = "codigo") String codigo) {

        for (int i = 0; i < cartas.size(); i++) {
            if (cartas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
                cartas.remove(i);
                return "Carta eliminada: " + codigo;
            }
        }
        return "Carta no encontrada: " + codigo;
}

}