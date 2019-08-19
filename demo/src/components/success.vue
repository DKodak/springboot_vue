<template>
  <div>
    <table align="center" bgcolor="blue" cellspacing="1" width="70%">
      <tr bgcolor="white">
          <td><span>ID</span></td>
          <td><span>员工姓名</span></td>
          <td><span>操作</span></td>
      </tr>
      <tr v-for="u in userlist" bgcolor="white">
        <td><span>{{u.id}}</span></td>
        <td><span>{{u.username}}</span></td>
        <td><span><a href="#">修改</a></span> <span><a href="#">删除</a></span></td>
      </tr>
      <tr>

      </tr>
    </table>
    <router-link to="/">返回</router-link>
  </div>

</template>

<script>
  import axios from 'axios'
    export default {
       data(){
         return{
           user:{
             username:'',
             password:''
           },
           userlist:[],

         }
       },
      created(){
         //进入页面的时候先加载all方法
         this.all();
      },
      methods:{
         all(){
           this.$axios.get("/springboot/user/query").then(result=>{
             console.log(result.data);
             if (result!=null){
               this.$data.userlist=result.data;
             } else {
               alert("暂无数据");
             }

           })
         }
      }
    }
</script>

<style scoped>

</style>
