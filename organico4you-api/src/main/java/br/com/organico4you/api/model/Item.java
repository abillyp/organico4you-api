package br.com.organico4you.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="item")
public class Item {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="codigo")
	private long id;
	
	@NotNull
	private String sku;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@Column(name="valor_dinheiro")
	private BigDecimal valorDinheiro;
	
	@NotNull
	@Column(name="valor_Cartao")
	private BigDecimal valorCartao;

	public BigDecimal getValorDinheiro() {
		return valorDinheiro;
	}

	public void setValorDinheiro(BigDecimal valorDinheiro) {
		this.valorDinheiro = valorDinheiro;
	}

	public BigDecimal getValorCartao() {
		return valorCartao;
	}

	public void setValorCartao(BigDecimal valorCartao) {
		this.valorCartao = valorCartao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getSku() {
		return sku;
	}
	
	public void setSku(String sku) {
		this.sku = sku;
	}
	
}
