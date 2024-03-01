package cn.ywt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ack_msg")
public class AckMsg {
    @TableId(type= IdType.AUTO)
    private String ackMsgId;

    private Long msgId;
    private Long fromId;
    private Long toId;
    private String msgStatus;

}
