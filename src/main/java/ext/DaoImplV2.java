package ext;

import dao.IDao;
import org.springframework.stereotype.Repository;

@Repository("ext")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version Web Service");

        return 31;
    }
}
