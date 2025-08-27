public class TallercasoB {
    public static void main(String[] args) {
        double d1 = 35.0, d2 = 72.0, d3 = 53.0;
        double t1 = 0.7, t2 = 1.6, t3 = 1.1;
        double l1 = 4.4, l2 = 9.0, l3 = 6.2;
        double precioLitro = 1.42;
        double masaCargaKg = 1450;
        double largo = 2.2, ancho = 1.3, alto = 1.0;
        double p1 = 3.2, p2 = 3.8, p3 = 2.7;
        double deprecPorKm = 0.085;
        double volCamionM3 = 12.0;
        double fCO2 = 2.64;
        double galPorLitro = 0.264172;
        double vmin = 30.0, vmax = 90.0;
        double va = 40.0, vb = 80.0, ca = 0.05, cb = 0.09;
        double a = -0.0009, b = 0.09, c = 3.8;
       
       System.out.println(d1/t1);
       System.out.println(d2/t2);
       System.out.println(d3/t3);
       double v1 = (50.00);
       double v2 = (45.00);
       double v3 = (48.18);
       System.out.println((d1*v1+d2*v2+d3*v3)/(d1+d2+d3));
       double vprom = (47.15);
       System.out.println(d1/l1);
       System.out.println(d2/l2);
       System.out.println(d3/l3);
       double klm1 = (7.95);
       double klm2 = (8.00);
       double klm3 = (8.548);
       System.out.println((d1+d2+d3)/(l1+l2+l3));
       double kmltotal = (8.163);
       System.out.println((l1+l2+l3)*precioLitro);
       double comb = (27.83);
       System.out.println((d1+d2+d3)*deprecPorKm);
       double dep = (13.60);
       System.out.println(p1+p2+p3);
       double peajes = (9.70);
       System.out.println(comb+dep+peajes);
       double directo = (51.13);
       System.out.println(directo/(d1+d2+d3));
       double costokm = (0.320);
       System.out.println(largo*ancho*alto);
       double volumenM3 = (2.860);
       System.out.println(masaCargaKg/volumenM3);
       double densidad = (506.993);
       System.out.println(volumenM3/volCamionM3);
       double ocupacion = (0.238);
       System.out.println((l1+l2+l3)*fCO2);
       double co2total = (51.74);
       System.out.println(co2total/(d1+d2+d3));
       double co2porKm = (0.323);
       System.out.println(vprom*(1000/3600));
       System.out.println((l1+l2+l3)*galPorLitro);
       double galtotal = (5.1778);
       System.out.println((v1+v2+v3)/3);
       double vmedia = (47.727);
       System.out.println(Math.sqrt(((Math.pow(v1-vmedia,2))+(Math.pow(v2-vmedia,2))+(Math.pow(v3-vmedia,2)))/3));
       double sigma = (2.06);
       System.out.println((t1*v1+t2*v2+t3*v3)/(t1+t2+t3));
       double vpondt = (47.059);
       System.out.println(ca+(cb-ca)*(vprom-va)/(vb-va));
       double cvprom = (0.05715);
       System.out.println(cvprom*(d1+d2+d3));
       double costomant = (9.144);
       System.out.println(a * (vprom * vprom) + b * vprom + c);
       double kmlModelo = (6.043);
       System.out.println((d1+d2+d3)/kmlModelo);
       double litrosModelo = (26.47);
       double w1 = (0.25);
       double w2 = (0.25);
       double w3 = (0.25);
       double w4 = (0.25);
       System.out.println((w1+w2+w3+w4));
       System.out.println(w1*(1/costokm) + w2*kmltotal + w3*(1/co2porKm) + w4*(1/(1+sigma)));
       double score = (3.677);
       

       


       

       



    

       



        

        


        

        






        
    }
    
}