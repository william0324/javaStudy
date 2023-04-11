# Java基础总结

## 第一章 基础知识

### Java体系的技术被划分为三大块

- ​	JavaSE：标准版

- ​	JavaEE：企业版

- ​	JavaME：微型版

  

### 安装JDK之后：

- JDK：Java开发工具箱
- JRE：Java运行环境
- JVM：Java虚拟机

### Java程序编译后可以在不同平台之间运行:跨平台性

放源代码的扩展名必须是.java

编译生成的字节码文件扩展名是.class

1个java源文件可以编译生成多个class文件

字节码文件不是二进制，不然不用虚拟机解释，直接操作系统就执行了

### Java程序从开发到最终运行经历了什么?

编译期:(可以在windows 上)

- 第一步:在硬盘的某个位置（随意），新建一个xxx.java文件
- 第二步:使用记事本或者其它文本编辑器例如EditPlus打开xxx.java文件
- 第三步:在xxx.java文件中编写"符合java语法规则的n源代码
- 第四步:保存（(一定要将xxx.java文件保存一下)
- 第五步:使用编译器(javac【JDK安装后自带】）对xxx.java文件进行编译。
- 第六步:如果xxx.java文件中编写的源代码是符合语法规则的，编译会通过，如果xxx.java文件中编写的源代码违背了语法规则，那么编译器会报错，编译器报错之后class文件是不会生成的，只有编译通过了才会生成class字节码文件。并且一个java源文件是可以生成多个class文件的。（编译实质上是检查语法)

运行期（)(可以在windows上，也可以在其他的os上。)

- 第七步:如果是在Linux上运行，需要将windows上生成的class文件拷贝过去不需要拷贝源代码，真正运行的是字节码。(但是源代码也不要删除，有用)
- 第八步:使用DK自带的一个命令/工具: java（负责运行的命令/工具）执行字节石
- 第九步:往下的步骤就全部交给JM了，就不需要程序员干涉了。
- JVM会将字节码文件装载进去，然后JVM对字节码进行解释（解释器负责将字节码解释为1010101010..等的二进制)
- 第十步:JVM会将生成的二进制码交给os操作系统，操作系统会执行二进制码和破硬件进行交互。

javac命令，负责编译

java命令，负责运行

### 环境配置

用户变量：只有当前用户可以用

系统变量：整个系统的用户都可以用

修改Path环境变量路径

![image-20230406043829822](java基础.assets/image-20230406043829822.png)

javac java源文件的路径

java 类名

### 运行java步骤

1. cd命令切换到class文件所在目录
2. 执行java Test，java后面只能跟类名

classpath是给类加载器指路的，默认情况下classloader会从当前路径找，配置classpath之后类加载器只会在配置的目录中寻找，不会再从当前的路径中寻找了

![image-20230406052034225](java基础.assets/image-20230406052034225.png)

### 标识符

数字、字母、下划线_、美元符号组成不能含有其他符号，不能以数字开头，不能有空格，关键字不能作为标识符

### 命名规范

1. 英语单词
2. 驼峰
3. 类名、接口名首字母大写，后面每个单词首字母大写
4. 变量名首字母小写，后面每个单词首字母大写
5. 所有常量全部大写，单词与单词之间采用下划线衔接
6. Java语言中严格区分大小写

## 第二章 Java基本的程序设计结构

### 数据类型

byte 1字节

short  2

int  4

long  8

float 4

double 8 

boolen  1

char  2 可以存储一个汉字

引用数据类型

#### 1 转义字符

```java
public class Test {
    public static void main(String[] args) {
        //转义字符输出单引号,\'表示一个单引号
        System.out.println('\'');
        //输出\
        System.out.println('\\');
        //输出""
        System.out.println("\"test\"");
        System.out.println("'");
        //\u表示字符的Unicode编码
        char x = '\u4e2d';
        System.out.println(x);
    }
}
```

#### 2 类型转化

1、boolean不能参与类型转换，其它都行。

2、没有超出byte short char的范围,整数可以直接赋值。、

3、自动类型转换小--->大

4、byte < short(char) <int < long < float < double4、强制类型转换大-->小需要加强制类型转换符

5、 byte short char混合运算,先各自转换成int，再做运算

6、多种数据类型混合运算的时候，各自先转换成容量最大的哪一种再做运算。

java中整数默认是int型，long需要在数字后面加L

浮点数默认是double，float后面要加F

精度损失不超过范围可以直接赋值成short byte

```java
/*
    小容量可以直接赋值给大容量，成为自动类型转换
    大容量转换成小容量必须加上强制类型转换符
 */
public class Test {
    public static void main(String[] args) {
        long x = 100L;
        int y = (int)x;
    }
}
```

