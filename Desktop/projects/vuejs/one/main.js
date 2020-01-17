// register modal component
Vue.component('modal', {
  template: '#modal-template'
})

// start app
new Vue({
  el: '#app',
  data: {
    showModal: false
  }
})

var app3 = new Vue({
  el: '#app-3',
  data: {
    seen: true
  }
})
