public class Predio{
    private String nome;
    private String endereco;
    private int qtdApartamentos;
    private Apartamento[] listaDeAptos;
    
    public Predio(String nome, String endereco, int qtdApartamentos){
        this.nome = nome;
        this.endereco = endereco;
        this.qtdApartamentos = qtdApartamentos;
        listaDeAptos = new Apartamento[qtdApartamentos];
    }
    
    public boolean compraApto(Apartamento apto){
        for (int i = 0; i < listaDeAptos.length; i++){
            if (listaDeAptos[i] != null && listaDeAptos[i].getNumApartamento() == apto.getNumApartamento()){
                return false;
            }
        }
        for (int i = 0; i < listaDeAptos.length; i++){
            if (listaDeAptos[i] == null) {
                listaDeAptos[i] = apto;
                qtdApartamentos --;
                return true;
            }
        }
        return false;
    }
    
    public int getAptosDisponiveis(){
        return qtdApartamentos;
    }
    
    public int consultaPorProprietario(String nome){
        for (int i = 0; i < listaDeAptos.length; i++){
            if (listaDeAptos[i].getProprietario().equals(nome)){
                return listaDeAptos[i].getNumApartamento();
            } 
        }
        return 0;
    }
    
    public String consultaPorNumApartamento(int num){
        for (int i = 0; i < listaDeAptos.length; i++){
            if (listaDeAptos[i].getNumApartamento() == num){
                return listaDeAptos[i].getProprietario();
            } else {
                return null;
            }
        }
        return null;
    }
    
    public int getTotalAdultos(){
        int cont = 0;
        for (int i = 0; i < listaDeAptos.length; i++){
            if(listaDeAptos[i] != null){
                cont = cont + listaDeAptos[i].getQtdMoradoresAdultos();
            }
        }
        return cont;
    }
    
        public int getTotalCriancas(){
        int cont = 0;
        for (int i = 0; i < listaDeAptos.length; i++){
            if(listaDeAptos[i] != null){
                cont = cont + listaDeAptos[i].getQtdMoradoresCriancas();
            }
        }
        return cont;
    }
    
    public double consultaPercentualAptosDesocupados(){
        int cont = 0;
        for (int i = 0; i < listaDeAptos.length; i++){
            if(listaDeAptos[i] != null){
                if(listaDeAptos[i].getQtdMoradoresAdultos() == 0 && listaDeAptos[i].getQtdMoradoresCriancas() == 0){
                cont ++;
                }
            } else {
                return qtdApartamentos + (cont * listaDeAptos.length);
            }
        }
        if (cont > 0){
            return qtdApartamentos + (cont * listaDeAptos.length);
        } else {
            return 0;
        }
    }
}
