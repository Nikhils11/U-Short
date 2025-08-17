package com.url.UrlShortner.Repository;
import com.url.UrlShortner.Entity.LongShortUrls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepo extends JpaRepository<Long,LongShortUrls> {
}
