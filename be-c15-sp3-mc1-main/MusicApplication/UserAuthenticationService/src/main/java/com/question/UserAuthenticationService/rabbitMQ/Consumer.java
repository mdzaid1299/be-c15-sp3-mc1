package com.question.UserAuthenticationService.rabbitMQ;

import com.question.UserAuthenticationService.domain.User;
import com.question.UserAuthenticationService.exception.UserAlreadyExistsException;
import com.question.UserAuthenticationService.service.UserService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @Autowired
    private UserService userService;
    @RabbitListener(queues = "user_queue")
    public void getDTOToQueueAndAddToDb(UserDTO userDTO) throws UserAlreadyExistsException {
        User user = new User();
        user.setUserId(userDTO.getUserId());
        user.setPassword(userDTO.getPassword());

        User user1 = userService.addUser(user);
        System.out.println("result = "+user1);
    }
}
