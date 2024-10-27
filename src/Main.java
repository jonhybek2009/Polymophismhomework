//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animal : animals) {
            if (animal instanceof Shark shark) {
                shark.attacking();
            } else if (animal instanceof Turtle turtle) {
                turtle.swiming();
            } else if (animal instanceof Eagle eagle) {
                eagle.flying();
            }
        }
        Shark[] sharks = new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                sharks[0] = (Shark) animal;
            } else if (animal instanceof Turtle) {
                turtles[0] = (Turtle) animal;
            } else if (animal instanceof Eagle) {
                eagles[0] = (Eagle) animal;
            }
        }
}
}

