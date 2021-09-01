
package Modelo;


public class Vacina {
    private String lote;
    private Empresa empresa;
    private int quantLotes;
    private double valorLote;
    
    public Vacina(String lote, Empresa empresa, int quantLotes, double valorLote){
        this.lote = lote;
        this.empresa = empresa;
        this.quantLotes = quantLotes;
        this.valorLote = valorLote;
    }

    
    public String getLote() {
        return lote;
    }

    
    public Empresa getEmpresa() {
        return empresa;
    }
    
    public int getQuantLotes() {
        return quantLotes;
    }

    public double getValorLote() {
        return valorLote;
    }

    
    public double calculaValorVacina(){
        return this.quantLotes*this.valorLote;
    }
 
    public String toString(){
        return "Empresa Fabricante: "+this.empresa.getNome()
                +" lote: "+ this.lote
                +" Valor gasto Vacina"+this.calculaValorVacina();
                
    }

  
}