```java
/*
    整数没有超过范围可以直接赋值给char
 */
public class Test {
    public static void main(String[] args) {
        char c = 97;
        System.out.println(c);  //output:a
    }
}
```

#### 3 混合运算

```java
/*
    byte char short 做混合运算时，先各自转换成int再做运算
 */
public class Test {
    public static void main(String[] args) {
        char c = 'a';
        byte b = 1;
        System.out.println(c+b);  //output:98
        //short s = c + b;  错误，编译器不知道加法结果有没有超过short范围，只知道右边结果是int
        /*int a = 1;错误
        short x = a;*/
    }
}
```

多种数据类型混合运算最终的结果是最大容量对应的类型，除byte char short会变成int

### 运算符

a++ 先执行表达式再自增

++a 先自增再执行表达式

使用扩展运算符不会改变

 

```java
public class Test {
    public static void main(String[] args) {
       byte x = 100;
       x = x+1; //报错
       x += 1;  //正确
    }
}
```

三目运算符

```java
public class Test {
    public static void main(String[] args) {
       int a = 5,b = 6;
       boolean flag = a > b? true:false;
       System.out.println(flag);
    }
}
```



```java
/*
* + 运算符
* 1.求和2.字符串拼接
* 两边都是数字的时候求和
* 任意一方是字符串类型字符串拼接
* */
public class Test {
    public static void main(String[] args) {
      int old = 35;
      System.out.println("年龄=" + 35);
      int a = 100;
      int b = 200;
      //多个加号自左向右依次进行，除非有小括号
      System.out.println(a+b+"110");    //output 300110
    }
}
```

### 用户输入

```java
import java.util.Scanner; // 导入 Scanner 类
public class Main {
 public static void main(String[] args) {
  Scanner myObj = new Scanner(System.in); // 创建 Scanner 对象
  System.out.println("Enter username");
  String userName = myObj.nextLine(); // 读取用户输入
  System.out.println("Username is: " + userName); // 输出用户输入
 }
}
```

| 方法          | 描述                         |
| ------------- | ---------------------------- |
| nextBoolean() | 从用户处读取 boolean 布尔值  |
| nextByte()    | 从用户处读取 byte 字节       |
| nextDouble()  | 从用户处读取 double 双精度值 |
| nextFloat()   | 从用户处读取 float 浮点值    |
| nextInt()     | 从用户处读取一个 int 值      |
| nextLine()    | 从用户处读取 String 字符串值 |
| nextLong()    | 从用户处读取 long 长整形     |
| nextShort()   | 从用户处读取 short 短整形    |

### 控制语句

#### if

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String out;
        int old = sc.nextInt();
        if(0 <= old && old <= 5) {
            out = "婴幼儿";
        }
        else if (6 <= old && old <= 10 ) {
            out = "少儿";
        }
        else if (11 <= old && old <= 18) {
            out = "少年";
        }
        else if (19 <= old && old <= 35) {
            out = "青年";
        }
        else if (36 <= old && old <= 55) {
            out = "中";
        }
        else if (56 <= old && old <= 150) {
            out = "老年";
        }
        else {
            out = "输入年龄非法";
        }
        System.out.println(out);
    }
}
```

#### switch

switch支持int和Sting类型

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int old = sc.nextInt();
        switch (old) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println("其他");
        }
    }
}
```

#### for

```
import java.util.Scanner;
public class Test {
    //99乘法表
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(j+"*"+i+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
```

#### while

#### do while

```java
import java.util.Scanner;
public class Test {
    //99乘法表
    public static void main(String[] args) {
        int i = 0;
        do {
            i += 1;
            System.out.println(i);
        }while(i <= 10);	//注意分号
    }
}
```

#### break

终结最近循环

#### continue

## 第三章 面向对象

