package services;

import dao.IProdutoDAO;
import domain.Produto;
import generics.services.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}