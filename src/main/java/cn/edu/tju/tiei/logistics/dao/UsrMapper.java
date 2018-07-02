package cn.edu.tju.tiei.logistics.dao;

import cn.edu.tju.tiei.logistics.model.Usr;
import cn.edu.tju.tiei.logistics.model.UsrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsrMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    long countByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int deleteByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int insert(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int insertSelective(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    List<Usr> selectByExample(UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    Usr selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Usr record, @Param("example") UsrExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Usr record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usr
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Usr record);
}