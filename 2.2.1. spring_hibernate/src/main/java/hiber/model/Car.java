package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="model")
    String model;

    @Column(name="series")
    int series;

    public Car(){}

    public Car(String model, int series){
        this.series=series;
        this.model=model;
    }

    @Override
    public String toString() {
        return "Car:\n" +
                "model = " + model +
                "\n" +
                "series = " + series;
    }
}
