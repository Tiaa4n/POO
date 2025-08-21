public class Taller {
    public static void main(String[] args) {
        double d1 = 42.0, d2 = 58.5, d3 = 37.2;
        double t1 = 0.9, t2 = 1.4, t3 = 0.8;
        double l1 = 5.1, l2 = 6.9, l3 = 4.3;
        double precioLitro = 1.35;
        double masaCargaKg = 1200;
        double largo = 2.0, ancho = 1.2, alto = 1.1;
        double p1 = 2.5, p2 = 3.0, p3 = 2.0;
        double deprecPorKm = 0.08;
        double volCamionM3 = 10.0;
        double fCO2 = 2.68;
        double galPorLitro = 0.264172;
        double vmin = 30.0, vmax = 90.0;
        double va = 40.0, vb = 80.0, ca = 0.05, cb = 0.09;
        double a = -0.0008, b = 0.08, c = 4.0;
       

        

       System.out.println(d1/t1);
       System.out.println(d2/t2);
       System.out.println(d3/t3);
       double v1 = (46.67);
       double v2 = (41.79);
       double v3 = (46.50);
       System.out.println((d1*v1+d2*v2+d3*v3)/(d1+d2+d3));
       double vprom = (44.55);
       System.out.println(d1/l1);
       System.out.println(d2/l2);
       System.out.println(d3/l3);
       double klm1 = (8.24);
       double klm2 = (8.48);
       double klm3 = (8.65);
       System.out.println((d1+d2+d3)/(l1+l2+l3));
       double kmltotal = (8.44);
       System.out.println((l1+l2+l3)*precioLitro);
       double comb = (22.00);
       System.out.println((d1+d2+d3)*deprecPorKm);
       double dep = (11.01);
       System.out.println(p1+p2+p3);
       double peajes = (7.50);
       System.out.println(comb+dep+peajes);
       double directo = (40.52);
       System.out.println(directo/(d1+d2+d3));
       double costokm = (0.2942);
       System.out.println(largo*ancho*alto);
       double volumenM3 = (2.64);
       System.out.println(masaCargaKg/volumenM3);
       double densidad = (454.55);
       System.out.println(volumenM3/volCamionM3);
       double ocupacion = (0.264);
       System.out.println((l1+l2+l3)*fCO2);
       double co2total = (43.68);
       System.out.println(co2total/(d1+d2+d3));
       double co2porKm = (0.317);
       System.out.println(vprom*(1000/3600));
       System.out.println((l1+l2+l3)*galPorLitro);
       double galtotal = (4.3060);
       System.out.println((v1+v2+v3)/3);
       double vmedia = (44.984);
       System.out.println(Math.sqrt(((Math.pow(v1-vmedia,2))+(Math.pow(v2-vmedia,2))+(Math.pow(v3-vmedia,2)))/3));
       double sigma = (2.26);
       System.out.println((t1*v1+t2*v2+t3*v3)/(t1+t2+t3));
       double vpondt = (44.419);
       System.out.println(ca+(cb-ca)*(vprom-va)/(vb-va));
       double cvprom = (0.05455);
       System.out.println(cvprom*(d1+d2+d3));
       double costomant = (7.511);
       System.out.println(a * (vprom * vprom) + b * vprom + c);
       double kmlModelo = (5.976);
       System.out.println((d1+d2+d3)/kmlModelo);
       double litrosModelo = (23.041);
       double w1 = (0.25);
       double w2 = (0.25);
       double w3 = (0.25);
       double w4 = (0.25);
       System.out.println((w1+w2+w3+w4));
       System.out.println(w1*(1/costokm) + w2*kmltotal + w3*(1/co2porKm) + w4*(1/(1+sigma)));
       double score = (3.82);

       


       

       



    

       



        

        


        

        






        
    }
    
}
