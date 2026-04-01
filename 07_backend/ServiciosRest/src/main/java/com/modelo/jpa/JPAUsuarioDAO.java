package com.modelo.jpa;

import java.util.List;

import jakarta.persistence.Query;

import com.modelo.dao.UsuarioDAO;
import com.modelo.entidades.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

	public JPAUsuarioDAO() {
		super(Usuario.class);
	}

	@Override
	public Usuario authenticate(String nombre, String clave) {
		/***** Opcion 1 ****/
		Usuario personaAutorizada = null;

		for (Usuario persona : this.get()) {
			if (persona.getClave().equals(clave) && persona.getNombre().equals(nombre)) {
				personaAutorizada = persona;
				break;
			}
		}
		/****** Opcion 2 *****/
		// Con JPQL
		/*
		String sentenceJPQL = "SELECT p from Persona p WHERE p.nombre= :param_nombre AND p.clave= :param_clave";
		Query query = this.em.createQuery(sentenceJPQL);
		query.setParameter("param_nombre", nombre);
		query.setParameter("param_clave", clave);
		personaAutorizada = (Persona) query.getSingleResult();
		*/

		/***** Opcion 3 ******/
		// CON NamedQuery
		/*
		Query query1 = em.createNamedQuery("encontrarPersonaPorNombreYClave");
		query1.setParameter("param_nombre", nombre);
		query1.setParameter("param_clave", clave);
		
		personaAutorizada = (Persona) query1.getSingleResult();
		*/


		return personaAutorizada;

	}

}
