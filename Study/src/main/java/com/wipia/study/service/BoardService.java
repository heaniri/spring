package com.wipia.study.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wipia.study.dao.BoardDAO;
import com.wipia.study.domain.BoardVO;
import com.wipia.study.domain.Criteria;
import com.wipia.study.domain.FileVO;

public interface BoardService {
	
	// 글 목록 조회
	List<BoardVO> getBoardList(Criteria paging);
	
	// 글 상세 조회
	BoardVO getContent(BoardVO vo) throws Exception;
	
	// 글 등록
	void insertBoard(BoardVO vo, MultipartFile[] uploadFile);

	// 글 수정
	boolean updateBoard(BoardVO vo,MultipartFile[] uploadFile);

	// 글 삭제
	void deleteBoard(BoardVO vo);
	
	//글 갯수
	int totalCnt(Criteria cri);
	
	//첨부파일 리스트
	List<FileVO> getAttachList(Long bno);
	
}