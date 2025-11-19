/**
 * The Cow class represents a cow with name, age, and weight attributes.
 * It provides constructors, getters, and overridden toString and equals methods.
 *
 * @author Shaoyang Chen
 * @version 114.514
 * @since 1919.08.10
 */
public class Cow {
    private String name;
    private int age;
    private double weight;

    /**
     * Constructs a new Cow with the specified name, age, and weight.
     *
     * @param name the name of the cow
     * @param age the age of the cow
     * @param weight the weight of the cow
     */
    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * Returns the name of the cow.
     *
     * @return the name of the cow
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the age of the cow.
     *
     * @return the age of the cow
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns the weight of the cow.
     *
     * @return the weight of the cow
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Returns a string representation of the cow in the format "name, age - weight".
     *
     * @return a string representation of the cow
     */
    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }

    /**
     * Compares this cow to the specified object for equality.
     * The result is true if and only if the argument is not null, is a Cow object,
     * and has the same name, age, and weight as this cow.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        // Check if the object is the same reference
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to Cow and compare all attributes
        Cow cow = (Cow) obj;

        // Compare age (primitive int)
        if (age != cow.age) {
            return false;
        }

        // Compare weight (primitive double) with tolerance for floating point precision
        if (Math.abs(weight - cow.weight) > 0.0001) {
            return false;
        }

        // Compare name (String)
        return name != null ? name.equals(cow.name) : cow.name == null;
    }

    /**
     * Returns a hash code value for the cow based on name, age, and weight.
     *
     * @return a hash code value for this cow
     */
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        long temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}