package ua.lviv.iot.lab3;

import ua.lviv.iot.lab3.Shoe;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class ShoeDaoImpl extends AbstractDao<Shoe> implements ShoeDao, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    protected Class<Shoe> getEntityClass() {
        return Shoe.class;
    }

}