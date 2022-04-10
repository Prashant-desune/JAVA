class Phone{
    public void call(){System.out.println("Enter the name you want to call : ");}
    public void sms(){System.out.println("Enter the name you want to sms : ");} 
}

    interface  ICamera{
        void click();
        void record();
    }

    interface IMusicPlayer {
        void play();
        void stop();
    }

//Concret class
//Now see here class is extended but interface is implemented and interface is also a kind of an Abstract class. 
class SmartPhone extends Phone implements ICamera, IMusicPlayer{
        public void videoCall(){System.out.println("hii pick up the videoCall");}
        public void click(){System.out.println("look here clicking the photo of yours ");}
        public void record(){System.out.println("Say hii in the camera i am recording ");}
        public void play(){System.out.println("yes Now playing the music  ");}
        public void stop(){System.out.println("you can stop the music if you want ");}
}


public class Interface {
    public static void main(String[] args) {
        SmartPhone S = new SmartPhone();
        S.videoCall();
        IMusicPlayer sp = new SmartPhone();
        sp.play();
        sp.stop();
        ICamera C = new SmartPhone();
        C.click();
        C.record();
        Phone P = new SmartPhone();
        P.call();
        P.sms();
    }
}