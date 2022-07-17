## 关于对spring @Transactional 的测试

### 事务的传播行为

> PROPAGATION_REQUIRED:Support a current transaction, create a new one if none exists.
>
> PROPAGATION_SUPPORTS:Support a current transaction, execute non-transactionally if none exists.
>
> PROPAGATION_MANDATORY:Support a current transaction, throw an exception if none exists.
>
> PROPAGATION_REQUIRES_NEW:Create a new transaction, and suspend the current transaction if one exists.
>
> PROPAGATION_NOT_SUPPORTED:Execute non-transactionally, suspend the current transaction if one exists.
>
> PROPAGATION_NEVER:Execute non-transactionally, throw an exception if a transaction exists.
>
> PROPAGATION_NESTED:Execute within a nested transaction if a current transaction exists

### 最常见的触发回滚

1. 抛出了异常，并没有自己手动捕获，就会触发回滚

![image-20220717132606845](https://raw.githubusercontent.com/Alivw/picgo/master/imgimage-20220717132606845.png)

2. insertUser1()跟insertUser2()均回滚

![image-20220717140054588](https://raw.githubusercontent.com/Alivw/picgo/master/imgimage-20220717140054588.png)

### 事务失效

test2()方法并没有加@Transactional，又抛出了异常，insertUser1()跟insertUser2()不受影响

![image-20220717132713681](https://raw.githubusercontent.com/Alivw/picgo/master/imgimage-20220717132713681.png)





> Propagation.SUPPORTS：Support a current transaction, execute non-transactionally if none exists

![image-20220717140342217](https://raw.githubusercontent.com/Alivw/picgo/master/imgimage-20220717140342217.png)

test2()即使抛出了异常，但是是以非事务运行，所以不会回滚

> PROPAGATION_NOT_SUPPORTED:Execute non-transactionally, suspend the current transaction if one exists.

![image-20220717141306896](https://raw.githubusercontent.com/Alivw/picgo/master/imgimage-20220717141306896.png)

test2()并没有@Transactional注解，所以 insertUser2()是以非事务方式运行，不会回滚；如果 test2()加了@Transactional注解，是会回滚