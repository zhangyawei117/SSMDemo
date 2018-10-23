package cn.langchao.bean;

import java.io.Serializable;

public class User implements Serializable
{
    /**
     * 序列号
     */
    private static final long serialVersionUID = 6517835456397294710L;
    
    /** 姓名 */
    private String userName;
    
    /** 年龄 */
    private int age;
    
    /** 性别 */
    private char sex;
    
    /** 住址 */
    private String address;
    
    /** 电话号码 */
    private String phoneNumber;
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public char getSex()
    {
        return sex;
    }
    
    public void setSex(char sex)
    {
        this.sex = sex;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("User [userName=");
        builder.append(userName);
        builder.append(", age=");
        builder.append(age);
        builder.append(", sex=");
        builder.append(sex);
        builder.append(", address=");
        builder.append(address);
        builder.append(", phoneNumber=");
        builder.append(phoneNumber);
        builder.append("]");
        return builder.toString();
    }
}
