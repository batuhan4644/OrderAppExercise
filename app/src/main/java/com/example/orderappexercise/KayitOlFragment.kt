package com.example.orderappexercise

import android.graphics.Color
import android.os.Bundle
import android.os.PatternMatcher
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.RenderProcessGoneDetail
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_kayit_ol.*
import kotlinx.android.synthetic.main.fragment_kayit_ol.view.*


class KayitOlFragment : Fragment() {
 override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
     val tasarim = inflater.inflate(R.layout.fragment_kayit_ol, container, false)

 tasarim.buttonKayıtOl.setOnClickListener {

     //Email adres kontrol
     if(tasarim.editTextEmail.text.toString().isValidEmail()){
         //Sifre uzunluğu kontrol
         if(tasarim.editTextSifre.text.length >= 8){
             //Checkbox işaretli mi
             if(tasarim.checkBox.isChecked){
                //her sey dogruysa diger sayfaya gecicek
                 Navigation.findNavController(it).navigate(R.id.siparisEkraninaGecis)
             }else{
                 Toast.makeText(activity,"Lütfen Metni işaretlediğini kontrol et",Toast.LENGTH_LONG).show()

             }
         }else{
             Toast.makeText(activity, "Şifre 8 ve ya daha uzun olmalı", Toast.LENGTH_LONG).show()

         }
     }else{
         Toast.makeText(activity, "Lütfen mail adresini kontrol et.", Toast.LENGTH_LONG).show()
     }


 }

 return tasarim

}



private fun String.isValidEmail() =
    !TextUtils.isEmpty(this) && Patterns.EMAIL_ADDRESS.matcher(this).matches()

}