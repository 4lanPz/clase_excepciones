import java.util.Scanner;
public class principal {
    public static int cociente (int numerador,int denominador){
        return numerador / denominador;
    }
    public static void main(String[] args){
        try {
            int[] myNumbers ={1,2,3};
            System.out.println(myNumbers[10]);
        }catch (Exception e){
            System.out.println("Algo salio mal");
            System.out.println(e);
        }
        finally {
            System.out.println("de todas formas envio este mensaje");
        }
        //2
        Scanner explorador = new Scanner(System.in);
        System.out.println("Introduzca el numero numerador entero: ");
        int numerador = explorador.nextInt();
        System.out.println("Introduzca el numero denominador entero: ");
        int denominador = explorador.nextInt();
        int resultado = cociente(numerador, denominador);
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);

        //3
        try{
            lanzaExcepcion();
        }
        catch(Exception excepcion){
            System.err.println("La excepcion se manejo en main");
        }
        noLanzaExcepcion();
    }

    public static void lanzaExcepcion() throws Exception{
        try {
            System.out.println("Metodo lanzaExcepcion");
            throw new Exception();
        }
        catch(Exception excepcion){
            System.err.println("La excepcion se manejo en el metodo lanzaExcepcion");
            throw excepcion;
        }
        finally {
            System.err.println("Se ejecuto finally en lanzaExcepcion");
        }
    }
    public static void noLanzaExcepcion(){
        try{
            System.out.println("Metodo noLanzaExcepcion");
        }
        catch (Exception excepcion){
            System.err.println(excepcion);
        }
        finally{
            System.err.println("Se ejecuto Finally en noLanzaExcepcion");
        }
        System.out.println("Fin del metodo noLanzaExcepcion");
    }
}

