import java.util.Scanner;

public class TelaLogin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Usuario");
        String usuario = scanner.next();

        System.out.println("Senha");
        int senha = scanner.nextInt();

        String alvaro = "alvaro";
        if (usuario.equals(alvaro) && senha == 6623) {
            System.out.println("Bem vindo");
        }else{
            System.out.println("Usuario e/ou senha incorretos");
        }
        }


    }

