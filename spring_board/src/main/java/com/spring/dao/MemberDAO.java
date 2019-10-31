package com.spring.dao;
 
import java.util.List;
 
import com.spring.vo.MemberVO;
 
public interface MemberDAO {
    
    public List<MemberVO> selectMember() throws Exception;
}
