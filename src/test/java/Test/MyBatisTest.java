package Test;

import com.vipsystem.dao.IMembersMapper;
import com.vipsystem.pojo.Member;
import com.vipsystem.pojo.MemberLevels;
import com.vipsystem.pojo.MemberRoles;
import com.vipsystem.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyBatisTest {
    /*
    查询
     */
    @Test
    public void findMemberByIdTest() {
        SqlSession session = MyBatisUtils.getSqlSession();
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        Member member = mapper.selectMember(1);
        System.out.println(member);
        session.close();
    }
    @Test
    public void findMemberRolesByIdTest(){
        SqlSession session = MyBatisUtils.getSqlSession();
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        MemberRoles memberRoles = mapper.SelectMemberRoles(2);
        System.out.println(memberRoles);
        session.close();
    }
    @Test
    public void findMemberLevelByIdTest(){
        SqlSession session = MyBatisUtils.getSqlSession();
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        MemberLevels memberLevels = mapper.SelectMemberLevel(3);
        System.out.println(memberLevels);
        session.close();
    }

    /*
    增加
     */
    @Test
    public void insertMemberTest(){
        SqlSession session=MyBatisUtils.getSqlSession();
        Member member= new Member();
        member.setmID(6);
        member.setUsername("李白");
        member.setActive(true);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        member.setJoinDate(LocalDateTime.parse("2026-03-28 00:00:00", formatter));
        member.setLastLogin(LocalDateTime.parse("2026-05-12 00:00:00", formatter));
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        int result =mapper.insertMember(member);
        if (result>0){
            System.out.println("成功插入"+result+"条数据");
        }else {
            System.out.println("数据插入失败");
        }
        System.out.println(member.toString());
        session.commit();
        session.close();
    }
    /*
    修改
     */
    @Test
    public void updateMemberLevel(){
        SqlSession session=MyBatisUtils.getSqlSession();
        MemberLevels memberLevels=new MemberLevels();
        memberLevels.setlID(1);
        memberLevels.setlName("level3change");
        memberLevels.setDescription("scoreChange");
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        int result_update=mapper.updateMemberLevel(memberLevels);
        if (result_update>0){
            System.out.println("成功更新"+result_update+"条数据");
        }else {
            System.out.println("数据更新失败");
        }
        System.out.println(memberLevels.toString());
        session.commit();
        session.close();
    }
    /*
    删除
     */
    @Test
    public void deleteMemberRoleTest(){
        SqlSession session = MyBatisUtils.getSqlSession();
        IMembersMapper mapper = session.getMapper(IMembersMapper.class);
        int result_role=mapper.deleteMemberRoles(1);
        if (result_role>0){
            System.out.println("成功删除"+result_role+"条数据");
        }else {
            System.out.println("数据删除失败");
        }
        session.commit();
        session.close();

    }
}