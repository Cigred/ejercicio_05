
package ejercicios_recursividad;

public class TorresdeHanoi {
    
public static void resolverTorres(int discos, int agujaOrigen,
 int agujaDestino, int agujaTemp)   {
    if (discos == 1)
 {
System.out.printf("%n%d --> %d", agujaOrigen, agujaDestino);
return;
 }
 resolverTorres(discos - 1, agujaOrigen, agujaTemp, agujaDestino);

System.out.printf("%n%d --> %d", agujaOrigen, agujaDestino);
 
resolverTorres(discos - 1, agujaTemp, agujaDestino, agujaOrigen);
 } 
public static void main(String[] args)
{
int agujaInicial = 1;
int agujaFinal = 3; 
int agujaTemp = 2; 
int totalDiscos = 3; 
 resolverTorres(totalDiscos, agujaInicial, agujaFinal, agujaTemp);
 }
 } 
