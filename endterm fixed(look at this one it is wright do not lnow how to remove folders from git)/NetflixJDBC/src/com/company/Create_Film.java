package com.company;

public class Create_Film {
    private String name_film;
    private String director_name;
    private String main_actor_name;
    private int Time;
    public Create_Film(String name_film,String director,String main_actor_name,int Time){
        setName_film(name_film);
        setDirector_name(director_name);
        setMain_actor_name(main_actor_name);
        setTime(Time);
    }

    public void setName_film(String name_film) {
        this.name_film = name_film;
    }

    public String getName_film() {
        return name_film;
    }

    public void setDirector_name(String director_name) {
        this.director_name = director_name;
    }

    public String getDirector_name() {
        return director_name;
    }

    public void setMain_actor_name(String main_actor_name) {
        this.main_actor_name = main_actor_name;
    }

    public String getMain_actor_name() {
        return main_actor_name;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getTime() {
        return Time;
    }

    @Override
    public String
    toString() {
        return "Create_Film{" +
                "name_film='" + name_film + '\'' +
                ", director_name='" + director_name + '\'' +
                ", main_actor_name='" + main_actor_name + '\'' +
                ", Time=" + Time +
                '}';
    }

}
