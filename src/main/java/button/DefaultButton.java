package button;

public class DefaultButton {
    private ButtonHendler buttonHendler;

    public DefaultButton(ButtonHendler buttonHendler) {
        this.buttonHendler = buttonHendler;
    }

    public void click(){
        buttonHendler.click();
    }

    public void esc(){
        buttonHendler.escape();
    }
}
