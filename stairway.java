import java.util.Scanner;
public class Main
{
    static void Stairway(int number){
        for(int i = 1; i <= number; i++){
            System.out.println("  ".repeat(number - i) + " *".repeat(i));
        }
    }
    
    public static void main(String[] args) {
        boolean repeat = true;
        int number = 0;
        System.out.println("Digite o número de degraus: ");
        Scanner input = new Scanner(System.in);
        
        while(repeat){
            try{
                number = Integer.parseInt(input.nextLine());
                if(number <= 0){
                    System.out.println("Escada não pode ser menor ou igual a zero");
                }
                else{
                    repeat = false;
                }
            }
            catch(Exception e){
                System.out.println("Digite um número inteiro: ");
            }
        }
        Stairway(number);
    }
}