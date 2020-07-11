package br.com.treinaweb.teste.struts2.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;
import br.com.treinaweb.teste.struts2.models.Musica;

public class MusicaDAO implements IDAOGenerico<Musica, Integer> {

	@SuppressWarnings("unchecked")
	@Override
	public List<Musica> todos() {
		List<Musica> musicas = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		musicas = entityManager.createQuery("from Musica").getResultList();
		entityManager.close();
		entityManagerFactory.close();
		return musicas;
	}

	@Override
	public Musica porId(Integer id) {
		Musica musica = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		musica = entityManager.find(Musica.class, id);
		entityManager.close();
		entityManagerFactory.close();
		return musica;
	}

	@Override
	public void inserir(Musica modelo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	public void atualizar(Musica modelo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

	@Override
	public void deletar(Musica modelo) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TreinaWebTesteJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		modelo = entityManager.find(Musica.class, modelo.getId());
		modelo.setAlbum(null);
		entityManager.remove(modelo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}

}
