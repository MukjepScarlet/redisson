package org.redisson;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

@Deprecated
public abstract class BaseTest {
    
    protected static RedissonClient redisson;

}
