/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.favoritethingsarray;

/**
 *
 * @author Kylee
 */
public class FavoriteThingsArray {

    public static void main(String[] args) {
      
        String[] favorites = {
            "Money",
            "Makeup",
            "Food",
            "Pink Stuffs",
            "Kitchen Tools"
        };

        System.out.println("==============================");
        System.out.println("       My Favorite Things");
        System.out.println("==============================");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("==============================");
        System.out.println("Total Favorites: " + favorites.length);
    }
}
