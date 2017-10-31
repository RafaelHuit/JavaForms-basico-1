package org.carloshuit.principal;

import javax.swing.JOptionPane;

public class EjercicioSwitch {
    //Ejercicio1
    /*
    1º) Pida por teclado el resultado (dato entero) obtenido al lanzar un dado de seis caras.
    2º) Muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado obtenido.

    Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.

    Nota 2: Si el número del dado introducido es menor que 1 ó mayor que 6, se mostrará el mensaje: "ERROR: Número incorrecto.".*/
    public static void dado(){
        int caraDado = 
                Integer.parseInt(JOptionPane.showInputDialog
        ("ingrese el número de la cara del dado"));
        if(caraDado>6){
            System.out.println("Dato incorrecto, validos del 1 al 6");
        }
        switch(caraDado){
            case 0 : {
                System.out.println("Dato incorrecto, validos del 1 al 6");
                break;
            }
            case 1 : {
                System.out.println("Ganaste Q35");
                break;
            }
            case 2 : {
                System.out.println("Ganaste Q46");
                break;
            }
            case 3 : {
                System.out.println("Pierdes Q85");
                break;
            }
            case 4 : {
                System.out.println("Ganaste Q435");
                break;
            }
            case 5 : {
                System.out.println("Ganaste 64 pt");
                break;
            }
            case 6 : {
                System.out.println("Ganaste experiencia");
                break;
            }
            
        }
        
    }
    //Ejercicio2
    /*1º) Muestre el listado de las habitaciones de la casa rural.
    2º) Pida por teclado el número (dato entero) asociado a una habitación.
    3º) Muestre por pantalla la planta y el número de camas de la habitación seleccionada.

    Nota: Si el número introducido por el usuario, no está asociado a ninguna habitación,
        se mostrará el mensaje: "ERROR: <número> no está asociado a ninguna habitación.".*/
    public static void habitacion(){
            int numeroHabitacion;
            JOptionPane.showMessageDialog(null,"Tenemos 5 tipos de habitaciones"
            +"1 color azul, 2 roja, 3 verde, 4 rosa 5 gris");
            numeroHabitacion = Integer.parseInt(
            JOptionPane.showInputDialog
            ("Ingrese el número de habitación que le interesa"));
            if(numeroHabitacion>5){
                JOptionPane.showMessageDialog(null, "El número es invalidao");
            }
            switch ( numeroHabitacion){
                case 1:{
                    JOptionPane.showMessageDialog(null,"La habitación es color Azul,"
                            + " tiene 2 camas, "
                            + "está en primera planta");
                    break;
                }
                case 2:{
                    JOptionPane.showMessageDialog(null,"La habitación es color Roja,"
                            + " tiene 1 cama, "
                            + "está en primera planta");
                    break;
                }
                case 3:{
                    JOptionPane.showMessageDialog(null,"La habitación es color Verde,"
                            + " tiene 3 camas, "
                            + "está en segunda planta");
                    break;
                }
                case 4:{
                    JOptionPane.showMessageDialog(null,"La habitación es color Rosa,"
                            + " tiene 2 camas, "
                            + "está en segunda planta");
                    break;
                }
                case 5:{
                    JOptionPane.showMessageDialog(null,"La habitación es color Gris,"
                            + " tiene 1 cama, "
                            + "está en tercera planta");
                    break;
                }
            }
        }
}
