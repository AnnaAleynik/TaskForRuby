package aleynik.sequence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        Sequence s = new Sequence(in);
        System.out.println(s.toString());
        s.print(3);
        
	}
}
