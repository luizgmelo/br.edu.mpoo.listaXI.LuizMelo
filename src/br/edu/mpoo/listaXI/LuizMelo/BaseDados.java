package br.edu.mpoo.listaXI.LuizMelo;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes;
	private final static String CLIENTE_NULL = "Erro ao adicionar o cliente: dados inválidos";
	private final static String CLIENTE_EXISTE = "Erro ao adicionar o cliente: já existe na base!";
	
	public static void createBase() {
		clientes = new ArrayList<Cliente>();
		inicializarBase();
	}
	
	public static void inicializarBase() {
		// adicionar clientes exemplo
		// adicionarCliente(new Cliente("Fulano", "11111111111"));
	}
	
	public static Cliente buscarCliente(String cpf) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getCpf().equals(cpf)) {
				return clienteCurrent;
			}
		}
		return null;
	}
	
	public static Cliente buscarCliente(Cliente cliente) {
		return buscarCliente(cliente.getCpf());
	}
	
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente));
	}
	
	public static boolean adicionarCliente(Cliente cliente) throws CPFException, ClienteException {
		if (cliente == null) {
			throw new ClienteException(CLIENTE_NULL);
		}
		
		if (Validador.validarCPF(cliente.getCpf())) {
			if (!isCliente(cliente)) {
				Mensagem.exibirMensagem("Cliente adicionado com Sucesso");
				return clientes.add(cliente);
			} else {
				throw new ClienteException(CLIENTE_EXISTE);
			}
		}
		
		throw new ClienteException(CLIENTE_NULL);
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
