<template>
  <div class="container">
  <div class="row" style="margin-top:20px; text-align:center">
    <table  class="table table-bordered " style="text-align: center">
      <tr bgcolor="white">
          <td><span>ID</span></td>
          <td><span>员工姓名</span></td>
          <td><span>操作</span></td>
      </tr>
      <tr v-for="u in userlist" bgcolor="white">
        <td name="user.id"><span>{{u.id}}</span></td>
        <td name="user.username"><span>{{u.username}}</span></td>
        <td>
          <a href="javascript:void(0)" @click="toupd(u.id)" >修改</a>
          <a href="javascript:void(0)" @click="del(u.id)">删除</a>
        </td>
      </tr>
      <tr>

      </tr>
    </table>
    <router-link to="/">返回</router-link>
  </div>
  </div>
</template>

<script>
  import axios from 'axios'
    export default {
       data(){
         return{
           user:{
             id:'',
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
         },
        update(){

        },
        del(id){
           var  bln=confirm("是否确认删除数据！");
           if (!bln){
             return false;
           }
           this.$axios.post("/springboot/user/delete?id="+ id).then(result=>{
              if (result.data.code==200){
                alert(result.data.msg);
                this.all();
              }else {
                alert(result.data.msg);
              }
           })
        },
      }
    }
</script>

<style scoped>

</style>
