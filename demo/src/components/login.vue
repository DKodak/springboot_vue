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

        <tr>
          <td colspan="2"><input type="submit" @click="login" value="登录"/></td>
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
           }
         }).catch(result=>{
           console.log(result)
         })

         // this.post("localhost:8880/user/login",qs.stringify(user)).then(result =>{
         //   console.log(result.body);
         //   if (result.data().state()==200){
         //     that.$router.push({
         //       path:'/'
         //     })
         //   }
         // }).catch(function (reason) {
         //      console.log(reason)
         //    })
        // this.http.post("localhost:8880/user/login",qs.stringify(user)).then(function (params) {
        //    console.log(params);
        //    if (params.data().status===200) {
        //      that.$router.push({
        //        path:'/success'
        //      })
        //    }
        //  }).catch(function (reason) {
        //    console.log(reason)
        //  })
       }
      }
    }
</script>

<style scoped>

</style>
