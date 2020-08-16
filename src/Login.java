import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String login, password;
        String[] middleLogin, middlePassword;

        Scanner sc = new Scanner(System.in);

        System.out.println("         CADASTRO");
        System.out.println("_____________________________ ");

        System.out.print("Digite seu nome completo: ");
        login = sc.nextLine();
        middleLogin = login.split(" ");

        char firstLetter = middleLogin[0].charAt(0);
        int loginSize = middleLogin.length;
        String lastName = middleLogin[loginSize - 1];
        String finalLogin = firstLetter + "_" + lastName;
        finalLogin = finalLogin.toLowerCase();
        System.out.println("Novo usuario " + finalLogin);
        login = finalLogin;

        System.out.print("Senha: ");
        password = sc.nextLine();

        boolean hasMinDigits = false, hasUpperCase = false, hasLowerCase = false, hasNumber = false, hasMiscChar = false;

        if(password.length() >= 8){
            hasMinDigits = true;
        }

        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                hasUpperCase = true;
                continue;
            }
            if (Character.isLowerCase(password.charAt(i))){
                hasLowerCase = true;
                continue;
            }
            if (Character.isDigit(password.charAt(i))){
                hasNumber = true;
                continue;
            }
            if (String.valueOf(password.charAt(i)).equals("!") || String.valueOf(password.charAt(i)).equals("@") || String.valueOf(password.charAt(i)).equals("#")){
                hasMiscChar = true;
            }
        }

        if (hasMinDigits && hasLowerCase && hasUpperCase && hasMiscChar && hasNumber){
            System.out.println("Senha cadastrada");
            System.out.printf("\n");
            System.out.println("         LOGIN");
            System.out.println("_____________________________");
            System.out.print("Usuario: ");
            String usuario = sc.nextLine();
            System.out.print("Senha: ");
            String senha = sc.nextLine();


            if (usuario.equals(login) && senha.equals(password)){
                System.out.println("Seja Bem vindo!!");
            }else{
                for (int i = 1; true; ){
                    System.out.println("Usuario e/ou senha incorretos");
                    System.out.print("Digite novamente seu usuario: ");
                    String novoUsuario = sc.nextLine();

                    System.out.print("Digite novamente sua senha: ");
                    String novaSenha = sc.nextLine();

                    if (novoUsuario.equals(login) && novaSenha.equals(password)){
                        System.out.println("Seja Bem vindo!!");
                        break;
                    }
                }
            }

        } else {
            System.out.println("Sua senha precisa ter 8 digitos, pelo menos uma letra maiuscula, um numero e um caractere especial");

        }

    }

}