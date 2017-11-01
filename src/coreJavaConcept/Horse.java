package coreJavaConcept;
class H{
    public String identifyMyself() {
        return "I am a H.";
    }
}
interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
public class Horse extends H implements Mythical, Flyer {
	  public String identifyMyself() {
	        return "I am a horse.";
	    }
    public static void main(String... args) {
        Horse myApp = new Horse();
        System.out.println(myApp.identifyMyself());
    }
}
