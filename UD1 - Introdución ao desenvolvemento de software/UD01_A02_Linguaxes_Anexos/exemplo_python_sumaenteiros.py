# suma os enteiros do 1 ao 20
 
def sumarEnteiros(n):
    sum=0
    for i in range(1,n+1):
            sum=sum+i
 
    return sum

A=sumarEnteiros(20)
print ("Suma total de enteiros do 1 ao 20 : " + str(A))
