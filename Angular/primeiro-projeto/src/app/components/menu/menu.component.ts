import { Menu } from './../../models/interface/menu';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  objMenu: Menu[] = [
    {title: 'Home', url: '/home'},
    {title: 'Contato', url: '/contato'}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
