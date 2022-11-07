import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Tourist } from './tourist';

@Injectable({
  providedIn: 'root'
})
export class TouristService {

  baseurl="http://localhost:9020/api/v1/tourist"

  constructor(private http:HttpClient) { }

  registerTourist(tourist:Tourist):Observable<Tourist>
  {
    return this.http.post<Tourist>(`${this.baseurl}/register`,tourist);
  }

  getAllTourists():Observable<Tourist[]>{
    return this.http.get<Tourist[]>(`${this.baseurl}/getAll`);
  }
}
