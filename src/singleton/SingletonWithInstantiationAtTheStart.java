package singleton;

/*
 * Singleton Design patter
 * =======================
 *
 * A Class that can only have a single object.
 *
 * If the object needs to be initialized at the start of the code, this is how we can achieve it.
 */
public class SingletonWithInstantiationAtTheStart {
    //instantiate first thing in the morning, and its private, and its final so cannot be changed
    private static final SingletonWithInstantiationAtTheStart SINGLETON = new SingletonWithInstantiationAtTheStart();

    /*
     * private constructor so that other guys cannot create an object.
     */
    private SingletonWithInstantiationAtTheStart() { }

    /**
     * Returns the one and only instance of this class
     */
    public static SingletonWithInstantiationAtTheStart getInstance() {
        return SINGLETON;
    }

    /* Other methods protected by singleton-ness */
    public void demoMethod() {
        System.out.println("demoMethod for singleton");
    }
}
