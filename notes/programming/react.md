### What is React?
React is a library for building user interfaces
*Goal of building a better UI*

### What make react special?
Follows just four principles composition, Unidirectional Dataflow, Explicit Mutation, Just JavaScript
## Composition 
Components that you compose together think of them as widgets. 
Think about composition of functions when using components with react

## Unidirectional Dataflow
 jQuery event handler -> update Dom(State)
 React event handler -> State lives in individual components -> UI
 Think state and how UI looks based on the state. 
 React renders the UI

## Explicit Mutation
State is data in your app and react handle the UI
You do this and react will handle everything else. React will see the previous state and when it is changed react will update the view.
this.setState ({
    handle: 'julianrios',
    authed: true
})

## What is shared mutual state?
When the state of one thing is dependent on another.

## JavaScript
Get comfortable with javascript and es6

### Important
Props are just information that you pass into a component. 
Props are another word for attributes in React
JSX is syntactic sugar for React.createElement



### FAQs
## How do you build a large app?
Build it by using a bunch of small components.

## Whats the difference between a react component and a react element?
A component is a function or class which optionally accepts input and returns a react element.


