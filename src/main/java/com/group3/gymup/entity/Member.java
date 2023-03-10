package com.group3.gymup.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//Put User class for spring container to manage
//@Controller
//@Service
//@Repository	//Dao

@Component
@Getter
@Setter
@Accessors(chain = true)
@ToString
@Data
@TableName(value = "members")
public class Member implements Serializable {

  @TableId(value = "member_id")
  private String memberId;
  private String password;
  private String firstName;
  private String lastName;

}
