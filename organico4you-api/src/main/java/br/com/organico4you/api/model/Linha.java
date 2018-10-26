package br.com.organico4you.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="linha")
public class Linha {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="quantidade_itens")
	private Long quantidadeItens;
	
	@ManyToOne
	private Long relatorio;

	@OneToMany
	private Long item;
	
	public Long getId() {
		return id;
	}

	public Long getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(Long quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public Long getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(Long relatorio) {
		this.relatorio = relatorio;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantidadeItens == null) ? 0 : quantidadeItens.hashCode());
		result = prime * result + ((relatorio == null) ? 0 : relatorio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linha other = (Linha) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantidadeItens == null) {
			if (other.quantidadeItens != null)
				return false;
		} else if (!quantidadeItens.equals(other.quantidadeItens))
			return false;
		if (relatorio == null) {
			if (other.relatorio != null)
				return false;
		} else if (!relatorio.equals(other.relatorio))
			return false;
		return true;
	}

	

}
