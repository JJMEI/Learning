package com.mjj.rpc.basic.zookeeper.basic.service_registry;

import java.util.List;

public abstract class LoadBlance {

    public volatile  static List<String> serviceServerList;

    public abstract String getRemoteServiceAddress();
}
