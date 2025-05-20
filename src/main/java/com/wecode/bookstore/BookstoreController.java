package com.wecode.bookstore;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/getBooks")
public class BookstoreController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getEbtryBooks(){
        List<BookDto> bdList = new ArrayList<>();
        BookDto bookDto = BookDto.builder().name("ignitedminds").author("apj").build();
        bdList.add(bookDto);
        return ResponseEntity.ok(bdList);
    }
}
