package top.duyunjian.chat.infrastructure.dao;


import org.apache.ibatis.annotations.Mapper;
import top.duyunjian.chat.infrastructure.po.Groups;

@Mapper
public interface IGroupsDao {

    Groups queryGroupsById(String groupsId);

}
