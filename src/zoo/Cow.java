package zoo;

public class Cow extends Animal {

    @Override
    public String feeds(Zoo z) {
        return "Корова пасётся";
    }

    @Override
    public String express(Zoo z) {
        return "Корова мычит";
    }

    @Override
    public String moves(Zoo z) {
        return "Корова легла спать";
    }

}