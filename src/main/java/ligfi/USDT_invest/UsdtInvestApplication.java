package ligfi.USDT_invest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class UsdtInvestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsdtInvestApplication.class, args);
	}

}
