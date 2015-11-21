package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.factory;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.*;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015  
 */
public class CommandFactory {
        
    private final String pkg = "br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.concrete.";
    
    public BaseCommand create(String className) throws ClassNotFoundException{
        BaseCommand command = null;
        try {
            StringBuilder str = new StringBuilder();
            str.append(pkg);
            str.append(className);
            Class classDefinition = Class.forName(str.toString());
            command               = (BaseCommand) classDefinition.newInstance();
        } catch (
                InstantiationException | 
                IllegalAccessException | 
                ClassNotFoundException e) {
          System.out.println(e.getClass());
        }
        return command;
    }
}
