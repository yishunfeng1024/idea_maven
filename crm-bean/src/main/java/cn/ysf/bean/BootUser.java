package cn.ysf.bean;

/**
 * @author YiShunFeng
 * @version 1.0
 * @description cn.ysf.bean
 * @data 2020/4/19
 */
public class BootUser {
    private Integer id;
    private String name;
    private  String password;

    @Override
    public String toString() {
        return "BootUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
