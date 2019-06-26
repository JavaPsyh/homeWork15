package task.dao;

import task.db.Storage;
import task.lib.Dao;
import task.model.Human;

import java.util.List;

@Dao
public class HumanDaoImpl implements GeneralizedDao<Human> {
    @Override
    public void add(Human human) {
        Storage.HUMANS.add(human);
    }

    @Override
    public List<Human> getAll() {
        return Storage.HUMANS;
    }
}
