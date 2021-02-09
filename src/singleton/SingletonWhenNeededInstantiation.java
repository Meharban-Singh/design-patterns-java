package singleton;

public class SingletonWhenNeededInstantiation {
    private static SingletonWhenNeededInstantiation singleton; //DO NOT instantiate first thing in the morning, also its private

    /*
     * private constructor so that other guys cannot create an object.
     */
    private SingletonWhenNeededInstantiation() {}

    /**
     * Returns the one and only instance of this class, creates one if there isn't one already
     */
    public static SingletonWhenNeededInstantiation getInstance() {
        // If not created already, create one.
        if(singleton == null)
            singleton = new SingletonWhenNeededInstantiation();

        return singleton;
    }

    /* Other methods protected by singleton-ness */
    public void demoMethod() {
        System.out.println("demoMethod for singleton");
    }
}
