package Stadion;


import Stadion.bo.Gewaltbereitschaft;
import Stadion.bo.Zuschauer;
import Stadion.dao.ZuschauerDao;
import Stadion.dao.ZuschauerVorhandenException;

public class test {
    public static void main(String[] args) {
        new test().doWork();
    }

    public void doWork(){
        ZuschauerDao instance = ZuschauerDao.getInstance();


        try {
            instance.Insert(new Zuschauer("Lisa Müller", 30, "987654321", Gewaltbereitschaft.FRIEDLICH));
        } catch (ZuschauerVorhandenException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(instance.findAll());
    }
}
