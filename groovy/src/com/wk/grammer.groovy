package com.wk

println "--------------语法的使用------------------"
println "--------------变量的定义------------------"
def name = "zhagnsan"   // 使用def 来定义变量, 不需要指定类型,会根据赋值来自动推断
age = 18        // 连def都省略,

println "--------------方法的调用------------------"
println("name = " + name+", age="+age)
println "name=" + name + ": age = "+age

// 断言
assert age==18

println "--------------字符串的定义------------------"
str = '33'
str1 = 'wangwu,age=${str}' // 可以使用单引号; 单引号可见不能 解析 ${} 变量
str2 = "str1 = ${str}" // 可以使用双引号,并使用${}来引用变量
str3 = '''name=zhaoliu
age=10
'''     // 使用 三个单引号,可以按照格式来定义字符串
println str1
println str2
println str3

println "--------------集合的定义------------------"
// list集合, 使用[] 来声明集合
def list = ['will', 'ille', 'self']
// 给list添加集合
list.add("xiaoming")
list << "wolfgo"
println list

def map = ['key1':'wangsan', 'age':18]
map.put("name","zhaoliu")
map.key2 = "value2"
println map

println "--------------闭包的定义------------------"
// 不带参数的闭包
def c1={
    println "不带参数的闭包"
}

// 带参数的闭包
def c2 = {
    val -> {
        println "带参数的 Closure: ${val}"
    }
}

// 定义参数为 没有参数的闭包
def method1(Closure fun){
    // 闭包的第一种调用方式
    // fun()
    // 闭包的第二种调用方式
    fun.call()
}

// 定义的参数为没有类型
def method2(closure){
    // 第一种调用方式
    closure("zhangsan")
    // 第二种调用方式
    closure.call("wangwu")
}
// 方法调用
method1 c1
method2 c2

// 自定义闭包; {} 花括号中为比较, () 这个括号表示参数
method1({
    println "自定义闭包"
})
// 也可以直接传递闭包, 把() 括号去除
method1 {
    println "自定义闭包2"
}
