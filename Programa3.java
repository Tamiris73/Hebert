import java.io.*;
import java.util.Arrays;

public class Programa3 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream arquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert\arquivo.txt");
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader l = new BufferedReader(input);
        String  linha = l.readLine();
        String [] input = new String[2];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = l.readLine();
        }
        String[] input1 = input[0].split(" ");
        String[] input2 = input[1].split(" ");
        int [] input3 = new int [input1.length];
        int [] input4 = new int [input2.length];
        for(int j=0; j<input1Sep.length; j++) {
        	input3[j] = Integer.parseInt(input1[j]);
        	input4[j] = Integer.parseInt(input2[j]);
        }
        if(input4[0] >= input3[0] && input4[0] <= input3[2] && input4[1] >= input3[1] && input4[1] <= input3[3]) {
        	System.out.println("1");        	
        } else {
        	if(input4[2] >= input3[0] && input4[2] <= input3[2] && input4[3] >= input3[1] && input4[3] <= input3[3]) {        	
        		System.out.println("1");
        	} else {
        		System.out.println("0");
        	}
        }
	}
}
