/*Ejercicio: Crear una función que devuelva la suma de los
        dígitos primos si el el nro de dígitos del número N es par,
        caso contrario devuelva el segundo dígito.*/

public class contador_digitos {
    public int num;
    public void cdigi(int n){
        num=0;
        int c=0;
        int i,primo=0,resto,inv=0;
        System.out.println("entro aca"+n);
        while (n>0){
            n/=10;
            c++;
            System.out.println(c);
        }

        if (c % 2==0){
            while (n>0){
                System.out.println("un progreso 1");
                int contador=0;
                resto=n%10;
                for(i = 1; i <= resto; i++)
                {

                    if((resto % i) == 0)
                    {

                        contador++;
                    }
                    if (contador == 2){

                        i=resto;
                    }

                }
                if(contador == 2 )
                {
                    System.out.print(primo+" ");

                }
                n/=10;

            }
        }
        else{
            while (n>0){
                resto=n%10;
                inv=inv*10+resto;
                n/=10;
            }
            inv/=10;
            inv/=10;
            System.out.println("Numero invertido es: "+inv);
        }
    }
}
