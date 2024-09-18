package br.com.dio.desafio.dominio;


public class DesafioCodigo extends Conteudo{
    private int cargaHoraria;

    public DesafioCodigo(){
        
    }
    

    @Override
    public double calcularXp() {
        return xp_PADRAO + 30d;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }



    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    @Override
    public String toString() {
        return "DesafioCodigo [cargaHoraria=" + cargaHoraria + "]";
    }

    

}


