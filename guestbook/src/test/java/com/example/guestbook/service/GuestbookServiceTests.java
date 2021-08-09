package com.example.guestbook.service;


import com.example.guestbook.dto.GuestbookDTO;
import com.example.guestbook.dto.PageRequestDTO;
import com.example.guestbook.dto.PageResultDTO;
import com.example.guestbook.entity.Guestbook;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class GuestbookServiceTests {

    @Autowired
    private GuestbookService service;

    @Test
    public void testRegister() {

        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("testRegister")
                .content("...testRegister...")
                .writer("userTest")
                .build();

        System.out.println("------------------testRegister------------------");
        System.out.println(service.register(guestbookDTO));

    }

    @Test
    public void testList(){

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();

        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);

//        for (GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
        System.out.println(resultDTO);
    }


//    @Test
//    public void testList(){
//
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(1).size(10).build();
//
//        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
//
//        System.out.println("PREV: "+resultDTO.isPrev());
//        System.out.println("NEXT: "+resultDTO.isNext());
//        System.out.println("TOTAL: " + resultDTO.getTotalPage());
//
//        System.out.println("-------------------------------------");
//        for (GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
//
//        System.out.println("========================================");
//        resultDTO.getPageList().forEach(i -> System.out.println(i));
//    }


//    @Test
//    public void testSearch(){
//
//        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
//                .page(1)
//                .size(10)
//                .type("tc")   //검색 조건 t, c, w, tc, tcw ..
//                .keyword("한글")  // 검색 키워드
//                .build();
//
//        PageResultDTO<GuestbookDTO, Guestbook> resultDTO = service.getList(pageRequestDTO);
//
//        System.out.println("PREV: "+resultDTO.isPrev());
//        System.out.println("NEXT: "+resultDTO.isNext());
//        System.out.println("TOTAL: " + resultDTO.getTotalPage());
//
//        System.out.println("-------------------------------------");
//        for (GuestbookDTO guestbookDTO : resultDTO.getDtoList()) {
//            System.out.println(guestbookDTO);
//        }
//
//        System.out.println("========================================");
//        resultDTO.getPageList().forEach(i -> System.out.println(i));
//    }




}