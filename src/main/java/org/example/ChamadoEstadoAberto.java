package org.example;

public class ChamadoEstadoAberto implements ChamadoEstado {

    private ChamadoEstadoAberto() {};
    private static ChamadoEstadoAberto instance = new ChamadoEstadoAberto();
    public static ChamadoEstadoAberto getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aberto";
    }

}