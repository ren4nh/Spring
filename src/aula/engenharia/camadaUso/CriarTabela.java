package aula.engenharia.camadaUso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class CriarTabela {

    public static void main(String[] args) {

        ApplicationContext APcontext = new ClassPathXmlApplicationContext("aula/engenharia/spring/applicationContext.xml");
        JdbcTemplate jdbc = (JdbcTemplate) APcontext.getBean("jdbcTemplate");
        
        jdbc.execute("create table pessoa(id serial, nome varchar(20), endereco varchar(20), telefone numeric(20), primary key (id));");
        System.out.println("Tabela criada com sucesso!");
    }
}
