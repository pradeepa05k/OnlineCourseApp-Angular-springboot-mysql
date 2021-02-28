import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { Courses } from "./courses/courses.component";
import { Home } from "./home/home.component";
import { LoginComponent } from "./login/login.component";
import { Register } from "./register/register.component";

const routes: Routes = [
 
  {
    path: "Courses",
    component: Courses,
    data: []
  },
  {
    path: "login",
    component: LoginComponent,
    data: []
  },
  {
    path: "search/:key",
    component: Courses,
    data: []
  },
  {
    path: "register",
    component: Register,
    data: []
  },
  {
    path: "home",
    component: Home,
    data: []
  },

  {
    path: "",
    component: Home,
    data: []
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
