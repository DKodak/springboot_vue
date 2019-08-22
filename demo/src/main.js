// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
//需要引入什么文件这里引入
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'  //引入axios并页面使用axios发送请求
import cong from '../vue.config.js'
import $ from 'jquery'   //3 定义全局jquery
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap/dist/js/bootstrap.min.js'




//这里定义全局变量
Vue.config.productionTip = false
Vue.prototype.$axios = axios  //定义axios全局变量
Vue.prototype.$cong=cong  //定义cong全局变量
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
