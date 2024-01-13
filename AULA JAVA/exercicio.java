public class exercicio {
    public static void main(String[] args) {
        String nome = "Fernando";
        System.out.print(nome);

        String sobrenome = "Oliveira";
        System.out.print(" " + sobrenome);

        int idade = 20;
        System.out.print("  -  " + "Idade : " + idade);

        double altura = 1.81;
        System.out.print("  -  " + "Altura : " + altura);

        double peso = 1.60;
        System.out.print("  -  " + "Peso : " + peso);

        double imc = peso / (altura * altura);  {
            System.out.println("  -  " + "Meu IMC e :" + imc);
        }
    }
}
