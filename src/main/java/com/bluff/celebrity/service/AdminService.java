package com.bluff.celebrity.service;

import com.bluff.celebrity.repository.*;
import com.bluff.celebrity.domain.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository admin;

    public void insert() {
        System.out.println("3");
        Admin a = new Admin("황세창");
        admin.save(a);
        System.out.println("4");
    }
}
