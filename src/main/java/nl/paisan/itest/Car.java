package nl.paisan.itest;

import net.sf.oval.configuration.annotation.IsInvariant;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * Created by paisanrietbroek on 19/11/2017.
 */

public class Car {

    @NotNull
    @NotEmpty
    @Length(max = 40, min = 3)
    private String name;

    @Length(min = 3, max = 4)
    private int wheels;

    private String color;

    public Car(String name, int wheels, String color) {
        this.name = name;
        this.wheels = wheels;
        this.color = color;
    }

    @IsInvariant
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
