import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    
    public static int check_anagram(String word){
        int qtd_letras = 1;
        int iguais = 0;
        
        // Itera a quantidade de letras da palavra
        for (int indice_letra = 0; indice_letra < (word.length() - 1); indice_letra++){

            // Passa por todas as letras
            for (int i_cjt_comparado = 0; i_cjt_comparado < word.length(); i_cjt_comparado++){
                
                // Passa pelas letras seguintes
                for (int i_cjt_comparacao = i_cjt_comparado; i_cjt_comparacao < word.length(); i_cjt_comparacao++){
                
                    String palavraComparacao = "";
                    for (int aux = i_cjt_comparacao; aux < (i_cjt_comparacao + qtd_letras); aux++){
                        palavraComparacao = palavraComparacao + word.charAt(aux);
                    }

                    // Verifica se o tamanho do conjunto é maior ou igual à quantidade de letras
                    if (palavraComparacao.length() >= qtd_letras){
                        
                        // Verifica se o index é diferente do index comparado
                        if (i_cjt_comparacao != i_cjt_comparado){
                        
                            String palavraComparada = "";
                            for (int aux = i_cjt_comparado; aux < (i_cjt_comparado + qtd_letras); aux++){
                                palavraComparada += word.charAt(aux);
                            }
                            
                            char arrayPalavraComparada[] = palavraComparada.toCharArray();
                            Arrays.sort(arrayPalavraComparada);
                            palavraComparada = new String(arrayPalavraComparada);
                            
                            char arrayPalavraComparacao[] = palavraComparacao.toCharArray();
                            Arrays.sort(arrayPalavraComparacao);
                            palavraComparacao = new String(arrayPalavraComparacao);
                            
                            int aux = 0;
                            for (int i = 0; i < palavraComparacao.length(); i++){
                                if(palavraComparada.charAt(i) == palavraComparacao.charAt(i)){
                                    aux += 1;
                                }
                            }
                            
                            if(aux == palavraComparada.length()){
                                iguais += 1;
                            }
                        }
                    }
                }
        
            }
        }
        return iguais;
    }
    
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        Scanner input = new Scanner(System.in);
        System.out.println(check_anagram(input.nextLine()));
    }
}
