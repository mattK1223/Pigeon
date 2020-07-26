package com.mrk.pigeon;

public class Chat {
    private int mID;
    private String mName;
    private String mLastMessage;
    private String mTime;

    public Chat(int ID, String name, String lastMessage, String time) {
        mID = ID;
        mName = name;
        mLastMessage = lastMessage;
        mTime = time;
    }

    public int getID() {
        return mID;
    }

    public String getName() {
        return mName;
    }

    public String getLastMessage() {
        return mLastMessage;
    }

    public String getTime() {
        return mTime;
    }

}
