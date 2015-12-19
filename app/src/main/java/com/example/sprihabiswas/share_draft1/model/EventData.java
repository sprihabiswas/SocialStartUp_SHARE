package com.example.sprihabiswas.share_draft1.model;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class EventData {
    String EventName;
    String EventAd;
    String EventBy;
    String EventMonth;
    String EventDate;
    int EventPhotoId;

    public EventData(String eventName, String eventAd, String eventBy , String eventDate, String eventMonth,int eventPhotoId) {
        this.EventName = eventName;
        this.EventAd = eventAd;
        this.EventBy = eventBy;
        this.EventDate = eventDate;
        this.EventMonth = eventMonth;
        this.EventPhotoId = eventPhotoId;
    }

    public String getEventName() {
        return EventName;
    }

    public String getEventAd() {
        return EventAd;
    }
    public String getEventBy() {
        return EventBy;
    }

    public String getEventDate() {
        return EventDate;
    }
    public String getEventMonth() {
        return EventMonth;
    }

    public int getEventPhotoId() {
        return EventPhotoId;
    }
}
