package alexdigioia.s7l3Bend.es1;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

@Component
public class Runner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Userdata userdata = new Userdata();

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        LocalDate dataDiNascita = LocalDate.of(1990, Month.JANUARY, 1);
        Date dataDiNascitaDate = Date.from(dataDiNascita.atStartOfDay(ZoneId.systemDefault()).toInstant());
        info.setDataDiNascita(dataDiNascitaDate);

        Adapter adapter = new Adapter(info);

        userdata.getData(adapter);
        
        System.out.println("Nome completo: " + userdata.getNomeCompleto());
        System.out.println("Età: " + userdata.getEta());
    }
}