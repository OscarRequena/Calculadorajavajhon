package Input;

import java.util.Scanner;
public class Input {
        
    public int  getOptionMenu(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public int getOperando(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}