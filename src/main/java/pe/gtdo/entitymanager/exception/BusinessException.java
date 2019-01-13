package pe.gtdo.entitymanager.exception;

import javax.ejb.ApplicationException;


/**
 * <ul>
 * <li>Copyright 2019 OMNISYS. Todos los derechos reservados.</li>
 * </ul> 
 * 
 * La Class BusinessException.
 *
 * @author OMNISYS
 * @version 1.0 , 10/01/2019
 */

@ApplicationException(inherited=true,rollback=true)
public class BusinessException extends Exception {

	/** La Constante serialVersionUID. */
	private static final long serialVersionUID = 6242547663324560044L;

	/**
	 * Instancia un nuevo business exception.
	 */
	public BusinessException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instancia un nuevo business exception.
	 *
	 * @param message el message
	 */
	public BusinessException(String message) {
		super(message);
	}
	
	

}
