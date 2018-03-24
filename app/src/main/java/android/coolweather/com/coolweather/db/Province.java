package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/3/23.
 */

public class Province extends DataSupport{
    private int id;  //每个实体类的固定字段
    private String provinceName;  //省的名字
    private int provinceCode;  //省的代号，用于向服务器查询数据时使用

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public  void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
