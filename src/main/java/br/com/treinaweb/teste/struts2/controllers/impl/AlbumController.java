package br.com.treinaweb.teste.struts2.controllers.impl;

import java.util.List;

import br.com.treinaweb.teste.struts2.controllers.interfaces.Controller;
import br.com.treinaweb.teste.struts2.dao.impl.AlbumDAO;
import br.com.treinaweb.teste.struts2.models.Album;

public class AlbumController extends Controller<Album, Integer> {

	public AlbumController() {
		super(new AlbumDAO());
	}

	@Override
	public String listar() {
		try {
			List<Album> albuns = this.dao.todos();
			albuns.sort((o1, o2) -> {
				return o1.getNome().compareTo(o2.getNome());
			});
			this.setModelos(albuns);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String detalhar() {
		try {
			this.setModelo(dao.porId(this.getId()));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String inserir() {
		try {
			dao.inserir(getModelo());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String prepararAlterar() {
		try {
			Album album = dao.porId(getId());
			setModelo(album);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String alterar() {
		try {
			dao.atualizar(getModelo());
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String deletar() {
		try {
			Album album = dao.porId(getId());
			dao.deletar(album);
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}	}

}
