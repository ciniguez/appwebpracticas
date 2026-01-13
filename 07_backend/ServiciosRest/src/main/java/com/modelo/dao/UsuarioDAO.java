package com.modelo.dao;


import com.modelo.entidades.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {


	public Usuario authenticate(String nombre, String clave);

}
