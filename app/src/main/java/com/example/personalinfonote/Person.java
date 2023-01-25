package com.example.personalinfonote;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Person {
    @PrimaryKey
    private int Sno;

    @ColumnInfo(name = "PersonName")
    private String name;

    @ColumnInfo(name = "personMobileNo")
    private String MobileNo;

    @ColumnInfo(name = "PersonAge")
    private int age;

    public Person() {
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        Sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
