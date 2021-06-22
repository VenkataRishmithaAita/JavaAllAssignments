package com.company;
public class LatestLaptop{
        private Laptop dellModel;
        private Laptop acerModel;
        private Laptop lenovoModel;
        private Laptop HPModel;
        private Laptop appleModel;
        LatestLaptop()
        {
            dellModel=new Dell();
            acerModel=new Acer();
            lenovoModel=new Lenovo();
            HPModel=new HP();
            appleModel=new Apple();
        }
        public void getLatestDellModel()
        {
            dellModel.modelName();
            dellModel.getPrice();
        }
        public void getLatestAcerModel()
        {
            acerModel.modelName();
            acerModel.getPrice();
        }
        public void getLatestLenovoModel()
        {
            lenovoModel.modelName();
            lenovoModel.getPrice();
        }
        public void getLatestHPModel()
        {
            HPModel.modelName();
            HPModel.getPrice();
        }
        public void getLatestAppleModel()
        {
            appleModel.modelName();
            appleModel.getPrice();
        }
    }


