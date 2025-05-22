import axios from 'axios';
import React, { useState, useEffect } from 'react'
import { NumericFormat } from 'react-number-format';
import { Link } from 'react-router-dom';

export default function ListadoEmpleados() {

    const urlBase = "http://localhost:2204/rh-app/empleados";

    const[empleados, setEmpleados] = useState([]);

    // Se ejecuta al cargar la página
    useEffect(() => {
        cargarEmpleados();
    },[]); // [] indicar vacio para que se ejecute solo 1 vez

    const cargarEmpleados = async () => {
        const resultado = await axios.get(urlBase);
        console.log("Resultado de cargar empleados");
        console.log(resultado.data)
        setEmpleados(resultado.data)
    }

    const eliminarEmpleado = async (id) => {
        await axios.delete(`${urlBase}/${id}`)
        cargarEmpleados();
    }

  return (
    <div className='container'>
        <div className='container text-center' style={{margin: "30px"}}>
            <h3>Sistema de recursos humanos</h3>
        </div>
        <table className="table table-striped table-hover align-middle">
            <thead className='table-dark'>
                <tr>
                <th scope="col">Id</th>
                <th scope="col">Empleado</th>
                <th scope="col">Departamento</th>
                <th scope="col">Sueldo</th>
                <th>Acciones</th>
                </tr>
            </thead>
            {
                empleados.map((empleado, indice) => (
                <tbody>
                    <tr key={indice}>
                    <th scope="row">{empleado.idEmpleado}</th>
                        <td>{empleado.nombre}</td>
                        <td>{empleado.departamento}</td>
                        <td>
                            <NumericFormat value={empleado.sueldo} displayType={'text'}
                                            thousandSeparator=',' prefix='$ '
                                            decimalScale={2} fixedDecimalScale>

                            </NumericFormat>
                        </td> 
                        <td className='text-center'>
                            <div>
                                <Link to={`/editar/${empleado.idEmpleado}`}
                                        className='btn btn-warning me-3'>Editar</Link>
                                <button onClick={() => eliminarEmpleado(empleado.idEmpleado)}
                                        className='btn btn-danger btn-sm'>Eliminar</button>
                            </div>
                        </td>
                    </tr>
                </tbody>
                ))
            }
            </table>
    </div>

  )
}
