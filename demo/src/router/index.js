import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import login from '@/components/login'
import success from '@/components/success'
import aaa from '@/components/aaa'
import  register from '@/components/register'
//需要注意这里  创建了新的组件的时候需要引入

Vue.use(Router)
//配置路由  也就是访问路径
export default new Router({
  mode:'history',
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {//登录
      path:'/login',
      name:'login',
      component:login
    },
    {//返回
      path:'/aaa',
      name:'aaa',
      component:aaa
    },
    {
      //登录成功
      path: '/success',
      name: 'success',
      component: success
    },
    {
      //查询
      path:'/query',
      name:'query',
      component:success
    },{
    //注册
      path:'/register',
      name:'register',
      component:register

    },
    //删除
    {
      path:'delete',
      name:'delete',
      component:success
    },
  ]
})
