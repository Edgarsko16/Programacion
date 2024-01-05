/* Escribe un programa en Java que lea el año de nacimiento y le calcule y muestre la edad que tiene. */
        int anyoNacimiento;
        int anyoActual = 2024;
        int edad;
        System.out.println("Dime tu año de nacimiento");
        anyoNacimiento = lectura.nextInt();
        edad = anyoActual - anyoNacimiento;
        System.out.println("Tú edad es " + edad);
    }
