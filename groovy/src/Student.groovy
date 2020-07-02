/*
    groovy 作为一种脚本语言, 不需要修饰符
    1. 可省略分号
    2. 可省略 setter/getter方法,无权限修饰符,编译器会自动生成
    3. 可省略return
    4. 默认带有具名构造器
 */

class Student {
    private String username // 可省略分号, 此field没有setter/getter
    private String email    //
    int age                 // 自动生成 setter/getter

    String getUsername(){
        username
    }

    void setUsername(String username){
        this.username = username
    }
}