### 1 方法

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        sumInt(100,200);
    }
    public static void sumInt(int x,int y) {
        int z = x + y;
        System.out.println(x + " + " + y + " = " + z);
    }
}
```

#### JVM

##### 堆区

  堆是一个运行时数据区，专门用来保存类(class)的实例(instance)并分配空间，不存放基本类型和对象引用，例如new 创建的实例和数组，实际上只是保存实例的属字面量、类型和类型标记等，然而并不保存实例的方法（方法是指令，保存在下一节介绍的栈中）。

  jvm只有一个堆区，它被所有线程共享。堆的大小是由垃圾收集器来负责的，优势是可以动态地分配内存大小，生命周期也不必事先告诉编译器，因为它是在运行时动态分配内存的，垃圾收集器会自动收走不再使用的数据。缺点是由于要在运行时动态分配内存，所以，存取速度较慢。

##### 栈区

  每个线程包含一个栈区，栈中只保存基础数据类型变量的字面量和自定义对象的引用(不是对象)，对象都存放在堆区中。

  每个栈中的数据(基本类型和对象引用)都是私有的，其它栈不能访问。栈分为3个部分：基本类型变量区、执行环境上下文、操作指令区(存放操作指令)。

##### 方法区

  方法区又叫静态区，跟堆一样，被所有的线程共享。它存储的都是在整个程序中永远唯一的元素，如class和static变量。全局变量和静态成员变量的存储是放在一块的，但是，初始化和未初始化的分别存储在相邻的两块区域。

  虚拟机的体系结构包括堆、方法区、本地方法栈和pc寄存器。而方法区保存的就是一个类的模板，堆是放类的实例的，一般来用于函数计算，它里面的数据在函数执行完时是不会存储的，直接丢弃。这就是为什么局部变量每一次都是一样的，即便修改了它后，下次执行函数的时候还是原来的值。

  如果栈内存或者堆内存不足都会抛出异常：

- 栈空间不足：java.lang.StackOverFlowError。
- 堆空间不足：java.lang.OutOfMemoryError。

  栈的空间大小远远小于堆的。栈空间操作起来最快但是空间很小，通常大量的对象都是放在堆空间，理论上整个内存没有被其它进程使用的空间甚至硬盘上的虚拟内存都可以被当成堆空间来使用。

#### 方法重载(overload)

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        sum(1,2);
        sum(5l,6l);
        sum(2.1,3.1);
    }
    public static int sum(int x,int y) {
        int z = x + y;
        System.out.println("int sum");
        return z;
    }
    public static long sum(long x,long y) {
        System.out.println("long sum");
        return x+y;
    }
    public static double sum(double x,double y) {
        System.out.println("double sum");
        return x+y;
    }
}
```

什么时候考虑方法重载？两个方法的功能相似

重载条件

1.在同一个类中

2.方法名相同

3.参数类表不同（参数个数，类型，顺序）

方法重载与返回值类型修饰符无关

![image-20230408000936191](java基础.assets/image-20230408000936191.png)

![image-20230408001011154](java基础.assets/image-20230408001011154.png)

#### 递归

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(sum(n));
        System.out.println(sum1(n));
    }
    public static int  sum(int n) {
        //for循环计算1-n的和
        int s = 0;
        for (int i = 1;i <= n;i++) {
            s += i;
        }
        return s;
    }
    public static int sum1(int n) {
        //使用递归计算1-n的和
        if(n == 1) {
            return 1;
        }
        return n + sum1(n-1);
    }
}
```

```java
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(fun(n));
    }
    //求1-n的阶乘   5*4*3*2*1
   public static int fun(int n) {
        if (n == 1) {
            return n;
        }
        return n*fun(n-1);
   }
}
```

### 2 面向对象

#### 类、对象介绍

三大特征：封装，继承，多态

对象（实例）

![image-20230408052539975](java基础.assets/image-20230408052539975.png)

![image-20230408055955837](java基础.assets/image-20230408055955837.png)

![image-20230408080842226](java基础.assets/image-20230408080842226.png)

##### 构造方法

1.修饰符统一写public

2.构造方法名和类名必须一致

3.构造方法没有返回值类型

当一个类中没有提供任何构造方法，系统默认提供一个无参数的构造方法。缺省构造器

当一个类中手动提供了构造方法，系统不再提供无参构造方法。

```java
public class Student {
    int number;
    String name;
    int age;
    Student() {}
    Student(int nu,String na,int ag) {
        nu = number;
        na = name;
        ag =  age;
    }
}
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"2",3);
        
    }

}
```

##### static

静态变量，可以通过类名访问

```java
public class Student {
    private int number;
    private String name;
    private int age;
    static String kk = "信了";    //静态变量，类级别的
    Student() {}
    Student(int nu,String na,int ag) {
        nu = number;
        na = name;
        ag =  age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"2",3);
        System.out.println(Student.kk);
    }

}
```

静态方法

方法中直接访问了实例变量，该方法一定是实例方法

如果是工具类，该工具类当中的方法一定是静态的

静态代码块

```java
import java.util.Scanner;
public class Test {
    //静态代码块在类加载时执行，并且在main方法执行之前执行
    //静态代码块可以自上至下顺序执行
    //作用：类加载时记录类加载时的日志信息，写到静态代码块中。
    //静态代码块和静态变量都在类加载时执行，时间相同，只能靠代码顺序来决定谁先谁后
    
    static {    //一个类中可以有多个静态代码块
        System.out.println("A");
        //System.out.println(a);    错误，非法前向引用
    }
    //static int a = 5;
    static {    //一个类中可以有多个静态代码块
        System.out.println("b");
    }
    public static void main(String[] args) {
        System.out.println("main");

    }
    static {    //一个类中可以有多个静态代码块
        System.out.println("c");
    }
}
```

##### 实力语句块
