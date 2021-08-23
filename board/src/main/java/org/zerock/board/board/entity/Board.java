package org.zerock.board.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer") // exclude로 지정된 변수는 toString에서 제외한다.
public class Board extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    private String content;

//    @ManyToOne
//    private Member writer; //연관 관계 지정

    @ManyToOne (fetch = FetchType.LAZY) // 불필요한 조인을 방지하기 위해 지연 로딩 사용
    private Member writer;

    public void changeTitle(String title){
        this.title = title;
    }

    public void changeContent(String content){
        this.content = content;
    }
}

