import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';
import {Result} from './result.component';
import {Observable} from 'rxjs/Observable';

@Injectable()

export class AppService {

  private constUrl = 'http://localhost:8888/hm';
  private result: Result;

  constructor(private http: Http) {}

  getResults(): Observable<Result[]> {
    return this.http
      .get(this.constUrl + '/fetchAll')
      .map(res => {
        res.json();
        return res.json();
      })
      .catch(this.handleError);
  }

  clearResults(): Observable<Result> {
    return this.http
      .delete(this.constUrl + '/cleanup')
      .map(res => {
        res.json();
        return res.json();
      })
      .catch(this.handleError);
  }

  addSort(inputArray: string): Observable<Result> {
    console.log(inputArray);
    console.log(JSON.parse(inputArray));
    return this.http
      .post(this.constUrl + '/addNew', JSON.parse(inputArray))
      .map(res => res.json())
      .catch(this.handleError);
  }

  private handleError(error) {

    let errorMessage: string;
    if (error instanceof Response) {
      let body = error.json() || '';
      let err = body.err || JSON.stringify(body);
      errorMessage = `${error.status} - ${error.statusText} || ''} ${err}`;
    } else {
      errorMessage = error.message ? error.message : error.toString();
    }
    return Observable.throw(errorMessage);
  }
}
