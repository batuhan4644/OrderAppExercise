package com.example.orderappexercise

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import kotlinx.android.synthetic.main.fragment_kayit_ol.*
import kotlinx.android.synthetic.main.fragment_kayit_ol.view.*
import kotlinx.android.synthetic.main.fragment_siparis_ekrani.*
import kotlinx.android.synthetic.main.fragment_siparis_ekrani.view.*

class SiparisEkraniFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val tasarim = inflater.inflate(R.layout.fragment_siparis_ekrani, container, false)

        Glide.with(this)
            .load("https://images.unsplash.com/photo-1533738363-b7f9aef128ce?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=435&q=80")
            .centerCrop()
            .override(400,400)
            .into(tasarim.profilResim)

        Glide.with(this)
            .load("https://fe.dominos.com.tr/api/medium/ProductOsg/Global/_KNYL/NULL/434x404/TR")
            .centerCrop()
            .override(300,300)
            .into(tasarim.imageView2)

        Glide.with(this)
            .load("https://fe.dominos.com.tr/api/medium/ProductOsg/Global/_PSOCIAL/NULL/434x404/TR")
            .centerCrop()
            .override(300,300)
            .into(tasarim.imageView3)


         tasarim.radioGroup1.setOnCheckedChangeListener  { radioGroup, i ->
            if (R.id.radioButtonKucuk1 == i )
                tasarim.radiogroup2.setOnCheckedChangeListener { radioGroup, i ->
                    tasarim.buttonHesapla.setOnClickListener {
                        if (R.id.radioButtonKucuk2 == i)
                            tvOdemeTutari.setText("Ödemeniz Gereken Ücret 20 TL")
                        if (R.id.radioButtonOrta2 == i)
                            tvOdemeTutari.setText("Ödemeniz Gereken Ücret 25 TL")
                        if (R.id.radioButtonBuyuk2 == i)
                            tvOdemeTutari.setText("Ödemeniz Gereken Ücret 30 TL")

                    }
                }
               else {tasarim.buttonHesapla.setOnClickListener{

                Toast.makeText(activity,"Lütfen 2.tercihini yap",Toast.LENGTH_LONG).show()
            }}

        if (R.id.radioButtonOrta1 == i )
             tasarim.radiogroup2.setOnCheckedChangeListener  { radioGroup, i ->
                 tasarim.buttonHesapla.setOnClickListener{
                 if (R.id.radioButtonKucuk2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 25 TL")
                 if (R.id.radioButtonOrta2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 30 TL")
                 if (R.id.radioButtonBuyuk2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 35 TL")

                 }
             }
        else {tasarim.buttonHesapla.setOnClickListener{

            Toast.makeText(activity,"Lütfen 2.tercihini yap",Toast.LENGTH_LONG).show()
        }}
             if (R.id.radioButtonBuyuk1 == i )
             tasarim.radiogroup2.setOnCheckedChangeListener  { radioGroup, i ->
                 tasarim.buttonHesapla.setOnClickListener{
                 if (R.id.radioButtonKucuk2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 30 TL")
                 if (R.id.radioButtonOrta2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 35 TL")
                 if (R.id.radioButtonBuyuk2 == i )
                     tvOdemeTutari.setText("Ödemeniz Gereken Ücret 40 TL")

                 }
             }
             else {tasarim.buttonHesapla.setOnClickListener{

                 Toast.makeText(activity,"Lütfen 2.tercihini yap",Toast.LENGTH_LONG).show()
             }}


}
        tasarim.buttonHesapla.setOnClickListener{

            Toast.makeText(activity,"Lütfen 1. ve 2. tercihini yap",Toast.LENGTH_LONG).show()
        }




return tasarim
}
}


