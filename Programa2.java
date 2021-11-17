import java.io.*;
import java.util.Arrays;

public class Programa2 {

	public static void main(String args[]) throws IOException {
        FileInputStream arquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert\arquivo.txt");
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader l = new BufferedReader(input);
        String  linha = l.readLine();vo
        String input1 = linha;
        linha = br.readLine();
        String [] input2 = input1.split(" ");
        String [] input = new String[Integer.parseInt(input2[1])];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = l.readLine();
        }
        int [] vendedor = new int [Integer.parseInt(input2[0])];
        int [] resultadovendedor = new int [Integer.parseInt(input2[0])];
        int fim = 1;
        for(int j = 0; j < vendedor.length; j++) {
        	try {
        	vendedor[j] = Integer.parseInt(input[j]);
        	input[j] = "0";
        	} catch (Exception e) {
        	      System.out.println("Falta atendentes!");
            }
        }
        while(fim == 1) {
        	fim = 0;
        	for(int j = 0; j < vendedor.length; j++) {
            	vendedor[j] = vendedor[j]-1;
            	if(vendedor[j] == 0) {
            		resultadovendedor[j] = resultadovendedor[j] + 1;
            	}
            }
            for(int j = 0; j < vendedor.length; j++) {
            	for(int k = 0; k < input.length; k++) {
            		if(vendedor[j] == 0 && Integer.parseInt(input[k])!=0) {
            			try {
            			vendedor[j] = Integer.parseInt(input[k]);
            			input[k] = "0";
            			} catch (Exception e) {
                  	      System.out.println("Falta atendentes!");
                        }
            		}
            	}
            }
            for(int j = 0; j < vendedor.length; j++) {
            	if(vendedor[j]>0) {
            		fim = 1;
            	}
            }
        }
        for(int j = 0; j < vendedor.length; j++) {
        	System.out.println(j + 1 + " " + resultadovendedor[j]);
        }
	}
}
