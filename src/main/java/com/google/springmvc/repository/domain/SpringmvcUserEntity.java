package com.google.springmvc.repository.domain;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Abbot
 * Date: 2017-11-30
 * Time: 17:25
 * Description:
 */
@Entity
@Table(name = "SPRINGMVC_USER", schema = "C##ZKY", catalog = "")
public class SpringmvcUserEntity
{

    private String uuid;
    private String name;
    private String password;
    private String phone;
    private String email;
    private String address;

    @Id
    @Column(name = "UUID", nullable = false, length = 128)
    public String getUuid()
    {
        return uuid;
    }

    public void setUuid(String uuid)
    {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Basic
    @Column(name = "PASSWORD", nullable = true, length = 255)
    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Basic
    @Column(name = "PHONE", nullable = true, length = 128)
    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 128)
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 512)
    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        SpringmvcUserEntity entity = (SpringmvcUserEntity) o;

        if (uuid != null ? !uuid.equals(entity.uuid) : entity.uuid != null)
            return false;
        if (name != null ? !name.equals(entity.name) : entity.name != null)
            return false;
        if (password != null ? !password.equals(entity.password) : entity.password != null)
            return false;
        if (phone != null ? !phone.equals(entity.phone) : entity.phone != null)
            return false;
        if (email != null ? !email.equals(entity.email) : entity.email != null)
            return false;
        if (address != null ? !address.equals(entity.address) : entity.address != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}
