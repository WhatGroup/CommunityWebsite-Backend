package com.gb.po;

public class EventWithBLOBs extends Event {
    private String evenContent;

    private String eventPosition;

    private String recipient;

    private String recruitContent;

    public String getEvenContent() {
        return evenContent;
    }

    public void setEvenContent(String evenContent) {
        this.evenContent = evenContent == null ? null : evenContent.trim();
    }

    public String getEventPosition() {
        return eventPosition;
    }

    public void setEventPosition(String eventPosition) {
        this.eventPosition = eventPosition == null ? null : eventPosition.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient == null ? null : recipient.trim();
    }

    public String getRecruitContent() {
        return recruitContent;
    }

    public void setRecruitContent(String recruitContent) {
        this.recruitContent = recruitContent == null ? null : recruitContent.trim();
    }
}