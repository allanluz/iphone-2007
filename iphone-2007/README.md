classDiagram
    class Dispositivo {
        - String modelo
        + ligarDispositivo()
        + desligarDispositivo()
    }

    class iPhone {
        + nomeModelo: String
        + versaoSistema: String
    }

    class ReprodutorMusical {
        + tocar()
        + pausar()
        + selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        + ligar(String numero)
        + atender()
        + iniciarCorreioVoz()
    }

    class NavegadorInternet {
        + exibirPagina(String url)
        + adicionarNovaAba()
        + atualizarPagina()
    }

    iPhone ..|> Dispositivo
    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet