package aula.engenharia.camadaUso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class GravaDados {

    public static void main(String[] args) {

        ApplicationContext APcontext = new ClassPathXmlApplicationContext("aula/engenharia/spring/applicationContext.xml");
        JdbcTemplate jdbc = (JdbcTemplate) APcontext.getBean("jdbcTemplate");

        jdbc.update("insert into pessoa (nome, endereco, telefone) values ('Fragata', 'rua oito', '93382727');");
        System.out.println("Dados gravados com sucesso!");
    }
}
