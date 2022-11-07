import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Tourist } from '../tourist';
import { TouristService } from '../tourist.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  tourist:Tourist=new Tourist();
  touristForm:FormGroup;

  constructor(private service:TouristService,private fb:FormBuilder,private snackbar:MatSnackBar,private router:Router) { }

  ngOnInit(): void {
    this.touristForm=this.fb.group({
      id:['',[Validators.required,Validators.max(9999)]],
      firstName:['',[Validators.required,Validators.maxLength(15),Validators.pattern('[a-zA-Z ]*')]],
      lastName:['',[Validators.required,Validators.maxLength(12),Validators.pattern('[a-zA-Z ]*')]],
      gender:['',Validators.required],
      age:['',[Validators.required,Validators.min(10),Validators.max(90)]],
      fromPlace:['',[Validators.required,Validators.pattern('[a-zA-Z ]*')]],
      numberOfDays:['',[Validators.required]]
    })
  }

  register(){
    if(this.touristForm.valid)
    {
      this.service.registerTourist(this.tourist).subscribe(data=>{
        this.snackbar.open("Tourist Registered","close", {
          duration:2000
        });
        this.router.navigate(['view'])
      },error=>{alert("error")})
    }
    
  }

}
