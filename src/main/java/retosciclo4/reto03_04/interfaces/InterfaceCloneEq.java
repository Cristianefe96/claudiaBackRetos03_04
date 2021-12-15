package retosciclo4.reto03_04.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import retosciclo4.reto03_04.model.Clone;

public interface InterfaceCloneEq extends MongoRepository<Clone, Integer>{
    
}
