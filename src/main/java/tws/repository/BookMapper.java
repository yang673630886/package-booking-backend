package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Book;

@Mapper
public interface BookMapper {
    void insertBook(@Param("book") Book book);
}
