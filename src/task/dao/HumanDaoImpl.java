package task.dao;

import task.db.Storage;
import task.lib.Dao;
import task.model.Human;

import java.util.List;

@Dao
public class HumanDaoImpl implements HumanDao {
    @Override
    public void add(Human human) {
        Storage.humans.add(human);
    }

    @Override
    public List<Human> getAll() {
        return Storage.humans;
    }
}
