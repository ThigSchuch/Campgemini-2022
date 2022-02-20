def Starway(number):
    for i in range(1, number + 1):
        print("  " * (number - i), end="")
        print(" *" * i)

####################

repeat = True
while repeat:
    number = input("Digite o número de degraus: ")

    try:
        number = int(number)

        if number <= 0:
            print("Escada não pode ser menor ou igual a zero")

        else:
            repeat = False

    except:
        print("Digite um número inteiro: ")

Starway(number)