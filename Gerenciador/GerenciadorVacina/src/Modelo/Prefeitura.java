
package Modelo;

import java.util.ArrayList;


public class Prefeitura {
    private String cidade;
    private String estado;
    private ArrayList<Veiculo>veiculo;
    private ArrayList<Vacina>vacina;
    private ArrayList<Empresa>empresa;
    private ArrayList<Transportadora>transportadora;
    private ArrayList<Hospital>hospital;
    private ArrayList<Local>local;
      
    public Prefeitura( String cidade, String estado){
        this.cidade =cidade;
        this.estado = estado;
        this.veiculo = new ArrayList<>();
        this.vacina = new ArrayList<>();
        this.empresa = new ArrayList<>();
        this.transportadora = new ArrayList<>();
        this.hospital = new ArrayList<>();
        this.local = new ArrayList<>();    
    }

    
    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
    
    public void addEmpresa(Empresa empresa){
        this.empresa.add(empresa);
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculo.add(veiculo);
    }
    
    public void addVacina(Vacina vacina){
        this.vacina.add(vacina);
    }
    
    public void addTrasnporte(Transportadora trasnportadora){
        this.transportadora.add(trasnportadora);
    }
    
    public void addhospital(Hospital hospital){
        this.hospital.add(hospital);
    }
    
    public void addLocal(Local local){
        this.local.add(local);
    }
    
    public void ConsultarVacina(){
        for(Vacina vac : vacina ){
            System.out.println(vac.toString());
        }
    }
    
    public void ConsultarVacina(Empresa empresa){
        for(Vacina vac : vacina ){
            if(empresa == vac.getEmpresa())
                System.out.println(vac.toString());
        }
    }
    public void ConsultarVacina(String lote){
        for(Vacina vac : this.vacina ){
            if(vac.getLote().equalsIgnoreCase(lote)){
                System.out.println(vac.toString());
            }    
        }
    }
    
     public void ConsultarTrasnporte(){
        for(Veiculo vei : veiculo ){
            System.out.println(vei.toString());
        }
    }
     
    public void ConsultarTrasnportadora(){
        for(Transportadora tras : transportadora ){
            System.out.println(tras.toString());
        }
    }
    
    public void ConsultarEmpresa(){
        for(Empresa emp : empresa ){
            System.out.println(emp.toString());
        }
    }
    
     public boolean TransferirLote(String lote){
        int posicao = -1;
        for(int i = 0;i<this.vacina.size(); i++){
            Vacina vac = this.vacina.get(i);
            if(vac.getLote().equalsIgnoreCase(lote)){
                posicao = i;
            }
        }
        if(posicao >=0){
            this.vacina.remove(posicao);
            return true;
        }else{
            return false;
        }
            
    }
    
    public void ConsultarHospital(){
        for(Hospital hos: hospital){
            System.out.println(hos.toString());
        }
    }
    
    public void ConsultarLocal(){
        for(Local loc: local){
            System.out.println(loc.toString());
        }
    }
    
    public double GastoTotal(){
        double soma=0;
        for(Vacina vac : this.vacina){
            soma+=vac.calculaValorVacina();
        }
        for(Veiculo tras: veiculo){
            soma+=tras.calculoValorTransporte();
        }
        return soma;
    }
    
    public String toString(){
        return "Cidade: "+this.cidade
                +", estado: "+this.estado
                +", Gasto total: "+this.GastoTotal();
        
    }
    
    
    
}
