package com.url.UrlShortner.Repository;
import com.url.UrlShortner.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Long,User> {
}
