package com.springboot.studyjunil.web.controller.api.board;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjunil.web.dto.board.CreateBoardReqDto;

@RestController
@RequestMapping("/api/v1/board")
public class BoardController {

	//게시글 작성
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(CreateBoardReqDto createBoardReqDto){
		System.out.println("게시글 작성 요청");
		System.out.println("title: " + createBoardReqDto.getTitle());
		System.out.println("usercode: " + createBoardReqDto.getUsercode());
		System.out.println("content: " + createBoardReqDto.getContent());
		
		return ResponseEntity.ok().body("test");
		//return new ResponseEntity<>(title + " 게시글 작성 성공", headers, HttpStatus.BAD_REQUEST);
	}
	
	//게시글 조회
	
	//게시글 수정
	
	//게시글 삭제
}




