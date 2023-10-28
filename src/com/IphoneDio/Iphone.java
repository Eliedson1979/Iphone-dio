package com.IphoneDio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada telefônica...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da internet: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador...");
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        // Exemplo de uso das funcionalidades
        iphone.tocar();
        iphone.selecionarMusica("Música 1");
        iphone.pausar();
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

