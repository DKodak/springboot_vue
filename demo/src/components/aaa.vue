<template>
  <div>
    我是aaa
    <button @click="back">点我返回</button>
  </div>

</template>

<script>
  export default {
    methods:{
      back(){
        this.$router.push('/')
      }
    }
  }
</script>
