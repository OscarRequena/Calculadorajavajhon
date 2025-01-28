package Main;

import Input.Input;
import Math.Matematico;
import Output.Output;
import Validators.Validador;
import Math.Vector;

public class Calculadora {
    
    private static int opcionMenu;
    private static Input input;
    private static Output output;
    private static int operando1;
    private static int operando2;
    
    public static final int SUMAR = 1;
    public static final int RESTAR = 2;
    public static final int MULTIPLICAR = 3;
    public static final int DIVIDIR = 4;
    public static final int SUMAR_VECTORES = 5;
    public static final int SALIR = 6;
            
    public static void main(String[] args) {  
         input  = new Input();
         output = new Output();
        
        boolean usuarioQuiereSalir = false;
        do{            
        
            boolean esValido;
            do{                    
                menu();

                getOptionMenu();

                esValido = validadorOptionMenu();
            } while(!esValido);
                                  
        if(opcionMenu == 6){
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
        output.menu();
        }
        private static void getOptionMenu(){
            opcionMenu = input.getOptionMenu();
        }
        private static boolean validadorOptionMenu(){
        Validador validador = new Validador();
         return validador.validar(opcionMenu);
        }
        private static void operacionMenu(int op1, int op2){
            Matematico matematico = new Matematico();
            switch(opcionMenu){
                case SUMAR:
                    pedirOperandos();
                    output.mostrarResultado(suma);
                    break;
                case RESTAR:
                    pedirOperandos();
                    output.mostrarResultado(resta);
                    break;
                case MULTIPLICAR:
                    pedirOperandos();
                    output.mostrarResultado (multiplicacion);
                    break;
                case DIVIDIR:
                    if (op2 == 0) {
                            output.mostrarError();
                    } else {
                            pedirOperandos();
                            output.mostrarResultado(division);
                    }
                    break;
                case SUMAR_VECTORES:
                    addVector();
                    break;
                case SALIR:
                    salir();
            }        
        }
        private static void suma(){
            
        }
        private static void operando(){
            output.operando();
        }
        private static int  getOperando(){
            int operando = input.getOperando();
            return operando;
        }
        private static void addVector(){
            Vector v1 = createVector();
            Vector v2 = createVector();
            
            Vector v3 = Matematico.sumar(v1,v2);
        }    
        private static Vector createVector(){
            output.pedirComponente();
            float c1 = input.getComponente();
            output.pedirComponente();
            float c2 = input.getComponente();
            
            Vector vector = new Vector (c1,c2);
            return vector;
        }
        
        private static void pedirOperandos(){
            output.pedirOperandos();
            operando1 = input.getOperando();
            
            output.pedirOperandos();
            operando2 = input.getOperando();
        }
        private static void salir() {
         output.salir();
    }
}