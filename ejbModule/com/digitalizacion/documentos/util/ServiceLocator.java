package com.digitalizacion.documentos.util;

import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public final class ServiceLocator {
	// private static final Logger log = Logger.getLogger(ServiceLocator.class);

	private static final String FACTORY = "org.jnp.interfaces.NamingContextFactory";
	private static final String PKG_PREFIXES = "org.jboss.naming:org.jnp.interface";

	public static Object obtenerServicioRemoto(String jndiName, String ipRemota) {
		Object serviceLocal = null;

		Properties env = new Properties();
		env.put("java.naming.factory.initial", FACTORY);
		env.put("java.naming.provider.url", "jnp://" + ipRemota + ":1099");
		env.put("java.naming.factory.url.pkgs", PKG_PREFIXES);
		try {
			InitialContext initialContext = new InitialContext(env);
			serviceLocal = initialContext.lookup(jndiName);
		} catch (NamingException ex) {
			ex.printStackTrace();
		}
		return serviceLocal;
	}

	@SuppressWarnings("unchecked")
	public static <T> T obtenerServicioLocal(String jndiName) {
		Object serviceLocal = null;
		try {
			InitialContext initialContext = new InitialContext();
			serviceLocal = initialContext.lookup(jndiName);
		} catch (NamingException ex) {
			// log.error("Error al obtener el contexto", ex);
		}
		return (T) serviceLocal;
	}
}
