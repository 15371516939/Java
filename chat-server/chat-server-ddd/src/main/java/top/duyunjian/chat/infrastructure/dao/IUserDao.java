package top.duyunjian.chat.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import top.duyunjian.chat.domain.inet.model.ChannelUserReq;
import top.duyunjian.chat.infrastructure.po.User;

import java.util.List;

@Mapper
public interface IUserDao {

    String queryUserPassword(String userId);

    User queryUserById(String userId);

    List<User> queryFuzzyUserList(String userId, String searchKey);

    Long queryChannelUserCount(ChannelUserReq req);

    List<User> queryChannelUserList(ChannelUserReq req);

}
