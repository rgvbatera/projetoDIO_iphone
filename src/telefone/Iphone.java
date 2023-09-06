package telefone;

import telefone.interfaces.AparelhoTelefonico;
import telefone.interfaces.NavegadorInternet;
import telefone.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando de um Iphone para o número: " + numero);
    }

    @Override
    public void atenderChamada() {

    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }

    public class Main {
        public static void main(String[] args) {

            Iphone iphone11 = new Iphone();
            iphone11.ligar("11554466");
        }
    }

}

