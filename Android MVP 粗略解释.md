Android MVP 粗略解释

1.看文件结构。

model层：

数据类；class

接口类；interface

接口实现类；implement



presenter层：

接口类（model和view）；interface

接口实现类；implement



view层：

activity；lifecycle+implement

接口层；interface



2.了解三层作用

model：用来处理有关数据的方法，可以调用presenter中的实现类

presenter：处理有关数据和视图的逻辑操作

view：处理视图的变化和activity的生命周期



3.了解调用关系

总而言之：

model调用presenter，presenter调用model和view，view调用presenter。



model：

接口实现类可以调用presenter接口类里面的逻辑方法。

也就是说，除了数据方面可以直接赋值使用变量操作之外（String username  = user.getUsername();)

其他任何代码都建议直接调用presenter里面提供的接口函数



presenter：

接口类分别有两种，一种是为model层提供的接口，一种是为view层提供的接口。

同一页面的model接口类和view接口类可以同时在同一个接口实现类中实现。

在接口实现类中只有逻辑和对model、view接口类函数的调用



view：

接口实现类和activity生命周期都在activity中实现。



4.如何由0到1

1. 创建文件夹进行分类（model\view\presenter），然后创建对应的java类。
2. 从activity开始写，写到哪里需要什么就去对应的层补函数去。
3. 总而言之，入门还是很easy的。



5.总结

从代码的角度来说，MVP的模式可以实现解耦，而且非常easy，分层比较好。

至于缺点嘛，我重构个项目看看有没有什么问题。希望这个repo会有被我修改的机会。

掰掰ヾ(•ω•`)o



