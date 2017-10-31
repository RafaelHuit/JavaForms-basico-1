package org.carloshuit.principal;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ka1 {
    //Ejercicios
    /*
    1.	Hacer una función que diga si un número es primo int primo(int n).  Por ejemplo los números 1, 3, 5, 7, 11, 13, 17 y 19 son números primos.

2.	Hacer una función que diga si un carácter está en una cadena y en qué posición se encuentra. Por ejemplo en la palabra “Guatemala” el caracter A aparece en la posición 3, 7 y 9.

3.	Hacer una función que diga si un número es narcisista.  Un número narcisista es un número de n dígitos que resulta ser igual a la suma de las potencias de orden n de sus dígitos. Ejemplo: 153 = 1³ + 5³ + 3³.

4.	Hacer una función que dadas las coordenadas de la esquina superior izquierda y la esquina inferior derecha de una caja, dibuje la caja.

5.	Hacer una función que diga si una palabra es un palíndroma.  Un palíndromo es una palabra, número o frase que se lee igual hacia adelante que hacia atrás. Por ejemplo, la palabra “Reconocer” es palíndroma.

6.	Hacer una función que llene aleatoriamente en arreglo bidimensional de 10 x 10, con 1’s y 0’s, que muestre el contenido del arreglo y que determine cuantos 1’s hay alrededor de una posición determinada del arreglo (fila, columna).
*/
    
    //public static void main(String args[]){
        //formato Metodos
        //Nota:Borrar diagonales del metodo a utilizar.
        //comprobarNumero();
        //buscarCaracter();
        //comprobarNarcisista();
        //dibujarCuadro();
        //palindroma();
        //numeroAleatorio();
        
        //formato Funciones
        //funcionNumeroPrimo(7); //comprobar número primo
        
        /*
        String a,b;
        a = JOptionPane.showInputDialog("ingresa una palabra");
        b = JOptionPane.showInputDialog("Ingresa la letra que buscas");
        funcionBuscarLetra(a,b);//Buscar Caracter
        */
        
        /*
        String c = JOptionPane.showInputDialog("ingrese un numero");
        funcionComprobarNarcisista(c);
        */
        
        /*
        funcionDibujarCuadro(5,5);
        */
        
        /*
        funcionPalabraPalindroma("reconocer");
        */
        
        /*
        funcionNumerosAleatorios(5,5);
        */
      
    //}
    public static void comprobarNumero(){
        int numero = 
            Integer.parseInt((JOptionPane.showInputDialog("Ingrese un número")));
        int contador=0;
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                contador++;
            }
            
        }
        if(contador==2){
                System.out.println("El número ingresado es primo");
            }else{
                System.out.println("El número ingresado no es primo");

        }
        
    }
    public static void buscarCaracter(){
        String palabra=JOptionPane.showInputDialog("ingresa una palabra");
        String letra = JOptionPane.showInputDialog("Ingresa la letra que busca");
        char[] vector = palabra.toCharArray();
        for(int i=0;i<palabra.length();i++){
            String deletreo = String.valueOf(vector[i]);
            if(deletreo.equalsIgnoreCase(letra)){
                System.out.println("La letra esta en la posición "+(i+1));
            }
        }
    }
    public static void comprobarNarcisista(){
        String numero = JOptionPane.showInputDialog("ingresa un número");
        char[] numeraso= numero.toCharArray();
        int elevacion = numero.length();
        int contador=0;
        int memo=0;
        for(int i = 0;i<numero.length();i++){
            //System.out.println(String.valueOf(numeraso[i]));
            contador = Integer.parseInt(String.valueOf(numeraso[i]));
            memo=(int) (memo+Math.pow(contador, elevacion));
            contador=memo;
            
        }
        System.out.println(contador);
        if(contador==Integer.parseInt(numero)){
            System.out.println("Este numero es narcisista");
        }else{
            System.out.println("Este numero no es narcisista");
        }
        
    }
    public static void dibujarCuadro(){
        int altura= Integer.parseInt(JOptionPane.showInputDialog("Altura"));
        int anchura= Integer.parseInt(JOptionPane.showInputDialog("ancho"));
        
        for(int i=0;i<altura;i++){
            System.out.println(" ");
            for(int a = 0;a<anchura;a++){
                System.out.print(" * ");
            }
        }

    }
    public static void palindroma(){
        String palabra = "reconocker";
        int contador = 0;
        for(int a = 0;a<palabra.length();a++){
            if(palabra.charAt(a)==palabra.charAt(palabra.length()-a-1)){
                contador ++;
            }
                
        }
        if(contador==palabra.length()){
            System.out.println("Es palindroma");
        }else{
            System.out.println("no es palindroma");
        }
    }
    public static void numeroAleatorio(){
        Random aleatorio = new Random();
        int[][] vector = new int[10][10];
        for(int i = 0;i<10;i++){
            for(int a = 0; a<10;a++){
                vector[i][a]= aleatorio.nextInt(2+0);
            }
        }
        for(int b =0;b<10;b++){
            System.out.println("");
            for(int c = 0;c<10;c++ ){
                System.out.print(" "+vector[b][c]);
            }
        }
        int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese columna"));
        int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fila"));
        int contador = 0;
        if(vector[fila-1][columna]==1){
            contador++;
        }
        if(vector[fila+1][columna]==1){
            contador++;
        }
        if(vector[fila][columna-1]==1){
            contador++;
        }
        if(vector[fila][columna+1]==1){
            contador++;
        }
        System.out.println("\n"+"Hay " + contador + " unos al rededor de la posición");
        
        
        
        
    }
    
    //Formato funciones
    public static int funcionNumeroPrimo(int numero){
        int contador = 0;
        for(int i = 1; i<=numero;i++){
            if(numero%i==0){
                contador++;
            }
        }
        if(contador==2){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }
        return numero;
    }
    
    public static String funcionBuscarLetra(String palabra, String letra){
        
        char [] vectorcito = palabra.toCharArray();
        
        for(int i  = 0 ; i < palabra.length(); i++ ){
            String letraBuscada = String.valueOf(vectorcito[i]);
            if(letra.equalsIgnoreCase(letraBuscada)){
                System.out.println("la letra se encuentra en la posición "+ (i+1));
            }
        }
        return letra;
    }
    public static String funcionComprobarNarcisista(String numero){
        char[] vectorcito = numero.toCharArray();
        int potenciacion = numero.length();
        int contador = 0;
        for(int i = 0; i < numero.length(); i++){
            int digitos = Integer.parseInt(String.valueOf(vectorcito[i]));
            contador = contador + ((int)Math.pow(digitos,potenciacion));
        }
        int numeroToInt = Integer.parseInt(numero);
        if(contador==numeroToInt){
            System.out.println("El número es narcisista");
        }else{
            System.out.println("El número no es narcisista");
        }
        return numero;
    }
    public static int funcionDibujarCuadro(int alto, int ancho){
        for(int i = 0 ; i < alto; i++ ){
            System.out.println(" ");
            for(int a = 0 ; a < ancho ; a++){
                System.out.print(" * ");
            }
        }
        return alto;
    }
    public static String funcionPalabraPalindroma(String palabra){
        int contador = 0;
        for(int i = 0 ; i < palabra.length();i++ ){
            if(palabra.charAt(i)==palabra.charAt(palabra.length()-i-1)){
                contador++;
            }
        }
        if(contador==palabra.length()){
            System.out.println("La palabra es palindroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
        return palabra;
    }
    public static int funcionNumerosAleatorios(int fila,int columna){
        Random generarNumeroRandom = new Random();
        int relleno = 10;
        int [][] vectorcito = new int [relleno][relleno];
        int contador = 0;
        for(int i = 0; i < relleno; i++ ){
            for(int a = 0 ; a < relleno; a++){
                int numeroRandom = generarNumeroRandom.nextInt(2+0);
                vectorcito[i][a] = numeroRandom;                
            }
        }
        for(int b = 0; b < relleno ; b++){
                System.out.println(" ");
            for(int c = 0 ; c < relleno; c++){
                System.out.print(" "+vectorcito[b][c]);
            }
        }
        if(vectorcito[fila-1][columna]==1){
            contador++;
        }
        if(vectorcito[fila+1][columna]==1){
            contador++;
        }
        if(vectorcito[fila][columna-1]==1){
            contador++;
        }
        if(vectorcito[fila][columna+1]==1){
            contador++;
        }
        System.out.println("\n"+"Hay "
                +contador+" unos al rededor de la posición ingresada: "+
                "fila "+ fila + " columna "+columna );
        return relleno;
    }
}
//generar numero aleatorio con la clase random
//for(int i = 0;i<10;i++ ){
        //    int numeroRandom = ran.nextInt(10+1);
        //    System.out.println(""+numeroRandom);
        //}
