import java.io.*;
import java.util.Arrays;

public class Programa1 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream arquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert\arquivo.txt");
        InputStreamReader input = new InputStreamReader(arquivo);
        BufferedReader l = new BufferedReader(input);
        String  linha = l.readLine();
        String [] input = new String[3];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = l.readLine();
        }
        String[] tamanho = input[2].split(" ");
        int m = 0;
        int s = 0;
        for(int k=0; k < tamanho.length; k++) {
        	m += Integer.parseInt(tamanho[k]); 
        }
        m = m / Integer.parseInt(input[0]);
        while(m > 0) {
        	for(int k=0; k < tamanho.length; k++) {
            	s += Integer.parseInt(tamanho[k]) / m;
        	}
        	if(s == Integer.parseInt(input[0])) {
        		System.out.println(m);
        		break;
        	}
        	else {
        		m = m - 1;
        		s = 0;
        	}
        }
    }
}