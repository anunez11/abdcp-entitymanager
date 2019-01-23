package pe.gtdo.entitymanager.adapter;

import java.sql.Types;

import org.hibernate.dialect.ProgressDialect;



public class TypePostgreSQLDialect extends ProgressDialect  {

    public TypePostgreSQLDialect() {

        super();
        this.registerColumnType(Types.JAVA_OBJECT, "json");
        this.registerColumnType(Types.JAVA_OBJECT, "varchar[]");
        this.registerColumnType(Types.JAVA_OBJECT, "xml");
    }
}