package com.question.UserTrackService.service;

import com.question.UserTrackService.domain.Track;
import com.question.UserTrackService.domain.User;
import com.question.UserTrackService.exception.TrackNotFoundException;
import com.question.UserTrackService.exception.UserAlreadyExistsException;
import com.question.UserTrackService.exception.UserNotFoundException;
import com.question.UserTrackService.rabbitMQ.CommonUser;

import java.util.List;

public interface UserService {
    public User addUser(User user) throws UserAlreadyExistsException;
    User addUser1(CommonUser commonUser);
    public User addTrackForUser(String userId, Track track) throws UserNotFoundException;
    public User deleteTrackFromUser(String userId,int trackId) throws UserNotFoundException, TrackNotFoundException;
    List<Track> getTrackForUser(String userId) throws UserNotFoundException;
    User updateTrackForUser(String userId,Track track) throws UserNotFoundException;
}
