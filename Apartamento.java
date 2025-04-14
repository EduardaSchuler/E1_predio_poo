 public class Apartamento{
    private int numApartamento;
    private String proprietario;
    private int qtdMoradoresAdultos;
    private int qtdMoradoresCriancas;
    
    public Apartamento(int numApartamento, String proprietario, int qtdMoradoresAdultos, int qtdMoradoresCriancas){
        if(numApartamento != 0){
            this.numApartamento = numApartamento;
            this.proprietario = proprietario;
            this.qtdMoradoresAdultos = qtdMoradoresAdultos;
            this.qtdMoradoresCriancas = qtdMoradoresCriancas;
        }
    }
    public Apartamento (){
    }
    
    public int getNumApartamento(){
        return numApartamento;
    }
    
    public String getProprietario(){
        return proprietario;
    }
    
    public int getQtdMoradoresAdultos(){
        return qtdMoradoresAdultos;
    }
    
    public int getQtdMoradoresCriancas(){
        return qtdMoradoresCriancas;
    }
}
