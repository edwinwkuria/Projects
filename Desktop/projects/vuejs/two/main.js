//Vue components
Vue.component('item-list',{
  'props':['item'],
  'template': '<li>{{ item}}</li>'
})

var animals = ['Rabbit','Cow','Goat','Sheep','Chicken']
var userslist = ['Edwin','Wachira','Kuria']
//The vue instance
var myfirstvue = new Vue ({
  'el': '#greeting',
  'data':{
    'one': 0,
    'two': 0,
    'message':'Vue is awesome',
    'value': 'btn btn-primary',
    'visibility': false,
    'isActive': true,
    'userslist': userslist,
    'animals': animals,
    'event': 'click'
  },
  'computed':{
    result: function(){
      var three  = this.one + this.two;
      return three
    },
    convertstouppercase: function() {
      return this.message = this.message.toUpperCase();
    },
    convertstolowercase: function(){
      return this.message = this.message.toLowerCase();
    }

  }
})
