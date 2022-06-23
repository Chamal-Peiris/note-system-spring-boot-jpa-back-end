package lk.ijse.dep.note.repository;


import lk.ijse.dep.note.entity.SuperEntity;


import java.io.Serializable;
import java.util.Optional;
import java.util.List;

public interface CrudRepository<T extends SuperEntity,ID extends Serializable> extends SuperRepository {

    T save(T entity);
    void deleteById(ID pk);
    boolean existById(ID pk);
    Optional<T>findById(ID pk);
    List<T> findAll();
    long count();

}