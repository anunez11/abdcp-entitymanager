package pe.gtdo.entitymanager.producer;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

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

@Qualifier
@Target({ TYPE, METHOD, PARAMETER, FIELD })
@Retention(RUNTIME)
@Documented
public @interface DbApplication {

}
