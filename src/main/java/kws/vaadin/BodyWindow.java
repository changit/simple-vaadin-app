package kws.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class BodyWindow extends VerticalLayout{

	private MainApplication mainApp;

    private TextField msisdn = new TextField("Msisdn");
    private Button sendButton = new Button("Send");


	public BodyWindow(MainApplication mainApp) {
		this.mainApp = mainApp;

        init();
	}

    private void init() {
        addComponent(msisdn);
        addComponent(sendButton);
        sendButton.addListener(new Button.ClickListener() {
            public void buttonClick(Button.ClickEvent clickEvent) {
                sendRequest();
            }
        });

    }

    private void sendRequest(){
        System.out.println("You pressed me msisdn is [ " +msisdn.getValue() + "]");
    }

}
