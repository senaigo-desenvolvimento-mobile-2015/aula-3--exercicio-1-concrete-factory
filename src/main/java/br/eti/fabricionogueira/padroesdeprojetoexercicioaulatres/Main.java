package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory.CommandFactory;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class Main {
    
    public static void main(String[] args) {
       
        try {

            CommandFactory factory = new CommandFactory();
            
            factory.create("EnviarPorEmail").executar();
            
            factory.create("GerarJson").executar();
            
            factory.create("GerarPdf").executar();
            
            factory.create("EnviarPorEmail").executar();

            factory.create("GerarXml").executar();
                       
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
}
