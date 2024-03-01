package cn.ywt.usermanage.user.status.service;

public interface UserStatusService {
    /**
     *
     * @param userId
     * @param connectorId
     * @return user's connection id, if not exist return null
     */

    String online(String userId,String connectorId);

    /**
     *
     * @param userId
     */

    void offline(String userId);

    String getConnectorId(String userId);
}
