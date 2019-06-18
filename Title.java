import java.util.Scanner;

public class Title {
    public String frase;
    
    public void InicialMaiuscula(String frase){
        String[] partes = frase.split(" ");
        String word = " ";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < partes.length; i++){
            word = partes[i];
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            sb.append(" ").append(word);
        }
        System.out.println(sb.toString().replaceFirst(" ", ""));
    }

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String texto = ler.nextLine();
        Title title = new Title();
        title.InicialMaiuscula(texto);
        
    }
}

/*public class Title{
    public static void main(String[] args) {

        String texto = "esse é o teste";
        String[] partes = texto.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < partes.length; i++) {
            String word = partes[i];
            word = word.substring(0, 1).toUpperCase() + word.substring(1);
            sb.append(" ").append(word);
        }
        System.out.println(sb.toString().replaceFirst(" ", ""));
        
    }
}*/