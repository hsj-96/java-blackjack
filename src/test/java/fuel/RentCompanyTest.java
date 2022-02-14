package fuel;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import fuel.domain.Avante;
import fuel.domain.K5;
import fuel.domain.RentCompany;
import fuel.domain.Sonata;
import org.junit.jupiter.api.Test;

class RentCompanyTest {

    private static final String NEWLINE = "\n";

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
            "Sonata : 15리터" + NEWLINE +
                "K5 : 20리터" + NEWLINE +
                "Sonata : 12리터" + NEWLINE +
                "Avante : 20리터" + NEWLINE +
                "K5 : 30리터" + NEWLINE
        );
    }
}