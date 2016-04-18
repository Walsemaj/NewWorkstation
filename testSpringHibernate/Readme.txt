Objective
1) Test Hibernate basic configuraiton 
2) Transaction management
3) Display hibernate sql & parameter value (see Hibernate.xml & log4j.properties) 

Source: http://www.mkyong.com/spring/spring-aop-transaction-management-in-hibernate/

Hierarchy 

o Declaration of using Spring transaction manager
|_ Mapping Hibernate Resources (Hibernate.xml)
     |_ Product (Product.hbm.xml)
|_ Proxy Factory Bean (product.xml)
      |_ Transaction Interceptor
           |_ Transaction Attributes
           |_ Hibernate Transaction Manager
                |_ Local Session Factory Bean
                     |_ Hibernate Properties   
                     |_ Data Source
                          |_ Location Property
                               |_ Database Properties

o Setup of a New Table
|_ Entity Bean (product.java)
|_ Dao & impl (productDao.java productDaoImp.java)
|_ Import Resources (BeanLocations.xml)
	|_ Dao & impl bean declaration (product.xml)
	|_ Hibernate Configuration (Hibernate.xml)
		|_ Object-Table Mapping (product.hdm.xml) 

Start Method
1. Start derby server
2. Run as java application

Test
1. Log can be found in workspace_spring.testSpringHibernate.log
2. You can see two inserts blinded into same transaction
3. Two inserts will be rollback in case of any exception (Case: null pointer exception from ProductQohDaoImpl.save()) 
