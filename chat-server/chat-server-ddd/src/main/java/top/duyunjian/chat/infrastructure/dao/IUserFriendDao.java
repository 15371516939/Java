package top.duyunjian.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.duyunjian.chat.infrastructure.po.UserFriend;

import java.util.List;

@Mapper
public interface IUserFriendDao {

    List<String> queryUserFriendIdList(String userId);

    UserFriend queryUserFriendById(UserFriend req);

    void addUserFriendList(List<UserFriend> list);

}
