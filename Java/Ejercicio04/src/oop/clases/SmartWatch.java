package oop.clases;

    public class SmartWatch extends SmartDevice {

        public SmartWatch(String color, String fabricante, String modelo, String procesador, Double peso, Double precio) {
            super(color, fabricante, modelo, procesador, peso, precio);
        }

        @Override
        public String toString() {
            return "SmartWatch{" +
                    "color='" + color + '\'' +
                    ", fabricante='" + fabricante + '\'' +
                    ", modelo='" + modelo + '\'' +
                    ", procesador='" + procesador + '\'' +
                    ", peso=" + peso +
                    ", precio=" + precio +
                    '}';
        }
    }
