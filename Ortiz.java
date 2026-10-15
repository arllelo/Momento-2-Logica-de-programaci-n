import java.util.Scanner;

public class Ortiz {
    public static void main(String[] args) {

        Scanner leer  = new Scanner(System.in);
        double costo;
        String nombreProducto;
        int cantidadProductos = 0;
        int cantidadMaxima; 
        int contadorAlta = 0;
        double promedio;
        double total;
        double totalBaja = 0, totalMedia = 0, totalAlta = 0;
    


        System.out.println("Ingrese la cantidad de productos que desea registrar: ");
        cantidadMaxima = leer.nextInt();
        leer.nextLine();

        while (cantidadProductos < cantidadMaxima)  {
            System.out.println("Ingrese el nombre del producto: azucar, arroz, aceite, etc.");
            nombreProducto = leer.nextLine();

            System.out.println("Ingrese el costo del producto: ");
            costo = leer.nextDouble();
              if (costo <10000) {
                System.out.println("Categoría: Baja");
                totalBaja += costo;
            }
            if (costo >=10000 && costo <=50000) {
                System.out.println("Categoría: Media");
                totalMedia += costo;
            }
            else if (costo > 50000) {
                System.out.println("Categoría: Alta");
                contadorAlta++;
                totalAlta += costo;
            }
            
            cantidadProductos++;
            leer.nextLine();

        }  

        

  }
