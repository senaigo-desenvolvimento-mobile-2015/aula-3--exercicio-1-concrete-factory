package br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.concrete;

import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.ImprimeMensagem;
import br.eti.fabricionogueira.padroesdeprojetoexercicioaulatres.command.BaseCommand;

/**
 *
 * @author Fabricio Nogueira (nogsantos)
 * @since Nov 21, 2015
 */
public class GerarXml implements BaseCommand{

    @Override
    public void executar() {
        ImprimeMensagem.getInstance().m(getClass().getSimpleName());
    }
}
