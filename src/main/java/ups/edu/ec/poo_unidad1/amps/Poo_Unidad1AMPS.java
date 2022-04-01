/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.poo_unidad1.amps;

/**
 *
 * @author PC-08
 */
public class Poo_Unidad1AMPS {

    public static void main(String[] args) {
        var carro = new auto();
        carro.marca="kia";
        System.out.println("La marca del carro es: " +carro.marca);
        var model = new auto ();
        carro.modelo="Sportage R";
        System.out.println("El modelo del carro es: " +carro.modelo);
        
        /////////////////////////////////////////
        var composicion = new album();
        composicion.nombre="Encore";
        System.out.println("El nombre del album es: " +composicion.nombre);
        var cantante = new album();
        cantante.autor="Eminem";
        System.out.println("El nombre del cantante es: " +cantante.autor);
        
        /////////////////////////////////////////
        var pc = new computadora();
        pc.nombre="Alien X";
        System.out.println("El nombre de la pc es: " +pc.nombre);
        var tipo = new computadora();
        tipo.marca="DELL";
        System.out.println("El nombre de la marca es: " +tipo.marca);
        
        /////////////////////////////////////////
        var estado = new pais();
        estado.nombre="Mexico";
        System.out.println("El nombre del pais es: " +estado.nombre);
        var habitantes = new pais();
        habitantes.poblacion=128000000;
        System.out.println("El numero de habitantes es: " +habitantes.poblacion);
        
        /////////////////////////////////////////
        var perrito = new perro();
        perrito.nombre="Bingo";
        System.out.println("El nombre del perro es: " +perrito.nombre);
        var tiempo = new perro();
        tiempo.edad=5;
        System.out.println("La edad del perro es: " +tiempo.edad);
    }
}
