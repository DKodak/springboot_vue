import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import login from '@/components/login'
import success from '@/components/success'
import aaa from '@/components/aaa'
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
    {
      path:'/login',
      name:'login',
      component:login
    },
    {
      path:'/aaa',
      name:'aaa',
      component:aaa
    },
    {
      path: '/success',
      name: 'success',
      component: success
    },
    {
      path:'/query',
      name:'query',
      component:success
    }
  ]
})
