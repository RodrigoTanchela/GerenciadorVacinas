
package Modelo;


public class Hospital {
   private String clinica;
   private int quantVacinas;
   
   
   public Hospital(String clinica,int quantVacinas){
       this.clinica = clinica;
       this.quantVacinas = quantVacinas;
       
   }
   public String getClinica() {
        return clinica;
    }
    public int getQuantVacinas() {
        return quantVacinas;
    }
 
    public String toString(){
    return "Clinica: "+this.clinica
            +", Quantidade de vacinas: "+this.quantVacinas;
}


   }
   

