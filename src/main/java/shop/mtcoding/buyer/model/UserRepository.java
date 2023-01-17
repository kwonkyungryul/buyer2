package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    public int insert(User user);
    public List<User> findAll();
    public User findById(int id);
    public int updateByIdToPassword(int id, String password);
    public int deleteById(int id);
}
