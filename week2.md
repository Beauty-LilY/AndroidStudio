## 1.
突然发现了为什么week1的时候用‘#’无法打出标题，原来是因为‘#’和字符之间要有空格
## 2.
终于在我的不懈努力下成功将git接入了androidstudio，但是要怎么严谨的上传我还是一头雾水。我决定先在学习一下代码，上传什么的等过两天再说吧，，，今天已经把一天的时间花在github上了，是因为我比较笨吗？在这上面花什么久时间。
## 3.
有一种写一行代码就回出现一个bug的感觉。
照着书本一模一样写的代码：
```
switch(item.getItemId()){
    case R.id.add_item:
        Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
        break;
    case R.id.remove_item:
        Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
        break;
    default:
}
return true;
```
==代码报错提示 “错误：需要常量表达式”==

在试了很多方法之后改成：if语句
```
if (item.getItemId() == R.id.add_item) {  
    Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();  
    return true;  
} else if (item.getItemId() == R.id.remove_item) {  
    Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();  
    return true;  
}  
return super.onOptionsItemSelected(item);
```
## 4.
忘记了AndroidManifest会自动生成activity,自己又写了一遍然后一直报错，找了很久bug又刷新了很多次都没发现bug在哪。最后是把代码全都发给ai才找到错处（截屏都没用）。


<!--stackedit_data:
eyJoaXN0b3J5IjpbLTQzMDcxNzc5NiwtMTk0NDI1NjIwN119
-->