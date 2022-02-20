def check_specials(string):
    specials = ["!","@","#","$","%","^","&","*","(",")","-","+"]
    return any(char in specials for char in string)

def check_integer(string):
    return any(char.isdigit() for char in string)

def check_upper(string):
    return any(char.isupper() for char in string)

def check_lower(string):
    return any(char.islower() for char in string)


def validate_pass(string):
    count = 0

    if not check_specials(string):
        count += 1

    if not check_integer(string):
        count += 1

    if not check_upper(string):
        count += 1
    
    if not check_lower(string):
        count += 1
    
    if len(string) < 6:
        if (len(string) + count) < 6:
            for i in range(len(string) + count, 6):
                count += 1
    return count

print("Precisa de mais", validate_pass(input("Digite uma senha: ")), "caracteres")