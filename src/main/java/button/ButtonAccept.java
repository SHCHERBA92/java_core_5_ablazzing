package button;

import java.util.logging.Logger;

public class ButtonAccept implements ButtonHendler{

    @Override
    public void click() {
        System.out.println("Выделили действие");
    }

    @Override
    public void doubleClick() {
        System.out.println("Приняли действие");
    }

    @Override
    public void escape() {
        System.out.println("Отменили действие");
    }
}
