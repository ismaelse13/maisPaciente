package br.com.api.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-06T23:02:16.632-0300")
@StaticMetamodel(SIGEC.class)
public class SIGEC_ {
	public static volatile SingularAttribute<SIGEC, Long> id_cirurgia;
	public static volatile SingularAttribute<SIGEC, Long> cv_prontuario;
	public static volatile SingularAttribute<SIGEC, String> cv_paciente;
	public static volatile SingularAttribute<SIGEC, Calendar> cv_data_cirurgia;
	public static volatile SingularAttribute<SIGEC, String> cv_procedimento;
	public static volatile SingularAttribute<SIGEC, String> cv_cirurgiao;
	public static volatile SingularAttribute<SIGEC, String> cv_reagendada;
	public static volatile SingularAttribute<SIGEC, Paciente> paciente;
	public static volatile SingularAttribute<SIGEC, Medico> medico;
	public static volatile SingularAttribute<SIGEC, Cirurgia> cirurgia;
}
