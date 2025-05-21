import axios from 'axios';
import React, { useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'

export default function AgregarEmpleado() {
    let navegacion = useNavigate();

    const [empleado, setEmpleado] = useState({
        nombre: "",
        departamento: "",
        sueldo: ""        
    })

    const{nombre, departamento, sueldo} = empleado;

    const onInputChange = (e) => {
        // spread operator... (expandir los atributos)
        setEmpleado({...empleado, [e.target.name]: e.target.value})
    }

    const onSubmit = async (e) => {
        e.preventDefault(); // para que no se muestren los datos en la url
        const urlBase = "http://localhost:2204/rh-app/empleados";
        console.log(empleado)
        await axios.post(urlBase, empleado);
        // redireccionamos al inicio
        navegacion('/')
    }

  return (
    <div className='container'>
        <div className='container text-center' style={{margin: "30px"}}>
            <h3>Agregar Empleado</h3>
        </div>
        <form onSubmit={(e) => onSubmit(e)}>
        <div className="mb-3">
            <label htmlFor="nombre" className="form-label">Nombre</label>
            <input type="text" className="form-control" 
                    name='nombre' id="nombre" 
                    value={nombre} onChange={(e)=>onInputChange(e)} required={true}/>
        </div>
        <div className="mb-3">
            <label htmlFor="departamento" className="form-label">Departamento</label>
            <input type="text" className="form-control" name='departamento' id="departamento"
                     value={departamento} onChange={(e)=>onInputChange(e)} />
        </div>
        <div className="mb-3">
            <label htmlFor="sueldo" className="form-label">Sueldo</label>
            <input type="number" step="any" className="form-control" name='sueldo' id="sueldo"
                        value={sueldo} onChange={(e)=>onInputChange(e)}/>
        </div>
        <div className='text-center'>
            <button type="submit" className="btn btn-warning btn-sm me-3">Agregar</button>
            <Link to='/' className='btn btn-danger btn-sm'>Regresar</Link>
        </div>
        </form>
    </div>
  )
}
