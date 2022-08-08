package com.cloud.xframe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:05
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public static final CommonResult CR_404 = new CommonResult(404,"not found page");
    public static final CommonResult CR_500 = new CommonResult(500,"server is error");
    public static final CommonResult CR_FAILURE = new CommonResult(202,"failure");
    public static final CommonResult CR_SUCCESS = new CommonResult(202,"success");

    public CommonResult(Integer code, String message){
        this(code, message, null);
    }

    public CommonResult(T data){
        this(200,"success",data);
    }
}
