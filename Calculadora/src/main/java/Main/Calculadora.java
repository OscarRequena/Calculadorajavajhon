package Main;

import Input.Input;
import Math.Matematico;
import Output.Output;
import Validators.Validador;

public class Calculadora {
    
    private static int opcionMenu;
            
    public static void main(String[] args) {  
        boolean usuarioQuiereSalir = false;
        do{            
        
            boolean esValido;
            do{                    
                menu();

                getOptionMenu();

                esValido = validadorOptionMenu();
            } while(!esValido);
                                  
        if(opcionMenu == 5){
            usuarioQuiereSalir = true;
        }else{
            operando();
             int operando1 = getOperando();
             operando();
             int operando2 = getOperando();
            
            operacionMenu(operando1, operando2);
            }        
        } while(!usuarioQuiereSalir);
        
        salir();
    }
    
    private static void menu(){
        Output output = new Output();
        output.menu();
        }
        private static void getOptionMenu(){
            Input input  = new Input();
            opcionMenu = input.getOptionMenu();
        }
        private static boolean validadorOptionMenu(){
        Validador validador = new Validador();
         boolean esValido = validador.validar(opcionMenu);
         return esValido;
        }
        private static void operacionMenu(int op1, int op2){
            Matematico matematico = new Matematico();
            Output output = new Output();
            switch(opcionMenu){
                case 1:
            int suma = matematico.sumar(op1, op2);
            output.mostrarResultado(suma);
            break;
                case 2:
            int resta = matematico.restar(op1, op2);
            output.mostrarResultado(resta);
            break;
                case 3:
            int multiplicacion = matematico.multiplicar(op1, op2);
                output.mostrarResultado (multiplicacion);
                break;
                case 4:
            if (op2 == 0) {
                    output.mostrarError();
                } else {
                    int division = matematico.dividir(op1, op2);
                    output.mostrarResultado(division);
                }
                break;
            }        
        }
        private static void operando(){
            Output output = new Output();
            output.operando();
        }
        private static int  getOperando() {
            Input input = new Input();
            int operando = input.getOperando();
            return operando;
        }
        private static void salir() {
        Output output = new Output();
        output.salir();
    }
}