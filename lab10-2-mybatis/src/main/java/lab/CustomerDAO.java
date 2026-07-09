package lab;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.egovframe.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("customerDAO")
public class CustomerDAO extends EgovAbstractMapper {

  public void insertCustomer(CustomerVO vo) {
    insert("customer.insertCustomer", vo);
  }

  public int deleteAllCustomer(CustomerVO vo) {
    return delete("customer.deleteAllCustomer", vo);
  }

  public List<CustomerVO> selectCustomerList(CustomerVO vo) {
    return selectList("customer.selectCustomerList", vo);
  }

}
