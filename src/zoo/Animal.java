package zoo;

public abstract class Animal implements Being {
    public abstract String moves(Zoo z);
    public abstract String feeds(Zoo z);
    public abstract String express(Zoo z);
    public String action(Zoo z) {
        int num = Zoo.r.nextInt(3);
        String s;
        switch (num) {
            case 0:
                s = moves(z);
                break;
            case 1:
                s = feeds(z);
                break;
            default:
                s = express(z);
        }
        return s;
    }
}
