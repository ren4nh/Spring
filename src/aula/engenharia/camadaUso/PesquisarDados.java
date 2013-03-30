package aula.engenharia.camadaUso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class PesquisarDados {

    public static void main(String[] args) {

        ApplicationContext APcontext = new ClassPathXmlApplicationContext("aula/engenharia/spring/applicationContext.xml");

        JdbcTemplate jdbc = (JdbcTemplate) APcontext.getBean("jdbcTemplate");

        System.out.println(jdbc.queryForObject("select nome from pessoa where id = 2", String.class));
        System.out.println(jdbc.queryForList("select nome from pessoa"));
        System.out.println("Dados pesquisados com sucesso!");
    }
}
