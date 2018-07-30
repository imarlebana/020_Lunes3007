package es.cice;

import es.cice.interfaces.IFuncional;

public class Funcional implements IFuncional {
    @Override
    public String test(String mensaje) {
        return String.format("hola %s",mensaje);
    }
}
