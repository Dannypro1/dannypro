import sys 
def deposit():
    print("------------------------")
    money = int(input("SHIRAHO AMAFARANGA MAKE NI 500 : "))
    print("_________________________")
    if money < 500:
        print("SHIRAMO ARI HEJURU YA 500 : ")
    else:
        print(f"AMAFARANG NI : {money + balance}")
        print("BYAKUNZE")
    return 0

    
def withdraw():
    print("------------------------")
    money = int(input("SHIRAHO AMAFARANGAATA 500 : "))
    print("_________________________")
    if money < 500 and money > balance:
        print("NTAGO AHAGIJE")
    else:
        print("BYAKUNZE")
        print(f"AMAFARANG NI : {balance - money}")
    return 0

def amount():
    print(f"AMAFARANGA MUFITE NI: {balance}")
    
balance=0

is_running = True


while is_running:
    print("DP BANK 1-4")
    print("###################")
    print("1.COUNT YANJYE")
    print("2.KUBITSA")
    print("3.KUBIKUZA")
    print("4.exit")
    
    service = input("HITAMO SERVICE : ")
    
    if service == '1' :
            
            amount()
            print("00.GUSUBIRA INYUMA ")
            service = input("HITAMO  : ")
            if service == 00:
                is_running=False
            else:
                sys.exit()        
    elif service == '2' :
        balance +=  deposit()
        print("00.GUSUBIRA INYUMA ")
        service = input("HITAMO  : ")
        if service == 00:
                is_running=False
        else:
            sys.exit()
    elif service == '3' :
        balance = balance - withdraw()
        print("00.GUSUBIRA INYUMA ")
        service = input("HITAMO  : ")
        if service == 00:
                is_running=False
        else:
            sys.exit()
            
    elif service == '4' :
        sys.exit()
    else:
        print("invalid input")
print("UMUNSI MWIZA")
     
    