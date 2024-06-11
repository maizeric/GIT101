package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.IosButton;
import designpatterns.factory.components.IOSMenu;
import designpatterns.factory.components.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
