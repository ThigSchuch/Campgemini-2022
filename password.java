import java.util.Scanner;
public class Main
{
    
    static boolean check_especials(String string){
        char[] specials = "!@#$%^&*()-+".toCharArray();
        char[] string_array = string.toCharArray();
        
        for(int i = 0; i < string_array.length; i++){
            for(int j = 0; j < specials.length; j++){
                if(string_array[i] == specials[j]){
                    return(true);
                }
            }
        }
        return(false);
    }
    
    static boolean check_upper(String string){
        char[] string_array = string.toCharArray();
        
        for(int i = 0; i < string_array.length; i++){
            if(Character.isUpperCase(string_array[i])){
                return(true);
            }
        }
        return(false);
    }
    
    static boolean check_lower(String string){
        char[] string_array = string.toCharArray();
        
        for(int i = 0; i < string_array.length; i++){
            if(Character.isLowerCase(string_array[i])){
                return(true);
            }
        }
        return(false);
    }
    
    static boolean check_integer(String string){
        char[] string_array = string.toCharArray();
        
        for(int i = 0; i < string_array.length; i++){
            if(Character.isDigit(string_array[i])){
                return(true);
            }
        }
        return(false);
    }
    
    static int validate_pass(String string){
        int count = 0;
        
        if(!check_especials(string)){
            count += 1;
        }
        
        if(!check_integer(string)){
            count += 1;
        }
        
        if(!check_upper(string)){
            count += 1;
        }
        
        if(!check_lower(string)){
            count += 1;
        }
        
        if(string.length() < 6){
            if((string.length() + count) < 6){
                for(int i = string.length() + count; i < 6; i++){
                    count += 1;
                }
            }
        }
        return(count);
    }
    
    public static void main(String[] args) {
        System.out.println("Digite sua senha: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Precisa de mais "+validate_pass(input.nextLine())+" caracteres.");
    }
}