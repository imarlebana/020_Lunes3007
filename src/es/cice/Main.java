package es.cice;

import es.cice.interfaces.IFuncional;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Funcional f = new Funcional();
        System.out.println(f.test("Ana"));

        IFuncional fi = mensaje -> String.format("hola %s !",mensaje);
        System.out.println(fi.test("Ana"));

     
    }
}
