package aula.engenharia.camadaUso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class DeletarDados {

    public static void main(String[] args) {

        ApplicationContext APcontext = new ClassPathXmlApplicationContext("aula/engenharia/spring/applicationContext.xml");
        JdbcTemplate jdbc = (JdbcTemplate) APcontext.getBean("jdbcTemplate");

        jdbc.update("delete from pessoa where id = ?", new Object[]{2});
        System.out.println("Dados deletados com sucesso!");
    }
}
