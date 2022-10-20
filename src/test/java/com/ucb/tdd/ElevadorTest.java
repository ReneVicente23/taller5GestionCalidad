package com.ucb.tdd;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class ElevadorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    private Elevador elevador;

    @Before
    public void before(){
        elevador=new Elevador();
    }

    @Test
    public void inicioDiaPuertaCerrada() throws Exception {
        //1 preparacion de la prueba

        //2 logica de la prueba

        //3 Verificacion de la preba
        assertEquals("cerrado",elevador.puerta());
    }

    @Test
    public void crearPersonaPisoAleatorio() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        //2 logica de la prueba
        persona.crearPersona();
        //3 Verificacion de la preba
        switch (persona.getPiso()){
            case(1):
                assertEquals(1, persona.getPiso());
                break;
            case(2):
                assertEquals(2, persona.getPiso());
                break;
            default:
                assertEquals(3, persona.getPiso());
        }
    }

    @Test
    public void llamadaDePiso() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba

        //3 Verificacion de la preba
        assertEquals(persona.getPiso(), elevador.llamar(persona));
    }

    @Test
    public void pisoDestinoDePersonaNoIgual() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba

        //3 Verificacion de la preba
        assertNotEquals(persona.getPiso(),persona.getDestino());

    }


    @Test
    public void pisoDestinoDePersonaLLegado() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba
        elevador.llamar(persona);
        //3 Verificacion de la preba
        assertEquals(persona.getDestino(), elevador.destino(persona));
    }

    @Test
    public void variasPersonas() throws Exception {
        //1 preparacion de la prueba
        Persona persona=new Persona();
        persona.crearPersona();
        //2 logica de la prueba
        elevador.llamar(persona);
        //3 Verificacion de la preba
        assertEquals(persona.getDestino(), elevador.destino(persona));
        Persona persona2=new Persona();
        persona2.crearPersona();
        elevador.llamar(persona2);
        assertEquals(persona2.getDestino(), elevador.destino(persona2));
    }

}
