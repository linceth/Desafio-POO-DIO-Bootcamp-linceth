package br.com.dio.desafio.dominio;


public class DesafioProjetos extends Conteudo{
    private int cargaHoraria;

    public DesafioProjetos(){
        
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return xp_PADRAO + 40d;
    }

    @Override
    public String toString() {
        return "DesafioProjetos [cargaHoraria=" + cargaHoraria + "]";
    }

    

    
}