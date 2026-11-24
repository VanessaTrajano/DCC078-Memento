import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamadoTest {

    @Test
    void deveArmazenarEstados() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        assertEquals(2, chamado.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        chamado.restauraEstado(0);
        assertEquals(ChamadoEstadoAberto.getInstance(), chamado.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Chamado chamado = new Chamado();
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoEmAndamento.getInstance());
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        chamado.setEstado(ChamadoEstadoFechado.getInstance());
        chamado.restauraEstado(2);
        assertEquals(ChamadoEstadoAberto.getInstance(), chamado.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Chamado chamado = new Chamado();
            chamado.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}