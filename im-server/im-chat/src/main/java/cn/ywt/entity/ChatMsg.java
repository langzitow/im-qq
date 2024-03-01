package cn.ywt.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("chat_msg")
public class ChatMsg {

    @TableId(type= IdType.AUTO)
    private Long msgId;
    private String createBy;
    private String sendTo;
    private String msgType;
    private Date createTime;
    private String msgBody;
}
