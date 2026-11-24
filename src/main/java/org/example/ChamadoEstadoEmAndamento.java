package org.example;

public class ChamadoEstadoEmAndamento implements ChamadoEstado {

    private ChamadoEstadoEmAndamento() {};
    private static ChamadoEstadoEmAndamento instance = new ChamadoEstadoEmAndamento();
    public static ChamadoEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Andamento";
    }

}