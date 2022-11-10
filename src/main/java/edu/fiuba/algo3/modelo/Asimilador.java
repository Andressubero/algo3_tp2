package edu.fiuba.algo3.modelo;

public class Asimilador extends Edificio{

    private static int VIDA_COMPLETA = 500;
    private int gas;

    public Asimilador(Posicion posicion, Mapa mapa)
    { 
        this.gas = 0;
        this.posicion = posicion;
        estado = new EstadoNoConstruido();
        this.mapa = mapa;
        TURNOS_PARA_CONSTRUIRSE = 6;
    }

    @Override
    public void construir() 
    {

    }

    public void pasarTiempo() 
    {

    }

    public Integer obtenerGas() 
    {
        return this.gas;
    }

    @Override
    public boolean habita(Zona zona) {
        return true;
    }

    public void dañar(int daño){
        vida -= daño;
    }

    public boolean tieneVidaCompleta(){
        return vida == VIDA_COMPLETA;
    }

}
