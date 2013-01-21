
package kws.vaadin;

import com.vaadin.Application;
import com.vaadin.ui.Window;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component("applicationBean")
@Scope("prototype")
public class MainApplication extends Application {
	
	public WebApplicationContext appContext;

	@Override
	public void init() {
		Window window;
		window = new Window("My Vaadin Application");
		window.addComponent(new BodyWindow(this));
		setMainWindow(window);
	}
	
	public void setWebApplicationContext(WebApplicationContext appContext){
		this.appContext = appContext;
	}
	
}

