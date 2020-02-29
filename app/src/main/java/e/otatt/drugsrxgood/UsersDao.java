package e.otatt.drugsrxgood;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UsersDao {
    @Query("SELECT * FROM users")
    List<Users> getAll();

    @Query("SELECT * FROM users WHERE p_id IN (:p_ids)")
    List<Users> loadAllByIds(int[] p_ids);

    @Query("SELECT * FROM users WHERE nickname LIKE :nickname AND " +
            "phone_number LIKE :phone_number LIMIT 1")
    Users findByName(String nickname, String phone_number);

    @Insert
    void insertAll(Users... users);
}
