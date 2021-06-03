package com.bluff.celebrytalk.service;

import com.bluff.celebrytalk.domain.user.User;
import com.bluff.celebrytalk.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(e -> users.add(e));
        return users;
    }

    public Optional<User> findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user;
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    public void updateById(Long id, User user) {
        Optional<User> e = userRepository.findById(id);
        if (e.isPresent()) {
            e.get().setId(user.getId());
            e.get().setNick(user.getNick());
            userRepository.save(user);
        }
    }

}
