package designpatterns.factory;

import designpatterns.factory.components.Button;
import designpatterns.factory.components.Menu;

public interface UIFactory {
    //THis factory should contain only factory methods
    //Factory method -> that returns an object of corresponding class

    Button createButton();
    Menu createMenu();
}
