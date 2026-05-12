package com.vipsystem.dao;

import com.vipsystem.pojo.Member;
import com.vipsystem.pojo.MemberLevels;
import com.vipsystem.pojo.MemberRoles;
import org.apache.ibatis.annotations.*;

public interface IMembersMapper {

    @Select("select * from members where members.M_ID = #{id}")
    @Results({
            @Result(column = "M_ID", property = "mID")
    })
    Member selectMember(int id);

    @Select("select * from memberroles where memberroles.R_ID = #{id1}")
    @Results({
            @Result(column = "R_ID", property = "rID")
    })
    MemberRoles SelectMemberRoles(int id1);

    @Select("select * from memberlevels where memberlevels.L_ID = #{id2}")
    @Results({
            @Result(column = "L_ID", property = "lID"),
            @Result(column = "L_Name", property = "lName")
    })
    MemberLevels SelectMemberLevel(int id2);

    @Insert("insert into members(M_ID, Username, JoinDate, LastLogin, IsActive) " +
            "values(#{mID}, #{username}, #{joinDate}, #{lastLogin}, #{isActive})")
    int insertMember(Member member);

    @Update("UPDATE memberlevels SET L_Name = #{lName}, Description = #{description} " +
            "WHERE L_ID = #{lID}")
    int updateMemberLevel(MemberLevels memberLevels);

    @Delete("delete from memberroles where R_ID = #{rID}")
    int deleteMemberRoles(int rID);
}