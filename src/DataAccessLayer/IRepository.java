package DataAccessLayer;

import java.util.List;

public interface IRepository<T> {
    void add(T item);
    T getById(int id);
    List<T> getAll();
    void update(T item);
    boolean delete(int id);
}
