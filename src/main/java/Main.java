import button.Button;
import button.ButtonAccept;
import button.DefaultButton;

public class Main {
    public static void main(String[] args) {
        DefaultButton defaultButton = new DefaultButton(new ButtonAccept());
        DefaultButton defaultButton2 = new DefaultButton(new Button());
        defaultButton.click();
        defaultButton.esc();

        defaultButton2.click();
        defaultButton2.esc();
    }
}
