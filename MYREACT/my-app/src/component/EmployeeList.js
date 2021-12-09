import React, { Component } from 'react'

 class EmployeeList extends Component {
    render() {
        return (
            <div>
                <h1>Component name:employee list</h1>
               <>{JSON.stringify(this.props)}</> 
            </div>
        )
    }
}

export default EmployeeList;
