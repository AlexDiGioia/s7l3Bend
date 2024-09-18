package alexdigioia.s7l3Bend.es1;

import java.util.Date;

public class Adapter implements DataSource {
    private final Info info;


    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        Date now = new Date();
        long timeDifference = now.getTime() - info.getDataDiNascita().getTime();
        return (int) (timeDifference / (1000L * 60 * 60 * 24 * 365));
    }
}
