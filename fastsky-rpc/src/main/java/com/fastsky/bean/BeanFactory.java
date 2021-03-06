package com.fastsky.bean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: BeanFactory
 * Description: TODO
 *
 * @author: starryfei
 * @date: 2019-01-24 23:03
 **/
public class BeanFactory {

    private Map<String, RcpResponse> bean = new ConcurrentHashMap<>(16);
    private static  BeanFactory beanFactory = null;

    public static BeanFactory getInstance() {
        if (beanFactory == null) {
            beanFactory = new BeanFactory();
        }
        return beanFactory;
    }

    public RcpResponse getBean(String name) {
        return bean.get(name);
    }

    public void putBean(RcpResponse response) {
        bean.put(response.getName(),response);

    }





}
