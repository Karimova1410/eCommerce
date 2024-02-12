package com.example.eCommerce.mapper.Impl;

import com.example.eCommerce.dto.Payment.PaymentDetailsRegisterResponse;
import com.example.eCommerce.entities.User;
import com.example.eCommerce.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public PaymentDetailsRegisterResponse toDto(User user) {
        PaymentDetailsRegisterResponse userRegisterResponse = new PaymentDetailsRegisterResponse();
        userRegisterResponse.setId(user.getId());
        userRegisterResponse.setFirstName(user.getFirstName());
        userRegisterResponse.setLastName(user.getLastName());
        userRegisterResponse.setEmail(user.getEmail());
        userRegisterResponse.setCountry(user.getCountry());
        userRegisterResponse.setPhone(user.getPhone());
        userRegisterResponse.setCompanyName(user.getCompanyName());
        userRegisterResponse.setProvinceName(user.getProvinceName());
        userRegisterResponse.setStreetAddress(user.getStreetAddress());
        userRegisterResponse.setTownName(user.getTownName());
        userRegisterResponse.setZipCode(user.getZipCode());
        userRegisterResponse.setAdditionalInfo(user.getAdditionalInfo());
        return userRegisterResponse;




    }
}
