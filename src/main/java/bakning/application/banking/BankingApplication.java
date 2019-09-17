package bakning.application.banking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingApplication implements CommandLineRunner {

    @Autowired
    private DataInitializerImpl dataInitializer;

    public static void main(String[] args) {
        SpringApplication.run(BankingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        dataInitializer.initData();

    }
}
