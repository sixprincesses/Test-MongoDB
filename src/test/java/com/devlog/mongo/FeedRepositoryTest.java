package com.devlog.mongo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class FeedRepositoryTest {


    @Autowired
    private FeedRepository feedRepository;

    @Test
    void saveFeed() {
        /* Given */
        Feed feed = new Feed("content");

        /* When */
        Feed savedFeed = feedRepository.save(feed);

        /* Then */
        assertThat(savedFeed).isEqualTo(feed);
    }
}