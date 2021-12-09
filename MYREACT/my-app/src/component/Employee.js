import React, { Component } from 'react';
import EmployeeList from './Component/EmployeeList';
export class Employee extends Component {
    employees=[{name:'Ram', sal:70000},
    {name:'Deeksha', sal:80000},
];
    render() {
        return (
            <div>
                <h1>Component name:employee</h1>
              <EmployeeList emp={this.Employees} />
            </div>
        )
    }
}

export default Employee;
