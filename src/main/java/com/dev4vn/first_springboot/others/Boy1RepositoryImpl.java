package com.dev4vn.first_springboot.others;

import com.dev4vn.first_springboot.Boy1;
import com.dev4vn.first_springboot.Boy1Repository;
import org.springframework.stereotype.Repository;

@Repository
public class Boy1RepositoryImpl implements Boy1Repository {
    public Boy1 getBoy1ByName(String name){
        return new Boy1(name);
    }
}
