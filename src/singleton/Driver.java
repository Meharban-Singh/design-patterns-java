package singleton;

/*
 * Singleton Design patter
 * =======================
 *
 * Restricts the class instantiation to one object.
 *
 * 2 implementations are provided
 */
public class Driver {
    public static void main(String[] args) {
        // SingletonWithInstantiationAtTheStart - already instantiated
        SingletonWithInstantiationAtTheStart a = SingletonWithInstantiationAtTheStart.getInstance();
        a.demoMethod();

        // Singleton with instantiation when needed
        SingletonWhenNeededInstantiation b = SingletonWhenNeededInstantiation.getInstance();
        b.demoMethod();
    }
}
