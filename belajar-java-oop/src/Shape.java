class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner(){
        return 4;
    }

    //Untuk mengambil value dari parentnya, dapat menggunakan keyword super
    int getParentCorner(){
        return super.getCorner();
    }
}