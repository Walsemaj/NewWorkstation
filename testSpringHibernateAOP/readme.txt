Testing Spring AOP

Start Method
Start Derbet Server
Run java application with anyone of three modes [PatternMethodPointcutAdvisor | ClassIntercepted | NameMatchMethodPointcut]

Test

PatternMethodPointcutAdvisor - Regular Expression Pointcut Advisor
|_ BeanLocations_PatternMethodPointcutAdvisor.xml
	|_ customer_PatternMethodPointcutAdvisor.xml

ClassIntercepted - Class level Interception & ***Throws Advice Implementation
|_ BeanLocations_ClassIntercepted.xml
	|_ customer_ClassIntercepted.xml

NameMatchMethodPointcut - Exact Method Name Matching
|_ BeanLocations_NameMatchMethodPointcut.xml
	|_ customer_NameMatchMethodPointcut.xml