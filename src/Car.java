public class Car {
        private String make, model;
        private int year;
        private boolean engineStatus;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.engineStatus = false;
        }

        public void startEngine() {
            engineStatus = true;
            System.out.println("Động cơ đã được khởi động.");
        }

        public void stopEngine() {
            engineStatus = false;
            System.out.println("Động cơ đã được tắt.");
        }

        public void displayCarInfo() {
            System.out.println("Thông tin xe: " + make + " " + model + " " + year + ", Trạng thái động cơ: " + (engineStatus ? "Đang chạy" : "Đã tắt"));
        }

        public static void main(String[] args) {
            Car myCar = new Car("Toyota", "Camry", 2022);
            myCar.displayCarInfo();
            myCar.startEngine();
            myCar.displayCarInfo();
            myCar.stopEngine();
            myCar.displayCarInfo();
        }
    }


