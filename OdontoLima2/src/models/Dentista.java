package models;

import java.time.Instant;
import java.time.LocalDate;

public class Dentista {
	
	private int id;
	private String nome;
	private LocalDate nascimento; 
	private String cpf;
	private String rg;
	private String cro;
	private String telefone;
	private String endereco;
	private String email;
	private String sexo;
	private String especialidade;
	
	public Dentista() {}

	public Dentista(int id, String nome, LocalDate nascimento, String cpf, String rg, String cro, String telefone,
			String endereco, String email, String sexo, String especialidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.cro = cro;
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.especialidade = especialidade;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	
	

}

