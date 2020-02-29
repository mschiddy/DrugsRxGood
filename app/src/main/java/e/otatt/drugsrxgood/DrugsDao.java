package e.otatt.drugsrxgood;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface DrugsDao {
    @Query("SELECT * FROM drugs")
    List<Drugs> getAll();

    @Query("SELECT * FROM drugs WHERE p_id IN (:p_ids)")
    List<Drugs> loadAllByIds(int[] p_ids);

    @Query("SELECT * FROM drugs WHERE medication LIKE :medication AND " +
            "dosage LIKE :dosage AND " +
            "frequency LIKE :frequency AND " +
            "refill LIKE :refill AND " +
            "isActive LIKE :isActive LIMIT 1")
    Drugs findByDrug(String medication, String dosage, String frequency, String refill, boolean isActive);

    @Insert
    void insertAll(Users... users);

    @Delete
    void delete(Users users);
}
