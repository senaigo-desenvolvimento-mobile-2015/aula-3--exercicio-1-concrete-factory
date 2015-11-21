package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class ImprimeMensagem {
    
    private static final ImprimeMensagem INSTANCE = new ImprimeMensagem();
    
    private ImprimeMensagem(){}
    
    public static ImprimeMensagem getInstance(){
        return INSTANCE;
    }
    
    public void m(String n){
        System.out.println("Executar ações da classe: "+ n);
    }
}
