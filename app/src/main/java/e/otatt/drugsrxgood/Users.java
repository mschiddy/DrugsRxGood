package e.otatt.drugsrxgood;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Users {

    @PrimaryKey
    int p_id;

    @ColumnInfo(name="nickname")
    String nickname;

    @ColumnInfo(name="phone_number")
    String phone_number;

    public Users(){
        this.p_id = p_id;
        this.nickname = nickname;
        this.phone_number = phone_number;
    }

    public int getP_id() {
        return p_id;
    }


    public void setP_id() {
        this.p_id = p_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
