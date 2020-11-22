package com.example.emailScheduler.GoldManPrt6;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/*
 * Java program to convert JSON String into Java object using Jackson library.
 * Jackson is very easy to use and require just two lines of code to create a Java object
 * from JSON String format.
 *
 * @author http://javarevisited.blogspot.com
 */
public class JsonToJavaConverter {

    private static Logger logger = Logger.getLogger(JsonToJavaConverter.class);


    public static void main(String args[]) throws JsonParseException
            , JsonMappingException, IOException {

        JsonToJavaConverter converter = new JsonToJavaConverter();

//        String json = "{\n" +
//                "    \"name\": \"Garima\",\n" +
//                "    \"surname\": \"Joshi\",\n" +
//                "    \"phone\": 9832734651}";
//                String json = "{\n" +
//                "    \"name\": \"Garima\",\n" +
//                "    \"age\": \"38\",\n" +
//                "    \"name\": laplap" +
//                "    \"age\": 45}";
        String json1 = "{\"name\":\"mkyong\", \"age\":38}";
        String json2  = "[{\"name\":\"mkyong\", \"age\":38}]";
        String json= "{\"name\":\"mkyong\", \"age\":38}, {\"name\":\"laplap\", \"age\":5}";
        //converting JSON String to Java object
        System.out.println(converter.fromJson(json));
    }


    public Object fromJson(String json) throws JsonParseException
            , JsonMappingException, IOException {
        User gama = new ObjectMapper().readValue(json, User.class);
        logger.info("Java Object created from JSON String ");
        logger.info("JSON String : " + json);
        logger.info("Java Object : " + gama);

        return gama;
    }


    //    public static class User{
//        private String name;
//        private String surname;
//        private long phone;
//
//        public String getName() {return name;}
//        public void setName(String name) {this.name = name;}
//
//        public String getSurname() {return surname;}
//        public void setSurname(String surname) {this.surname = surname;}
//
//        public long getPhone() {return phone;}
//        public void setPhone(long phone) {this.phone = phone;}
//
//        @Override
//        public String toString() {
//            return "User [name=" + name + ", surname=" + surname + ", phone="
//                    + phone + "]";
//        }
//
//
//    }
    public static class User {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name:'" + name + '\'' +
                    ", age:" + age +
                    '}';
        }
    }
}
//Output:
//        2013-01-07 01:15:05,287 0    [main] INFO  JsonToJavaConverter  - Java Object created from JSON String
//        2013-01-07 01:15:05,287 0    [main] INFO  JsonToJavaConverter  - JSON String : {
//        "name": "Garima",
//        "surname": "Joshi",
//        "phone": 9832734651}
//        2013-01-07 01:15:05,287 0    [main] INFO  JsonToJavaConverter  - Java Object : User [name=Garima, surname=Joshi, phone=9832734651]
//
//
