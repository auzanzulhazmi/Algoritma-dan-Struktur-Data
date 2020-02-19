/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programLingkaran;

/**
 *
 * @author ROG STRIX
 */
public class Lingkaran {
double PHI = 3.14;
double r;

double hitungLuas(){
    return PHI*r*r;
}
double hitungKeliling(){
    return PHI*(2*r);
}
}