
package Modelo;




public class Caminhao extends Veiculo{
    private int distancia;
    
    
    public Caminhao(int codigo, String modelo, String pontoDeEntrada, String pontoDeChegada, int combustivel, double frete, Vacina vacina, int distancia ){
       super(codigo, modelo, pontoDeEntrada, pontoDeChegada,combustivel, frete, vacina);
       this.distancia = distancia;
    }

    public int getDistancia() {
        return this.distancia;
    }
    
    @Override
    public double calculoValorTransporte(){
        return this.combustivel * this.distancia + this.frete;
    }

     @Override
    public String toString(){
        return super.toString()
                +" Distancia percorrida "+this.distancia
                +" vacina transportada: "+this.vacina
                +" Valor do transporte: "+this.calculoValorTransporte();
                
    }
}
