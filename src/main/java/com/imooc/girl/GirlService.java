package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;
@Transactional
    public void insertTwo(){
    Girl girlA=new Girl();
    girlA.setAge(17);
    girlA.setCupSize("C");
    girlRepository.save(girlA);
         Girl girlB=new Girl();
      girlB.setAge(17);
     girlB.setCupSize("C");
            girlRepository.save(girlB);
}

}
