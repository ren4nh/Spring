package aula.engenharia.camadaUso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AlterarDados {

    public static void main(String[] args) {

        ApplicationContext APcontext = new ClassPathXmlApplicationContext("aula/engenharia/spring/applicationContext.xml");
        JdbcTemplate jdbc = (JdbcTemplate) APcontext.getBean("jdbcTemplate");

        jdbc.update("update pessoa set nome = ?, endereco = ?, telefone = ? where id = ?", new Object[]{"Matheus", "ruia um", 112233, 1});
        System.out.println("Dados alterados com sucesso!");

    }
}
