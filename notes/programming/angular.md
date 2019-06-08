### Angular

### Components
app.component.ts - .ts files is where the logic lives.
app.component.spec.ts - .spec.ts is where the test files are put.
Any component or module that is imported must also be imported in the @NgModule section of the app.module.ts

## Forms 
They are the heart if many enterprise applications.

### Important
When you want to reuse a component inside another component you use the name of the *selector string* 
In order to do anything with Http such as receiving response from spring boot or sending http requests to spring boot we must define it in our app.module.ts *HttpClientModule*

When a request is successful you can use location.reload(); to reload a page
    
## Flow
Define routes in the app.module.ts
RouterModule.forRoot(varName) will be the router module for the entire application include {enableTracing:true} these logs are useful when debugging complex applications
Bootstrap components in the app.module.ts
put <router-outlet></router-outlet> in app.component.html to display main views
use routerLinks within the other-apps.component.html to navigate to those components

## Form validation Angular
Don't forget #alias-name
[(ngModel)]="model.name" 
    #name="ngModel"
    [ngClass]=" { 'is-invalid': f.submitted && name.invalid } " 
    required/>

### Questions
## What is a component? 
A component is a logical structure that *controls part of the screen.*
-They encapsulate views, logic, and styles.
-Your entire application is a component tree. Parent-child-child

## What is routing?
Enables navigaton from one view(component) to the next based on some user input(click, url change)
