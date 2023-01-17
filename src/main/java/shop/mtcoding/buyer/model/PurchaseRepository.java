package shop.mtcoding.buyer.model;

import java.util.List;

public interface PurchaseRepository {
    public int insert(Integer userId, Integer productId);
    public List<Purchase> findAll();
    public Purchase findById(int id);
    public int updateById(int id, Integer userId, Integer productId);
    public int deleteById(int id);
}
