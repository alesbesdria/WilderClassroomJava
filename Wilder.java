public class Wilder {

    private String firstname;
    private boolean aware;

    public Wilder(String name, boolean aware) {
        this.firstname = name;
        this.aware = aware;
    }

    // getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // static method
    public static String quack() {
        return "Quack!";
    }

    // instance method
    public String whoAmI() {
        if (aware) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}