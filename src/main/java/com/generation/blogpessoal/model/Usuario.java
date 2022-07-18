package com.generation.blogpessoal.model; 
 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table; 
import javax.validation.constraints.Email; 
import javax.validation.constraints.NotNull; 
import javax.validation.constraints.Size; 
 
import io.swagger.v3.oas.annotations.media.Schema; 
 
@Entity 
@Table(name = "tb_usuario") 
public class Usuario { 
 
 @Id 
 @GeneratedValue(strategy = GenerationType.IDENTITY) 
 private Long id; 
  
 @NotNull 
 @Size(min = 2, max = 100) 
 private String nome; 
  
 @Schema(example = "email@email.com.br") 
 @NotNull(message = "O atributo Usuário é Obrigatório!") 
 @Email(message = "O atributo Usuário deve ser um email válido!") 
 private String usuario; 
  
 @NotNull 
 @Size(min = 8) 
 private String senha; 
 
 public Usuario(Long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		
	}

	public Usuario() {	}

 
 public Long getId() { 
  return id; 
 } 
 
 public void setId(Long id) { 
  this.id = id; 
 } 
 
 public String getNome() { 
  return nome; 
 } 
 
 public void setNome(String nome) { 
  this.nome = nome; 
 } 
 
 public String getUsuario() { 
  return usuario; 
 } 
 
 public void setUsuario(String usuario) { 
  this.usuario = usuario; 
 } 
 
 public String getSenha() { 
  return senha; 
 } 
 
 public void setSenha(String senha) { 
  this.senha = senha; 
 } 
}
