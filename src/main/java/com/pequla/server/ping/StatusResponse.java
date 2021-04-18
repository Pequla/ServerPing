package com.pequla.server.ping;

public class StatusResponse {

    private Description description;
    private Players players;
    private Version version;
    private String favicon;
    private int time;

    public Description getDescription() {
        return description;
    }

    public Players getPlayers() {
        return players;
    }

    public Version getVersion() {
        return version;
    }

    public String getFavicon() {
        return favicon;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
