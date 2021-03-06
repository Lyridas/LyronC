# LYRON-C后端

这是为类C的编程语言开发的编译器后端程序的一部分。编译器后端用于将中间代码转换成目标代码。对于本项目，中间代码是依赖[LYRON编译器框架](https://github.com/llyronx/LYRON)以及文法[c.xml](https://github.com/LLyronx/LYRON/blob/master/sample/c/xml/c.xml)生成的四元式，目标代码是Windows平台上的可执行程序（EXE）。本程序将中间代码生成汇编代码，然后依赖MASM32（汇编器和链接器）将汇编代码生成Windows平台上可执行程序。

### 编译和运行

1. 安装masm32汇编器。

2. 使用Eclipse或者Intellij IDEA等开发工具打开此项目，导入本项目为maven项目，等待加载maven包完毕。

3. 使用maven的package功能生成jar包，使用install功能安装jar包。target文件夹中将生成编译好的文件。运行`ConsoleApplication`的`main`方法启动程序。

4. 程序运行后，按照提示输入masm32汇编器的安装路径（这个路径是bin目录的直接父目录）

5. 按照提示输入四元式文件路径（可以是LYRON生成的四元式文件）

6. 如果一切正常，将生成可执行文件（文件名与四元式文件相同，扩展名为exe），如果出现错误，请查看错误提示修改。

### 语言支持

本后端支持的语言与C语言类似，详细支持或不支持、修改的内容如下所示：

- [x] 加减乘除运算
- [ ] 取余运算
- [x] 将异或运算符（^）转义成乘方运算符
- [ ] 按位运算符
- [x] 关系运算符
- [x] 简单赋值运算符
- [ ] 多重赋值运算符
- [ ] 自增、自减运算符
- [x] 逻辑运算符
- [ ] 逻辑运算符的短路
- [x] 分支语句if
- [x] 循环语句for
- [x] 循环语句while
- [x] 循环语句do while
- [x] 在循环语句中break和continue
- [x] int类型
- [ ] 其他基本数据类型
- [ ] 浮点常量
- [ ] 八进制和十六进制常量
- [ ] 科学计数法
- [x] 结构体类型定义 `typedef struct {/* something */} A, B;`
- [ ] 结构体类型定义 `typedef struct Q {/* something */} A, B;`
- [x] 类型重命名 `typedef A B;`
- [x] 一维数组
- [x] 多维数组
- [ ] 指针定义
- [ ] 指针运算
- [ ] 字符串
- [x] 函数调用和返回
- [x] 两个结构体类型相互赋值，或者函数传参时拷贝结构体
- [ ] 包含结构体类型的其他运算
- [x] 类型检查
- [x] 函数作用域
- [x] 块作用域
- [x] 使用关键字`print`和`input`进行输入输出，一次输出一个
- [ ] 预处理器`include`
- [ ] 预处理器`define`