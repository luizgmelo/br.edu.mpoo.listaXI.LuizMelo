package br.edu.mpoo.listaXI.LuizMelo;

public class App {
	public static void main(String[] args) {
		BaseDados.createBase();
		// utilizei esse gerador de cpf https://www.4devs.com.br/gerador_de_cpf e tirei pontos e o hífen.
		Cliente clienteCpfValido = new Cliente("Fulano", "39788152066");
		Cliente clienteCpfInvalido = new Cliente("Beltrano", "00000000000");
		Cliente clienteNull = null;
		
		try {
			BaseDados.adicionarCliente(clienteCpfValido);
		} catch (CPFException e) {
			Mensagem.exibirMensagem(e.getMessage());
		} catch (ClienteException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		
		try {
			BaseDados.adicionarCliente(clienteCpfInvalido);
		} catch (CPFException e) {
			Mensagem.exibirMensagem(e.getMessage());
		} catch (ClienteException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		
		try {
			BaseDados.adicionarCliente(clienteNull);
		} catch (CPFException e) {
			Mensagem.exibirMensagem(e.getMessage());
		} catch (ClienteException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
		
		try {
			BaseDados.adicionarCliente(clienteCpfValido);
		} catch (CPFException e) {
			Mensagem.exibirMensagem(e.getMessage());
		} catch (ClienteException e) {
			Mensagem.exibirMensagem(e.getMessage());
		}
	}
}
