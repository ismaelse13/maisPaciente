package br.com.api.model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2018-03-01T23:31:12.130-0300")
@StaticMetamodel(Cirurgia.class)
public class Cirurgia_ {
	public static volatile SingularAttribute<Cirurgia, Long> id;
	public static volatile SingularAttribute<Cirurgia, String> procedimento;
	public static volatile SingularAttribute<Cirurgia, String> cirurgiao;
	public static volatile SingularAttribute<Cirurgia, Boolean> reagendada;
	public static volatile SingularAttribute<Cirurgia, Boolean> cancelada;
	public static volatile SingularAttribute<Cirurgia, Boolean> realizada;
	public static volatile SingularAttribute<Cirurgia, String> cpf;
	public static volatile SingularAttribute<Cirurgia, String> prontuario;
	public static volatile SingularAttribute<Cirurgia, Paciente> paciente;
	public static volatile SingularAttribute<Cirurgia, Calendar> dataCirurgiaMarcada;
	public static volatile SingularAttribute<Cirurgia, Calendar> dataCirurgiaReagendada;
	public static volatile SingularAttribute<Cirurgia, Calendar> dataCirurgiaCancelada;
}
