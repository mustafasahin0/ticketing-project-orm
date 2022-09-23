//package com.cydeo.converter;
//
//import com.cydeo.dto.UserDTO;
//import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConfigurationPropertiesBinding
//public class UserDtoConverter implements Converter<String, UserDTO> {
//
//    UserService userService;
//
//    public UserDtoConverter(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDTO convert(String source) {
//        return userService.findById(source);
//    }
//
//}
