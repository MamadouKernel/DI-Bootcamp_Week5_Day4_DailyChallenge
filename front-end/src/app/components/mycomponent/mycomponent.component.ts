import { Component } from '@angular/core';
import {Myservice} from "../../services/myservice.service";

@Component({
  selector: 'app-mycomponent',
  template: `
    <div *ngFor="let json of jsonData">
      <div *ngFor="let key of keys(json)">{{ key }}: {{ json[key] }}</div>
    </div>
  `,
  styleUrls: []
})
export class MycomponentComponent {
  jsonData!: Map<string, Object>[];

  constructor(private myService: Myservice) {}

  ngOnInit() {
    this.myService
      .getData()
      .subscribe((jsonData) => (this.jsonData = jsonData));
  }
  keys(json: Map<string, Object>) {
    return Object.keys(json);
  }

}
