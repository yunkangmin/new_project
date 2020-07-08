package org.project.service;

import java.util.List;

import org.project.domain.BoardVO;
import org.project.domain.Criteria;
import org.project.domain.SearchCriteria;

public interface BoardService {

  public void regist(BoardVO board) throws Exception;

  public BoardVO read(Integer bno) throws Exception;

  public void modify(BoardVO board) throws Exception;

  public void remove(Integer bno) throws Exception;

  public List<BoardVO> listAll() throws Exception;

}
