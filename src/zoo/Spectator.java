package zoo;

public class Spectator implements Being {

    public String action(Zoo z) {
        String s;
        Animal a = z.showsAnimal();
        if (a instanceof Cow)
            s = "Наблюдаем за коровой";
        else if (a instanceof Crocodile)
            s = "Наблюдаем за опасным крокодилом";
        else
            s = "Нет животных для наблюдения";
        return s;
    }
}