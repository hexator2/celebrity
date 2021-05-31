package com.bluff.celebrytalk.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class CelebrationRepository {
    private final EntityManager em;
}
