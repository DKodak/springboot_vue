<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button @click="go">点我跳转</button>
    <button @click="login">点我登录</button>
  </div>

</template>
<script>
  export default {
    data(){
      return{
        msg:'第一个springboot+vue实现前后端分离的项目'
      }
    },
    methods:{
      go(){
        this.$router.push({
          path:'/aaa'
        })
      },
      login(){
        this.$router.push( {
            path:'/login'
          })
      }
    }
  }

</script>
