var todo = new Vue ({
  'el': '#todo',
  'data':{
    'newtodo': '',
    'placeholder':'Add Item',
    'todolist':[]
  },
  'methods':{
    addItem: function(){
      this.todolist.push(this.newtodo),
      this.newtodo = ''
    }
  }
})
