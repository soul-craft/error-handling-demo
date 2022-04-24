package com.soulcraft.demo.errorhandling.demo6.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * 用户操作相关返回信息
 * </p>
 *
 * @author Scott
 * @since 2022-04-19
 */
@Getter
@AllArgsConstructor
public enum UserResponse implements BusinessExceptionAssert {

    USERNAME_CANNOT_BE_EMPTY(600, "Username cannot be null or empty"),
    PASSWORD_CANNOT_BE_EMPTY(601, "Password cannot be null or empty"),
    USER_LOGIN_FAILED(602, "User login failed"),
    USERNAME_LENGTH_IS_NOT_VALID(603, "The length of username must between {0} and {1}"),
    ;

    /**
     * 返回码
     */
    private int code;
    /**
     * 返回消息
     */
    private String message;
}
