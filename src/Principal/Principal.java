package Principal;

import java.util.Scanner;

public class Principal {

	class triangulo {
		

		private static int c3;
		private static int a1;
		private static int b2;

		public static void main (String args[]) {
		}

		public static int getC3() {
			return c3;
		}

		public static void setC3(int c3) {
			triangulo.c3 = c3;
		}

		public static int getA1() {
			return a1;
		}

		public static void setA1(int a1) {
			triangulo.a1 = a1;
		}

		public static int getB2() {
			return b2;
		}

		public static void setB2(int b2) {
			triangulo.b2 = b2;
		}
	}

	private byte a1;
	private byte b2;
	private byte c3;
			public void ler (Scanner leitor) {
				System.out.println(" Digite o primeiro angulo:");
				setA1(leitor.nextByte());
				
				System.out.println("Digite o segundo angulo:");
				setB2(leitor.nextByte());
				
				System.out.println("Digite o terceiro angulo");
				setC3(leitor.nextByte());
			}
		
			public void calcular_exibir () {
			
				if ( (a1 == 90) || (b2 == 90) || (c3 == 90)) {
					System.out.println(" É um triangulo equilatero.");}
				
				else if ( (a1 > 90) || (b2 > 90) || (c3 > 90)) {
					System.out.println(" É um triangulo Escaleno.");}
				
				else if ( (a1 < 90) || (b2 < 90) || (c3 < 90)) {
					System.out.println("É um triangulo Isóceles.");}
				}
			

			public byte getA1() {
				return a1;
			}

			public void setA1(byte a1) {
				this.a1 = a1;
			}

			public byte getB2() {
				return b2;
			}

			public void setB2(byte b2) {
				this.b2 = b2;
			}

			public byte getC3() {
				return c3;
			}

			public void setC3(byte c3) {
				this.c3 = c3;
			}
		}
