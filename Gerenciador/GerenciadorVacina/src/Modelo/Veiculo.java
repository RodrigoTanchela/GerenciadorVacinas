
package Modelo;




public abstract class Veiculo {
    protected int codigo;
    protected String modelo;
    protected String pontoDeEntrada;
    protected String pontoDeChegada;
    protected int combustivel;
    protected double frete;
    protected Vacina vacina;
  
    
    public Veiculo(int codigo, String modelo, String pontoDeEntrada, String pontoDeChegada, int combustivel, double frete, Vacina vacina ){
        this.codigo = codigo;
        this.modelo = modelo;
        this.pontoDeEntrada = pontoDeChegada;
        this.combustivel = combustivel;
        this.frete = frete;
        this.vacina = vacina;
        
    }
   
    public int getCodigo() {
        return codigo;
    }

    
    public String getModelo() {
        return modelo;
    }
    
    public String getPontoDeEntrada() {
        return pontoDeEntrada;
    }


    public String getPontoDeChegada() {
        return pontoDeChegada;
    }

    public int getCombustivel() {
        return combustivel;
    }
  
    public abstract double calculoValorTransporte();

    public String toString(){
        return "modelo: "+this.modelo
                +" Codigo de rastreamento: "+this.codigo
                +" Ponto de Entrada: "+this.pontoDeEntrada
                + " Ponto de chegada: "+this.pontoDeChegada;
    }

  
}
