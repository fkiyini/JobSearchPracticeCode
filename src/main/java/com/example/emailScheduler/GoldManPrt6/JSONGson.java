package com.example.emailScheduler.GoldManPrt6;

import com.google.gson.Gson;

import java.util.Arrays;

public class JSONGson {
    public static void main(String[] args) {
    Gson g = new Gson();
    String jsonString = "{\"name\" : \"Ronaldo\",\"sport\" : \"soccer\" ,\"age\" : 25,\"id\" : 121,\"lastScores\": [ 2, 1, 3, 5, 0, 0, 1, 1 ] }";
    Player p = g.fromJson(jsonString, Player.class);
    System.out.println(p);
    String string  = g.toJson(p);
    System.out.println(string);
}
    public class Player {
        public String  name;
        public String sport;
        public int age;
        public int id;
        public int [] latestScores;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSport() {
            return sport;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int[] getLatestScores() {
            return latestScores;
        }

        public void setLatestScores(int[] latestScores) {
            this.latestScores = latestScores;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", sport='" + sport + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    ", latestScores=" + Arrays.toString(latestScores) +
                    '}';
        }
    }
}
