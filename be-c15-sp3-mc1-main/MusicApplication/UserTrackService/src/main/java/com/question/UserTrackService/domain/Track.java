package com.question.UserTrackService.domain;

import org.springframework.data.annotation.Id;

public class Track {
    @Id
    private int trackId;
    private String trackName;
    private String artistName;

    public Track(){}

    public Track(int trackId, String trackName, String artistName) {
        this.trackId = trackId;
        this.trackName = trackName;
        this.artistName = artistName;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "Track{" +
                "trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
