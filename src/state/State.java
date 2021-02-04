package state;

public interface State {
    void turnOff();
    void print(String whatToPrint);
    void cancelPrint();
    void turnOn();
}
