package pkg20171003;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author merarli
 */
public class Ex24 {

    public static void main(String[] args) {
        Tweet2 tweet = new Tweet();
        List<Tweet2> tlist = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(new File("/Users/merarli/OneDrive/document/NetBeansProjects/ap2/data/tweet2.csv")));

            String line;

            while ((line = br.readLine()) != null) {
                String[] word = line.split(",");
                tweet.setNo(Integer.parseInt(word[0]));
                tweet.setTID(word[1]);
                tweet.setName(word[2]);
                tweet.setTweetTime(word[3]);
                tweet.setText(word[4]);

                tlist.add(tweet);

            }
            for (Tweet tweet1 : tlist) {
                tweet.printTweet();
            }
            
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
