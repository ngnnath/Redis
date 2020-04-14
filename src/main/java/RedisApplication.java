import redis.clients.jedis.Jedis;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class RedisApplication {

    public static void main(String[] args) {
//        //client
//        Jedis jedis = new Jedis();
//        //set a key value
//        jedis.set("events/city/rome", "32,15,223,828");
//        String cachedResponse = jedis.get("events/city/rome");

        try {
            ClassLoader loader = RedisApplication.class.getClassLoader();
            //URL url = loader.getResource("menu.xml");
            File file = new File(loader.getResource("test.xml").getFile());
//            try {
//                file = new File(url.toURI());
//            } catch (URISyntaxException e) {
//                file = new File(url.getPath());
//            }

            JAXBContext jaxbContext = JAXBContext.newInstance(Menu.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Menu menu= (Menu) jaxbUnmarshaller.unmarshal(file);

            System.out.print("test");

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }


}
