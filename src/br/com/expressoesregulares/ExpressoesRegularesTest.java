package br.com.expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		//metacaracteres 
		// \d - todos os dígitos
		// \D - tudo o que não for dígito
		// \s espaços em branco \t \n \f \r
		// \w caracteres de palavra a-z A-Z, digitos e _
		// \W tudo o que não for caractere de palavra
		// []
		// ? zero ou uma
		// + zero ou mais
		//[n,m] de n ate m
		// { }
		// ( )
        // |
        // $
        // . coringa 1.3 = 123,133,1A3,1#3, 1 3
        // ^ [^abc]
		int hex=0x1;
		String regex ="([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
		String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.br, teste@mail,teste.com.br";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher  = pattern.matcher(texto);
		System.out.println("texto: " + texto);
		System.out.println("indice: 012345678901234567");
		System.out.println("expressao: " + matcher.pattern());
		System.out.println("posicoes encontradas: ");
		while(matcher.find()) {
			System.out.println(matcher.start() + " " + matcher.group());
		}
		
	}

}
