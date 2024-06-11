package designpatterns.factory;

import designpatterns.factory.Flutter;
import designpatterns.factory.UIFactory;
import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        button.showbutton();
        Menu menu = uiFactory.createMenu();
        menu.showMenu();

        UIFactory uiFactory1 = flutter.createFactory(SupportedPlatforms.IOS);
        Button button1 = uiFactory1.createButton();
        button1.showbutton();
        Menu menu1 = uiFactory.createMenu();
        menu1.showMenu();
    }
}
