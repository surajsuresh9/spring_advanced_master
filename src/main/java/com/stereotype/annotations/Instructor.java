package com.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("instructorObject")
@Scope("singleton")
public class Instructor {

    //    @Value("#{T(java.lang.Math).abs(-99)}")
    @Value("#{T(java.lang.Integer).MIN_VALUE}")
    private int id = 15;

    //    @Value("John Doe")
//    @Value("#{'my custom string'.toUpperCase()}")
    @Value("#{new java.lang.String('Hello World').toUpperCase()}")
    private String name = "Steve Harvey";

    @Value("#{topics}")
    private List<String> topics;

    @Value("#{5+4>8?false:true}")
    private boolean isActive;

    @Autowired
    private Profile profile;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" + "id=" + id + ", name='" + name + '\'' + ", topics=" + topics + ", isActive=" + isActive + ", profile=" + profile + '}';
    }
}
