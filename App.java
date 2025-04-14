public class App{
    public static void main(String args[]){
        Predio predio1 = new Predio("Solarium", "Av.Ipiranga, 1000", 26);
        Apartamento apto1 = new Apartamento(203, "João Carlos", 2,2);       
        predio1.compraApto(apto1);
        Apartamento apto2 = new Apartamento(305, "José",0,0);       
        predio1.compraApto(apto2);
        

        System.out.println("Apartamentos disponiveis: " + predio1.getAptosDisponiveis());
        System.out.println("----------------");
        System.out.println("Apartamento por numero identificador: " + predio1.consultaPorNumApartamento(203));
        System.out.println("----------------");
        System.out.println("Apartamento por proprietario: " + predio1.consultaPorProprietario("José"));
        System.out.println("----------------");
        System.out.println("total de moradores adultos: " + predio1.getTotalAdultos());
        System.out.println("----------------");
        System.out.println("total de moradores crianças: " + predio1.getTotalCriancas());
        System.out.println("----------------");
        System.out.println("consulta PERCENTUAL de apartamentos com proprietario porém desocupados: " + predio1.consultaPercentualAptosDesocupados());
        
    }
}
