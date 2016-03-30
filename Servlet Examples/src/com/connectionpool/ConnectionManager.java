package com.connectionpool;

import com.jolbox.bonecp.BoneCPConfig;

public class ConnectionManager {

	private static com.jolbox.bonecp.BoneCP boneCpConnectionPool =null;
	
	
	public static com.jolbox.bonecp.BoneCP getConnectionPool(){
		return boneCpConnectionPool;
	}
	
	public static void setConnectionPool(com.jolbox.bonecp.BoneCP connectionPool){
		
		ConnectionManager.boneCpConnectionPool = connectionPool;
	}
	
	public static void configureBoneCpConnectionPool() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			BoneCPConfig bonecpcongi = new BoneCPConfig();
			bonecpcongi.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE");
			bonecpcongi.setUser("hr");
			bonecpcongi.setPassword("hr");
			bonecpcongi.setMinConnectionsPerPartition(5);
			bonecpcongi.setMaxConnectionsPerPartition(10);
			bonecpcongi.setPartitionCount(1);
			boneCpConnectionPool = new com.jolbox.bonecp.BoneCP(bonecpcongi);
			
			setConnectionPool(boneCpConnectionPool);
			System.out.println("Context Initialized------------ and connection pool is configured");
		
		} catch (Exception e) {

			
			e.printStackTrace();
		}
	}

	public static void shutdownBoneCpConnectionPool() {

		
	}

}
