package e106.emissary_backend.domain.user.repository;

import e106.emissary_backend.domain.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u.nickname from User u where u.id = :userId")
    Optional<String> findNicknameByUserId(long userId);


    Optional<User> findByUserId(long userId);
}