<template>
  <div id="register">
    <table align="center"  cellspacing="1" width="70%">
      <tr  bgcolor="white">
        <td colspan="2">用户注册</td>
      </tr>
      <tr bgcolor="white">
        <td>用户名:<input type="text" v-model="user.username"/></td>
      </tr>

      <tr bgcolor="white">
        <td>密&nbsp;码:
       <input type="password" v-model="user.password" />
        </td>
      </tr>

      <tr bgcolor="white">
        <td colspan="2">
          <input type="submit" @click="register" value="注册"/>
          <input type="submit" @click="login" value="返回"/>
        </td>

      </tr>

    </table>
  </div>

</template>

<script>
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
        register(){
          var user={
            username: this.username,
            password: this.password
          }
          this.$axios.post("/springboot/user/register",this.user).then(result=>{
            console.log(result);
            if (result.data.code==200){
              alert(result.data.msg);
              this.$router.push({
                path:'/login'
              })
            }else {
              alert(result.data.msg);
              this.$router.push({
                path:'/register'
              })
            }
          }).catch(result=>{

            console.log(result)
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

<style scoped>

</style>
