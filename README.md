# springboot_vue
  自己摸索并搭建然后实现的前后端分离 。
  
  后端采用当前流行的springboot
  
  前端采用vue


demo为前端 端口为8080


src则是后端 端口为8880


开发环境：
  IDEA+Mysql+springboot+Vue
开发步骤

    1  本地搭建sringboot项目并自己写一个后台逻辑这里不细说不懂自己看代码。
    
    2  首先本地需要安装好node.js
    
    3  开始搭建vue环境
    
        2.1 右键项目名称找到  "open in Terminal"
        
        2.2 输入  vue init webpack project-name（这里为你的项目名称 列我的为demo）
        
        2.3 提示目录已存在，是否继续：Y
        
        2.4 Project name（工程名）:回车
        
        2.5 Project description（工程介绍）：回车
        
        2.6 Author：kodak（作者名）
        
        2.7 Vue build（是否安装编译器）:回车
        
        2.8 Install vue-router（是否安装Vue路由）：回车
        
        2.9 Use ESLint to lint your code（是否使用ESLint检查代码，我们使用idea即可）：n
        
        3.0 Set up unit tests（安装测试工具）：n
        
        3.1 Setup e2e tests with Nightwatch（也是测试相关）：n
        
        3.2 Should we run `npm install` for you after the project has been created? (recommended)：选择：No, I will handle that myself
        
4 搭建好了之后目录结果下会出现你刚刚输入的对应的项目名称并打开
    有
      build  （各种编译用的配置文件详细看package.json中的scripts里面一般有调用的。）
      
      config  （开发环境  注意需要index.js中配置反向代理）
      
      node_modules （应该是一些依赖包）
      
      src           （开发的地方）
      
          assets    （存放图片、UI设计的图标文件 ）
          
          components  （自研的业务型及通用型组件  也就是说自己写的vue就扔这里）
          
          router      （项目的路由管理模块）
          
          App.vue     （默认的首页）
          
          main.js     （入口）
          
      static    （静态文件吧）
        
  后续会集成shiro + redis 实现一些简单的小功能 。仅未自己成长技术！
  2019-8-19 23点29分
  
