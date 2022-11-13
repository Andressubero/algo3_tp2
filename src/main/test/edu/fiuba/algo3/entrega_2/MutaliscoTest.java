package edu.fiuba.algo3.entrega_2;

import edu.fiuba.algo3.modelo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MutaliscoTest {
    @Test
    public void MutaliscoDañaNexoMineral() throws MenaOcupadaException {

        NexoMineral nexo = new NexoMineral(new Posicion(1,1), new Mena(new Posicion(1,1)), new Mapa());

        // tiempo de construccion

        Mutalisco mutalisco = new Mutalisco();
        // Su unidad de ataque es de 9, con 23 ataques son 207 de daño
        for (int i = 0; i < 23; i++)
            mutalisco.atacarEdificio(nexo);

        //escudo dañado
        assertFalse(nexo.tieneEscudoCompleto());
        nexo.pasarTiempo();
        //sigue dañado
        assertFalse(nexo.tieneEscudoCompleto());
        nexo.pasarTiempo();
        //sigue dañado
        assertFalse(nexo.tieneEscudoCompleto());
        nexo.pasarTiempo();
        //escudo completo
        assertTrue(nexo.tieneEscudoCompleto());

    }
}
