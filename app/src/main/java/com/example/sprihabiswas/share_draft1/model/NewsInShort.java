package com.example.sprihabiswas.share_draft1.model;

/**
 * Created by Spriha Biswas on 10/31/2015.
 */
public class NewsInShort {

    public String news_card_heading;
    public String news_card_content;
    public  int news_card_photo;

    public NewsInShort(String nc_heading, String nc_content, int nc_photo) {
        this.news_card_heading = nc_heading;
        this.news_card_content = nc_content;
        this.news_card_photo = nc_photo;
    }

    public String getNews_card_heading() {
        return news_card_heading;
    }

    public String getNews_card_content() {
        return news_card_content;
    }

    public int getNews_card_photo() {
        return news_card_photo;
    }
}
