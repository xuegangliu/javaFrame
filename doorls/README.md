# doorls_test

## helloworld.drl
    package helloworld;
    
    rule "HelloWorld"
        when
            eval(true)
        then
            System.out.println("HelloWorld !!!");
    end

## 测试结果
![HelloWorld](img/hello-world.png)
