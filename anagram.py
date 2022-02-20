def check_anagram(word):
    qtd_letras = 1
    iguais = 0

    # Itera a quantidade de letras da palavra
    for letra in range(len(word)-1):

        # Passa por todas as letras
        for i_cjt_comparado in range(len(word)):
            
            # Passa pelas letras seguintes
            for i_cjt_comparacao in range(i_cjt_comparado, len(word)):

                # Verifica se o tamanho do conjunto é maior ou igual à quantidade de letras
                if len(word[i_cjt_comparacao : i_cjt_comparacao + qtd_letras]) >= qtd_letras:
    
                    # Verifica se o index é diferente do index comparado
                    if i_cjt_comparacao != i_cjt_comparado:
                        if sorted(word[i_cjt_comparacao : i_cjt_comparacao + qtd_letras]) == sorted(word[i_cjt_comparado : i_cjt_comparado + qtd_letras]):
                            iguais += 1

        qtd_letras += 1
    
    return iguais

print(check_anagram("aabbcc"))