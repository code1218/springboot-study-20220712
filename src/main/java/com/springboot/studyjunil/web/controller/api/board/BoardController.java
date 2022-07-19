package com.springboot.studyjunil.web.controller.api.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studyjunil.service.board.BoardService;
import com.springboot.studyjunil.web.dto.CMRespDto;
import com.springboot.studyjunil.web.dto.board.CreateBoardReqDto;
import com.springboot.studyjunil.web.dto.board.CreateBoardRespDto;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;

	//게시글 작성
	@PostMapping("/content")
	public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto){
		CreateBoardRespDto createBoardRespDto = null;
		
		try {
			createBoardRespDto = boardService.createBoard(createBoardReqDto);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().body(new CMRespDto<>(1, "게시글 등록 실패", createBoardRespDto));
		}
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공", createBoardRespDto));
		
//		return new ResponseEntity<>(title + " 게시글 작성 성공", headers, HttpStatus.BAD_REQUEST);
	}
	
	//게시글 조회
	@GetMapping("/content/{boardcode}")
	public ResponseEntity<?> getBoard(@PathVariable int boardcode){
		
		return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 조회 성공", null));
	}
	
	//게시글 수정
	
	//게시글 삭제
}




