package com.cloud.xframe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : zengh
 * @Date : 2022/8/4 0004 - 23:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {

    private Long id;

    private String serial;
}
