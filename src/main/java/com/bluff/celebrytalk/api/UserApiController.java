package com.bluff.celebrytalk.api;

import com.bluff.celebrytalk.domain.user.User;
import com.bluff.celebrytalk.repository.UserRepository;
import com.bluff.celebrytalk.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
public class UserApiController {
    private final UserService userService;

    @Autowired
    UserRepository userRepository;

    // 회원번호로 한명의 회원 조회
    @GetMapping(value = "api/user/{userId}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public ResponseEntity<User> getMember(@PathVariable("userId") Long userId) {

        log.info("user api controller !");

        Optional<User> member = userService.findById(userId);

        return new ResponseEntity<User>(member.get(), HttpStatus.OK);
    }
}
