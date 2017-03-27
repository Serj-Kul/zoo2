package zoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Zoo {
    static final Random r = new Random();
    private List<Animal> animals = new ArrayList<Animal>();
    private Spectator spectator = new Spectator();

    public Animal showsAnimal() {
        Animal a = null;

        if (animals.size() > 0)
            a = animals.get(r.nextInt(animals.size()));
        return a;
    }

    public void addsAnimal(String s) {
        if (s.equals("cow")) {
            addsAnimal(new Cow());
        } else if (s.equals("crocodile")) {
            addsAnimal(new Crocodile());
        }
    }

    private void addsAnimal(Animal a) {
        animals.add(a);
    }

    public void deletedAnimal(String s) {
        boolean leaves = false;
        Iterator<Animal> it = animals.iterator();

        if (s.equals("cow")) {
            while (!leaves && it.hasNext()) {
                if (it.next() instanceof Cow) {
                    it.remove();
                    leaves = true;
                }
            }
        } else if (s.equals("crocodile")) {
            while (!leaves && it.hasNext()) {
                if (it.next() instanceof Crocodile) {
                    it.remove();
                    leaves = true;
                }
            }
        }
    }

    public void deletedAnimal(Animal a) {
        animals.remove(a);
    }

    public void removeAll(String s) {
        Iterator<Animal> it = animals.iterator();

        if (s.equals("cow")) {
            while (it.hasNext()) {
                if (it.next() instanceof Cow)
                    it.remove();
            }
        } else if (s.equals("crocodile")) {
            while (it.hasNext()) {
                if (it.next() instanceof Crocodile)
                    it.remove();
            }
        }
    }

    public String lookAt() {
        String s;
        int num = r.nextInt(2);
        if (num==0)
            s = spectator.action(this);
        else {
            Animal a = showsAnimal();
            if (a==null)
                s = "Какой скучный зоопарк! Нет животных";
            else
                s = a.action(this);
        }
        return s;
    }

    @Override
    public String toString() {
        String s="";

        for (Animal a : animals) {
            if (a instanceof Cow)
                s+="V ";
            else if (a instanceof Crocodile)
                s+="C ";
            else
                s+="? ";
        }
        return s;
    }
}