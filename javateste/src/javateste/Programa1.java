package javateste;

import java.io.*;
import java.util.Arrays;

public class Programa1 {
	
	public static void main(String args[]) throws IOException {
		//Localizando o Arquivo (Colocando seu path)
        FileInputStream stream = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert\\arquivo.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String linha = br.readLine();
        
        //Recebendo os Inputs do arquivo
        String [] input = new String[3];
        int i = -1;        
        while(linha != null) {
        	i = i + 1;
            input[i] = linha;
            linha = br.readLine();
        }
        String[] TamanhoSeparado = input[2].split(" ");

        //Funcionamento do programa
        int m = 0;
        int s = 0;
        for(int k=0; k < TamanhoSeparado.length; k++) {
        	m += Integer.parseInt(TamanhoSeparado[k]); 
        }
        m = m / Integer.parseInt(input[0]);
        
        while(m > 0) {
        	for(int k=0; k < TamanhoSeparado.length; k++) {
            	s += Integer.parseInt(TamanhoSeparado[k]) / m;
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