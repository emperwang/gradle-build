// 以脚本形式来编写代码
Student stu = new Student()

// 调用setter/getter 方法
stu.setUsername("zhangsan")
println stu.getUsername()

// 使用点的方式来赋值和获取字段
stu.email = "wangwu@qq.com"
println stu.email

// 调用无权限修饰符的字段的 setter/getter
stu.setAge(50)
println "age = " + stu.getAge()

// 调用默认带有的具名构造器
Student ss = new Student(username: "haha", email: "www.@@.com", age: 50)
println "username="+ss.getUsername()+", email="+ ss.email+", age=" + ss.getAge()