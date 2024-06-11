package designpatterns.factory;

public class Flutter {
    void UI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Set the theme");
    }

    UIFactory createFactory(SupportedPlatforms platform){
        //Too many if else conditions -violating OCP principle
        /*if(platform.equals(SupportedPlatforms.ANDROID)){
            return new AndroidUIFactory();
        } else if(platform.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        }*/

        //Practical pattern-moved more if else condition to another class rather than keeping in main class
        return UIFactoryFactory.getUIFactory(platform);
    }
}
