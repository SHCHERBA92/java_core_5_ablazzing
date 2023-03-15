package button;

public class Button implements ButtonHendler{
    @Override
    public void click() {
        System.out.println("один клик");
    }

    @Override
    public void doubleClick() {
        System.out.println("два клик");
    }

    @Override
    public void escape() {
        System.out.println("отмена клик");
    }
}
