package br.com.bianeck.curso.springboot.webapp.models.dto;

import br.com.bianeck.curso.springboot.webapp.models.User;

public class UserDto {

    private String title;
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
