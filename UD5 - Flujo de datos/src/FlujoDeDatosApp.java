import java.util.Scanner;
import javax.swing.JOptionPane;

public class FlujoDeDatosApp {
	static Scanner teclat = new Scanner(System.in);
	static final double IVA = 0.21;

	public static void main(String args[]) {
		String nombre = "Alvaro", dia = null, contra = "12as", operador = null;
		int num1 = 25, num2 = 5, num3 = 0, numeroVentas = 0;
		double radio = 0, precio = 0;
		comparacion(num1, num2);
		bienvenida(nombre);
		bienvenidaJframe(nombre);
		areCirculo(radio);
		numeroDivisible(num3);
		producto(precio);
		bucle();
		buclefor();
		buclefor2();
		ventas(numeroVentas);
		ejercicioSwitch(dia);
		contraseña(contra);
		calculadoraInversa(num1, num2, operador);
	}

	public static void comparacion(int num1, int num2) {
		System.out.println("Ejercicio 1");
		if (num1 == num2) {
			System.out.println("Num1 es igual a Num2\n");
		} else {
			if (num1 > num2) {
				System.out.println("Num1 es mayor\n");
			} else {
				System.out.println("Num2 es mayor\n");
			}
		}
	}

	public static void bienvenida(String nombre) {
		System.out.println("Ejercicio 2");
		System.out.println("Bienvenido " + nombre + "\n");
	}

	public static void bienvenidaJframe(String nombre) {
		System.out.println("Ejercicio 3");
		nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		System.out.println("Bienvenido " + nombre + "\n");
	}

	public static void areCirculo(Double radio) {
		System.out.println("Ejercicio 4");
		try {
			radio = Double.parseDouble(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		System.out.println("El resultado es " + Math.PI * Math.pow(radio, 2) + "\n");
	}

	public static void numeroDivisible(int numero) {
		System.out.println("Ejercicio 5");
		try {
			numero = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		if (numero % 2 == 0) {
			System.out.println("Es divisible entre dos\n");
		} else {
			System.out.println("No es divisible entre dos\n");
		}
	}

	public static void producto(double precio) {
		System.out.println("Ejercicio 6");
		try {
			precio = Double.parseDouble(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		System.out.println("El precio es de " + (precio * IVA + precio));
	}

	public static void bucle() {
		int i = 1;
		System.out.println("Ejercicio 7");
		while (i <= 100) {
			System.out.print(i + "\t");
			i++;
		}
	}

	public static void buclefor() {
		System.out.println("\nEjercicio 8");
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + "\t");
		}
	}

	public static void buclefor2() {
		System.out.println("\nEjercicio 9");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + "\t");
			}
		}
	}

	public static void ventas(int numeroVentas) {
		int numeroVendidas = 0, sumaVentas = 0;
		System.out.println("\nEjercicio 10");
		try {
			numeroVentas = Integer.parseInt(teclat.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Error el formato es incorrecto " + e);
		}
		for (int i = 1; i <= numeroVentas; i++) {
			try {
				numeroVendidas = Integer.parseInt(teclat.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Error el formato es incorrecto " + e);
			}
			sumaVentas = sumaVentas + numeroVendidas;
		}
		System.out.println("La suma total es de " + sumaVentas);
	}

	public static void ejercicioSwitch(String dia) {
		System.out.println("\nEjercicio 11");
		dia = teclat.nextLine().toLowerCase();
		switch (dia) {
		case "lunes":
			System.out.println("Es lunes");
			break;
		case "martes":
			System.out.println("Es martes");
			break;
		case "miercoles":
			System.out.println("Es miercoles");
			break;
		case "jueves":
			System.out.println("Es jueves");
			break;
		case "vienes":
			System.out.println("Es viernes");
			break;
		case "sabado":
			System.out.println("Es sabado");
			break;
		case "domingo":
			System.out.println("Es domingo");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + dia);
		}
	}

	@SuppressWarnings("unused")
	public static void contraseña(String contraseña) {
		String pruebaContraseña = null;
		int intentos = 0;
		boolean acierto = false;
		System.out.println("Ejercicio 12");
		while (acierto = false || intentos < 3) {
			pruebaContraseña = teclat.nextLine();
			intentos++;
			if (pruebaContraseña.equalsIgnoreCase(contraseña)) {
				acierto = true;
				System.out.println("Enhorabuena");
			}
		}
	}

	public static void calculadoraInversa(int numero1, int numero2, String operador) {
		System.out.println("\nEjercicio 11");
		operador = teclat.nextLine();

		switch (operador) {
		case "+":
			System.out.println(numero1 + numero2);
			break;
		case "-":
			System.out.println(numero1 - numero2);
			break;
		case "*":
			System.out.println(numero1 * numero2);
			break;
		case "/":
			System.out.println(numero1 / numero2);
			break;
		case "^":
			System.out.println(Math.pow(numero1, numero2));
			break;
		case "%":
			System.out.println(numero1 % numero2);
			break;
		default:
			System.out.println("No es un operador");
			break;
		}
	}
}
