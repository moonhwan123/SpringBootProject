package org.zerock.board.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.zerock.board.board.entity.Reply;


public interface ReplyRepository extends JpaRepository<Reply, Long> {

    @Modifying // JPQL을 이용해서 업뎃,딜리트 할때는 이 어노테이션을 같이 추가해야한다.
    @Query("delete from Reply r where r.board.bno =:bno ")
    void deleteByBno(Long bno);
}
