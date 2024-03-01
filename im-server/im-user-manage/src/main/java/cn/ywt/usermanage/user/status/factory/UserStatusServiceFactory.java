package cn.ywt.usermanage.user.status.factory;


import cn.ywt.usermanage.user.status.service.UserStatusService;

import java.util.Properties;

public interface UserStatusServiceFactory {

    UserStatusService createService(Properties properties);
}
