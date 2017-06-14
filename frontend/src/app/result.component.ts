import {Component} from '@angular/core';
import {AppService} from './app.service';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html'
})

export class ResultComponent {

  inputArray: string;
  results: Result[];
  errorMessage: string;
  inputTitle = 'Enter an array of doubles, separated by commas';
  constructor(private appService: AppService) {

  }

  getResults() {
    this.appService.getResults()
      .subscribe(res => {
        this.results = res;
      });
  }

  clearResults() {
    this.appService.clearResults()
      .subscribe(res => {
        this.results[0] = res;
        return res;
      });
  }

  addSort() {
    this.appService.addSort('[' + this.inputArray + ']')
      .subscribe((data) => this.inputArray,
        error => this.errorMessage = <any>error + 'Please enter valid data');
    console.log(this.errorMessage);
    setTimeout(() => this.getResults(), 500);
    this.inputArray = '';
  }
}


export interface Result {
  id: number;
  sortedArray: string;
  changeCount: number;
  timeEstimate: string;
}
