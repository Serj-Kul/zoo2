package zoo;

public class Crocodile extends Animal {

    @Override
    public String feeds(Zoo z) {
        String s = "Ищем голодного крокодила";
        Animal a = z.showsAnimal();
        if (a != null && !a.equals(this)) {
            z.deletedAnimal(a);
            if (a instanceof Cow)
                s = "Крокодил ест корову!";
            else if (a instanceof Crocodile)
                s = "Крокодил ест другого крокодила";
        }
        return s;
    }

    @Override
    public String express(Zoo z) {
        return "Крокодил открыл пасть";
    }

    @Override
    public String moves(Zoo z) {
        return "Крокодил плавает";
    }

}