package serialization;

import java.io.*;
import java.util.ArrayList;

public class MainClass {

    private static final String USERINFO_SER = "user.ser";

    public static void main(String[] args) {
        conductSerializing();
        conductDeserializing();
    }


    public static void conductSerializing(){
        try{
            FileOutputStream fos = new FileOutputStream(USERINFO_SER);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream out = new ObjectOutputStream(bos);

            User u1= new User("kim","1234",30);
            User u2= new User("lee","1234",29);

            ArrayList<User> list = new ArrayList<>();

            list.add(u1);
            list.add(u2);
            
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화 완료");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void conductDeserializing(){

        try{
            FileInputStream fis = new FileInputStream(USERINFO_SER);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);

            User u1 = (User) in.readObject();
            User u2 = (User) in.readObject();
            ArrayList<User> list = (ArrayList<User>) in.readObject();

            System.out.println(u1.toString());
            System.out.println(u2.toString());
            System.out.println("count :: " + list.size());
            System.out.println(list.toString());

            in.close();

        }catch (Exception e ){
            e.printStackTrace();
        }




    }

}
