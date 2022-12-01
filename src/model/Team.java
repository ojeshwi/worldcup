package model;

public class Team {
    String Name;
    String Jersey_colour;
    String position;

    public Team(String name, String jersey_colour, String position) {
        Name = name;
        Jersey_colour = jersey_colour;
        this.position = position;
    }

    public void printFormat() {
        System.out.println("Team Name     Jersey colour    Fifa position     ");
        System.out.println(this.Name + "         " + this.Jersey_colour + "          " + this.position);
    }

}
