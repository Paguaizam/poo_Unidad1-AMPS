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
        var carroPaul = new auto();
        carroPaul.marca="kia";
        System.out.println("La marca del carro es: " +carroPaul.marca);
        var modelPaul = new auto ();
        carroPaul.modelo="Sportage R";
        System.out.println("El modelo del carro es: " +carroPaul.modelo);
        var cilPaul = new auto ();
        cilPaul.cilindraje= 2000;
        System.out.println("El cilindraje del carro en CC: " +cilPaul.cilindraje);
        var tonPaul = new auto ();
        tonPaul.peso= 1500;
        System.out.println("El peso del carro en kg: " +tonPaul.peso);
        //////////////////////////////////////////////////////////
        
         var carroOmar = new auto();
        carroOmar.marca="Chevrolet";
        System.out.println("La marca del carro es: " +carroOmar.marca);
        var modelOmar = new auto ();
        carroOmar.modelo="Camaro";
        System.out.println("El modelo del carro es: " +carroOmar.modelo);
        var cilOmar = new auto ();
        cilOmar.cilindraje= 3500;
        System.out.println("El cilindraje del carro en CC: " +cilOmar.cilindraje);
        var tonOmar = new auto ();
        tonOmar.peso= 1844;
        System.out.println("El peso del carro en kg: " +tonOmar.peso);
        //////////////////////////////////////////////////////////
        
        /////////////////////////////////////////
        var composicion = new album();
        composicion.nombre="Encore";
        System.out.println("El nombre del album es: " +composicion.nombre);
        var cantante = new album();
        cantante.autor="Eminem";
        System.out.println("El nombre del cantante es: " +cantante.autor);
         var visita = new album();
        visita.visitas= 22429;
        System.out.println("El numero de visitas es: " +visita.visitas);
         var dur = new album();
        dur.duracion= 76;
        System.out.println("El tiempo de duracion en minutos es: " +dur.duracion);
        
        var composicionDY = new album();
        composicionDY.nombre="Barrio Fino";
        System.out.println("El nombre del album es: " +composicion.nombre);
        var cantanteDY = new album();
        cantante.autor="Daddy Yanke";
        System.out.println("El nombre del cantante es: " +cantante.autor);
         var visitaDY = new album();
        visitaDY.visitas= 19429;
        System.out.println("El numero de visitas es: " +visita.visitas);
         var durBF = new album();
        durBF.duracion= 84;
        System.out.println("El tiempo de duracion en minutos es: " +durBF.duracion);
        /////////////////////////////////////////
        var pc = new computadora();
        pc.nombre="Alien X";
        System.out.println("El nombre de la pc es: " +pc.nombre);
        var tipo = new computadora();
        tipo.marca="DELL";
        System.out.println("El nombre de la marca es: " +tipo.marca);
        var esp = new computadora();
        esp.espacio_GB=16;
        System.out.println("El espacio de la computadora:" +esp.espacio_GB);
        var pros = new computadora();
        pros.procesador="AMD";
        System.out.println("El nombre del procesador es: " +pros.procesador);
        
        
         var pc1 = new computadora();
        pc1.nombre="legion x";
        System.out.println("El nombre de la pc1 es: " +pc1.nombre);
        var tipo1 = new computadora();
        tipo1.marca="lenovo";
        System.out.println("El nombre de la marca1 es: " +tipo1.marca);
        var esp1 = new computadora();
        esp1.espacio_GB=8;
        System.out.println("El espacio de la computadora:" +esp1.espacio_GB);
        var pros1 = new computadora();
        pros1.procesador="CORE";
        System.out.println("El nombre del procesador es: " +pros1.procesador);
        
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
