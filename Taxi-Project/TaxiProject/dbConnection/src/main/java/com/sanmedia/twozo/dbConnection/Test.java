package com.sanmedia.twozo.dbConnection;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Test implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Welcome!");
        final DBConnection dbConnection = new DBConnection();
        dbConnection.getConnection();
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Thank you");
    }
}
