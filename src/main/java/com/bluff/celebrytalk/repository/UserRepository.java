package com.bluff.celebrytalk.repository;

import com.bluff.celebrytalk.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    // findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
    public List<User> findById(String id);

    public List<User> findByNick(String nick);

    //like검색도 가능
    public List<User> findByNickLike(String keyword);


}
