import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom'

export default function EditarEmpleado() {
    const urlBase = "http://localhost:2204/rh-app/empleados";

    let navegacion = useNavigate();

    const {id} = useParams();

    const [empleado, setEmpleado] = useState({
        nombre: "",
        departamento: "",
        sueldo: ""        
    })

    const{nombre, departamento, sueldo} = empleado;

    // Se ejecuta cuando se carga el componente
    useEffect(() => {
        cargarEmpleado();
    }) 

    const cargarEmpleado = async () => {
        const resultado =  await axios.get(`${urlBase}/${id}`);
        setEmpleado(resultado.data);
    }

    const onInputChange = (e) => {
        // spread operator... (expandir los atributos) 
        setEmpleado({...empleado, [e.target.name]: e.target.value})
    }

    const onSubmit = async (e) => {
        e.preventDefault(); // para que no se muestren los datos en la url
        console.log(empleado)
        await axios.post(urlBase, empleado);
        // redireccionamos al inicio
        navegacion('/')
    }

  return (
    <div className='container'>
        <div className='container text-center' style={{margin: "30px"}}>
            <h3>Editar Empleado</h3>
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
            <button type="submit" className="btn btn-warning btn-sm me-3">Actualizar</button>
            <Link to='/' className='btn btn-danger btn-sm'>Regresar</Link>
        </div>
        </form>
    </div>
  )
}
