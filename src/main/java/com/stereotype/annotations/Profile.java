package com.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // we want to create an object of this type
public class Profile {
    @Value("Architect and Instructor")
    private String title;
    @Value("TCS")
    private String company;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Profile{" + "title='" + title + '\'' + ", company='" + company + '\'' + '}';
    }
}
