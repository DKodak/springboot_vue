<template>
      <table id="login" align="center" >
        <tr>
          <td colspan="2">用户登录</td></tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" v-model="user.username"/></td>
          </tr>

        <tr>
          <td>密码:</td>
          <td><input type="password" v-model="user.password"/></td>
        </tr>

        <tr align="center" >

         <td colspan="2">
           <input type="submit"   @click="login" value="登录"/>
           <input type="submit"   @click="register" value="注册"/></td>
        </tr>
      </table>
</template>

<script type="text/javascript">
  import  qs from 'qs'
  import axios from 'axios'

    export default {
     data(){
       return{
         user:{
           username:'',
           password:''
         }

       }
     },
      methods:{
       login(){
         console.log(this.user.username+"  "+this.user.password);
         var user={
           username: this.username,
           password: this.password
         }
        this.$axios.post("/springboot/user/login",this.user).then(result=>{
           console.log(result);
           if (result.data.code==200){
             alert(result.data.msg);
             this.$router.push({
               path:'/success'
             })
           }else {
             this.user.password='';
             alert(result.data.msg);
             this.$router.push({
               path:'/login'
             })
           }
         }).catch(result=>{
           console.log(result)
         })


       },
        register(){
          this.$router.push( {
            path:'/register'
          })
        }
      }
    }
</script>

<style scoped>

</style>
