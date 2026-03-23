package util;

public class Validacoes {

    private Validacoes(){

    }

    public static boolean nomeValido(String nome){
        return !(nome == null ||
                 nome.trim().isEmpty() ||
                 nome.matches(".*\\d+.*")
        );
    }

    public static String mensagemErroNome(String nome){
        if (nome == null ||nome.trim().isEmpty()){
            return "Erro: o mome nao pode ser vazio";
        }else if (nome.matches(".*\\d+.*")){
            return "Erro: o nome nao pode conter numero";
        }
        return "";
    }

    public static boolean precoValida(int preco){
        return preco >= 0 && preco <= 15000;
    }

    public static String mensagemErroPreco(int preco){
        if(preco < 0){
            return "Erro: preco nao pode ser negativa";
        }else if (preco > 15000){
            return "Erro: preco invalido";
        }
        return "";
    }
    
    public static boolean quantidadeValida(int quantidade){
        return quantidade >= 0 && quantidade <= 1500;
    }

    public static String mensagemErroQuantidade(int quantidade){
        if(quantidade < 0){
            return "Erro: quantidade nao pode ser negativa";
        }else if (quantidade > 1500){
            return "Erro: quantidade invalida";
        }
        return "";
    }
}
