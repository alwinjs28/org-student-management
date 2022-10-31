package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

    @Query(value="SELECT A FROM Address A WHERE A.addressId=?1")
    Address getAddress(Integer addressId);
}
