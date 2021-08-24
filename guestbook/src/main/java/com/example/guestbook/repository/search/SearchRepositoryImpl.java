package com.example.guestbook.repository.search;

import com.example.guestbook.entity.Guestbook;
import com.example.guestbook.entity.QGuestbook;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.JPQLQuery;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

@Log4j2
public class SearchRepositoryImpl extends QuerydslRepositorySupport implements SearchRepository {
    public SearchRepositoryImpl(){
        super(Guestbook.class);
    }

    @Override
    public Guestbook search1(){
        log.info("asdasdasdsadsadasdasdsadsadasdsa");
        QGuestbook guestbook = QGuestbook.guestbook;


        JPQLQuery<Guestbook> jpqlQuery = from(guestbook);
        jpqlQuery.select(guestbook).where(guestbook.gno.eq(1L));


        log.info("*****************************");
        log.info(jpqlQuery);
        log.info("*****************************");

        List<Guestbook> result = jpqlQuery.fetch();


        log.info(result);

        return null;
    }
}
