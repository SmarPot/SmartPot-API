package smartpot.com.api.Models.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import smartpot.com.api.Models.Entity.Crop;

@Repository
public interface RCrop extends MongoRepository<Crop, String> {
}