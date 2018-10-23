package cn.langchao.bean;

import java.io.Serializable;

public class User implements Serializable
{
    /**
     * ���к�
     */
    private static final long serialVersionUID = 6517835456397294710L;
    
    /** ���� */
    private String userName;
    
    /** ���� */
    private int age;
    
    /** �Ա� */
    private char sex;
    
    /** סַ */
    private String address;
    
    /** �绰���� */
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
