package br.com.k19.managedbeans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.k19.sessionBeans.CarrinhoBean;

@ManagedBean
@SessionScoped
public class CarrinhoMB {
	@EJB
	private CarrinhoBean carrinhoBean;
	
	private String produto;
	
	public List<String> getProdutos() {
		return new ArrayList<String>(carrinhoBean.getProdutos());
	}
	
	public void adiciona() {
		this.carrinhoBean.adiciona(this.produto);
	}
	
	public void remove(String produto) {
		this.carrinhoBean.remove(produto);
	}
	
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public String getProduto() {
		return this.produto;
	}
	
}
