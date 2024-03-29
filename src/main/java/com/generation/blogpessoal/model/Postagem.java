package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


// transforma o objeto de postagem em uma tabela no banco de dados
@Entity

// da o nome para a tabela no banco de dados
@Table(name="tb_postagem")
public class Postagem {
	
	// define a chave primaria da tabela
	@Id
	
	// define que o campo de id vai ser auto-increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//notnull indica o titulo como um campo obrigatório
	@NotNull
	@Size(min=5, max=50, message="O campo precisa ter no minimo 5 letras e no maximo 50 letras")
	private String titulo;
	
	private String texto;
	
	// Opcional - uma maneira diferente de inserir data automaticamente
	//Anotação que pega automaticamente hora e data do seu computador
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}