package com.vipsystem.dao;   // ✅ 改为你的项目包名

import com.vipsystem.pojo.Member;        // ✅ 改为你的 pojo 包路径
import com.vipsystem.pojo.MemberLevels;  // ✅ 改为你的 pojo 包路径
import com.vipsystem.pojo.MemberRoles;   // ✅ 改为你的 pojo 包路径
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
    MemberRoles selectMemberRoles(int id1);

    @Select("select * from memberlevels where memberlevels.L_ID = #{id2}")
    @Results({
            @Result(column = "L_ID", property = "lID"),
            @Result(column = "L_Name", property = "lName")
    })
    MemberLevels selectMemberLevel(int id2);

    @Insert("insert into members(M_ID, Username, JoinDate, LastLogin, IsActive) " +
            "values(#{mID}, #{username}, #{joinDate}, #{lastLogin}, #{isActive})")
    int insertMember(Member member);

    @Update("UPDATE memberlevels SET L_Name = #{lName}, Description = #{description} " +
            "WHERE L_ID = #{lID}")
    int updateMemberLevel(MemberLevels memberLevels);

    @Delete("delete from memberroles where R_ID = #{rID}")
    int deleteMemberRoles(int rID);
}