package com.medic.diagnosticdiabet;

import androidx.annotation.NonNull;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DatabaseDiabetDao {
    @Query("SELECT * FROM DiabetInfo WHERE SurnamePatient_base= :SurnamePatient")
    @NonNull
    DatabaseDiabet getBySurnamePatient(String SurnamePatient);

    @Query("SELECT * FROM DiabetInfo")
    List<DatabaseDiabet> getAll();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 3.3 < venakrovdoeat_base < 5.5 AND diabetdetecttype_base = 0")
    double[] venakrovdoeat_base_get_min_33_norm__norm();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 3.3 < venakrovdoeat_base < 5.5 AND diabetdetecttype_base = 2")
    double[] venakrovdoeat_base_get_min_33_norm__diabet();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 3.3 < venakrovdoeat_base < 5.5 AND diabetdetecttype_base = 1")
    double[] venakrovdoeat_base_get_min_33_norm__glukoza();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 6.1 < venakrovdoeat_base AND diabetdetecttype_base = 0")
    double[] venakrovdoeat_base_get_min_61_diabet__norm();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 6.1 < venakrovdoeat_base AND diabetdetecttype_base = 2")
    double[] venakrovdoeat_base_get_min_61_diabet__diabet();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE 6.1 < venakrovdoeat_base AND diabetdetecttype_base = 1")
    double[] venakrovdoeat_base_get_min_61_diabet__glukoza();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE venakrovdoeat_base < 6.1 AND diabetdetecttype_base = 0")
    double[] venakrovdoeat_base_get_max_61__norm();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE venakrovdoeat_base < 6.1 AND diabetdetecttype_base = 2")
    double[] venakrovdoeat_base_get_max_61__diabet();

    @Query("SELECT venakrovdoeat_base FROM DiabetInfo WHERE venakrovdoeat_base < 6.1 AND diabetdetecttype_base = 1")
    double[] venakrovdoeat_base_get_max_61__glukoza();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE venakrovposleeat_base < 6.7 AND diabetdetecttype_base = 0")
    double[] venakrovposleeat_base_get_max_67_norm__norm();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE venakrovposleeat_base < 6.7 AND diabetdetecttype_base = 2")
    double[] venakrovposleeat_base_get_max_67_norm__diabet();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE venakrovposleeat_base < 6.7 AND diabetdetecttype_base = 1")
    double[] venakrovposleeat_base_get_max_67_norm__glukoza();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 10.0 < venakrovposleeat_base AND diabetdetecttype_base = 0")
    double[] venakrovposleeat_base_get_min_100_diabet__norm();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 10.0 < venakrovposleeat_base AND diabetdetecttype_base = 2")
    double[] venakrovposleeat_base_get_min_100_diabet__diabet();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 10.0 < venakrovposleeat_base AND diabetdetecttype_base = 1")
    double[] venakrovposleeat_base_get_min_100_diabet__glukoza();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 6.7 < venakrovposleeat_base < 10.0 AND diabetdetecttype_base = 0")
    double[] venakrovposleeat_base_get_min_67__norm();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 6.7 < venakrovposleeat_base < 10.0 AND diabetdetecttype_base = 2")
    double[] venakrovposleeat_base_get_min_67__diabet();

    @Query("SELECT venakrovposleeat_base FROM DiabetInfo WHERE 6.7 < venakrovposleeat_base < 10.0 AND diabetdetecttype_base = 1")
    double[] venakrovposleeat_base_get_min_67__glukoza();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 3.3 < kapilarplazmadoleeat_base < 5.5 AND diabetdetecttype_base = 0")
    double[] kapilarplazmadoleeat_base_get_min_33_norm__norm();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 3.3 < kapilarplazmadoleeat_base < 5.5 AND diabetdetecttype_base = 2")
    double[] kapilarplazmadoleeat_base_get_min_33_norm__diabet();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 3.3 < kapilarplazmadoleeat_base < 5.5 AND diabetdetecttype_base = 1")
    double[] kapilarplazmadoleeat_base_get_min_33_norm__glukoza();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 6.1 < kapilarplazmadoleeat_base AND diabetdetecttype_base = 0")
    double[] kapilarplazmadoleeat_base_get_min_61_diabet__norm();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 6.1 < kapilarplazmadoleeat_base AND diabetdetecttype_base = 2")
    double[] kapilarplazmadoleeat_base_get_min_61_diabet__diabet();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE 6.1 < kapilarplazmadoleeat_base AND diabetdetecttype_base = 1")
    double[] kapilarplazmadoleeat_base_get_min_61_diabet__glukoza();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE kapilarplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 0")
    double[] kapilarplazmadoleeat_base_get_max_61__norm();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE kapilarplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 2")
    double[] kapilarplazmadoleeat_base_get_max_61__diabet();

    @Query("SELECT kapilarplazmadoleeat_base FROM DiabetInfo WHERE kapilarplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 1")
    double[] kapilarplazmadoleeat_base_get_max_61__glukoza();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < kapilarplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 0")
    double[] kapilarplazmaposleeat_base_get_min_78__norm();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < kapilarplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 2")
    double[] kapilarplazmaposleeat_base_get_min_78__diabet();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < kapilarplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 1")
    double[] kapilarplazmaposleeat_base_get_min_78__glukoza();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < kapilarplazmaposleeat_base AND diabetdetecttype_base = 0")
    double[] kapilarplazmaposleeat_base_get_min_111_diabet__norm();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < kapilarplazmaposleeat_base AND diabetdetecttype_base = 2")
    double[] kapilarplazmaposleeat_base_get_min_111_diabet__diabet();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < kapilarplazmaposleeat_base AND diabetdetecttype_base = 1")
    double[] kapilarplazmaposleeat_base_get_min_111_diabet__glukoza();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE kapilarplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 0")
    double[] kapilarplazmaposleeat_base_get_max_78_norm__norm();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE kapilarplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 2")
    double[] kapilarplazmaposleeat_base_get_max_78_norm__diabet();

    @Query("SELECT kapilarplazmaposleeat_base FROM DiabetInfo WHERE kapilarplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 1")
    double[] kapilarplazmaposleeat_base_get_max_78_norm__glukoza();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 4.0 < venaplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 0")
    double[] venaplazmadoleeat_base_get_min_40_norm__norm();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 4.0 < venaplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 2")
    double[] venaplazmadoleeat_base_get_min_40_norm__diabet();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 4.0 < venaplazmadoleeat_base < 6.1 AND diabetdetecttype_base = 1")
    double[] venaplazmadoleeat_base_get_min_40_norm__glukoza();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 7.0 < venaplazmadoleeat_base AND diabetdetecttype_base = 0")
    double[] venaplazmadoleeat_base_get_min_70_diabet__norm();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 7.0 < venaplazmadoleeat_base AND diabetdetecttype_base = 2")
    double[] venaplazmadoleeat_base_get_min_70_diabet__diabet();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 7.0 < venaplazmadoleeat_base AND diabetdetecttype_base = 1")
    double[] venaplazmadoleeat_base_get_min_70_diabet__glukoza();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 6.1 <= venaplazmadoleeat_base < 7.0 AND diabetdetecttype_base = 0")
    double[] venaplazmadoleeat_base_get_max_70__norm();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 6.1 <= venaplazmadoleeat_base < 7.0 AND diabetdetecttype_base = 2")
    double[] venaplazmadoleeat_base_get_max_70__diabet();

    @Query("SELECT venaplazmadoleeat_base FROM DiabetInfo WHERE 6.1 <= venaplazmadoleeat_base < 7.0 AND diabetdetecttype_base = 1")
    double[] venaplazmadoleeat_base_get_max_70__glukoza();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < venaplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 0")
    double[] venaplazmaposleeat_base_get_min_78__norm();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < venaplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 2")
    double[] venaplazmaposleeat_base_get_min_78__diabet();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 7.8 < venaplazmaposleeat_base < 11.1 AND diabetdetecttype_base = 1")
    double[] venaplazmaposleeat_base_get_min_78__glukoza();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < venaplazmaposleeat_base AND diabetdetecttype_base = 0")
    double[] venaplazmaposleeat_base_get_min_111_diabet__norm();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < venaplazmaposleeat_base AND diabetdetecttype_base = 2")
    double[] venaplazmaposleeat_base_get_min_111_diabet__diabet();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE 11.1 < venaplazmaposleeat_base AND diabetdetecttype_base = 1")
    double[] venaplazmaposleeat_base_get_min_111_diabet__glukoza();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE venaplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 0")
    double[] venaplazmaposleeat_base_get_max_78_norm__norm();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE venaplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 2")
    double[] venaplazmaposleeat_base_get_max_78_norm__diabet();

    @Query("SELECT venaplazmaposleeat_base FROM DiabetInfo WHERE venaplazmaposleeat_base < 7.8 AND diabetdetecttype_base = 1")
    double[] venaplazmaposleeat_base_get_max_78_norm__glukoza();

    @Query("SELECT diabetdetecttype_base FROM DiabetInfo WHERE diabetdetecttype_base = 0")
    int[] diabet_not_found_norm();

    @Query("SELECT diabetdetecttype_base FROM DiabetInfo WHERE diabetdetecttype_base = 1")
    int[] glukoza_found();

    @Query("SELECT diabetdetecttype_base FROM DiabetInfo WHERE diabetdetecttype_base = 2")
    int[] diabet_found_diabet();

    @Insert
    void insert(DatabaseDiabet employee);

    @Update
    void update(DatabaseDiabet employee);

    @Delete
    void delete(DatabaseDiabet employee);
}
