package com.example.movilesp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



/**
 * A simple [Fragment] subclass.
 * Use the [DetallesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetallesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalles, container, false)
    }

    //inicializar metodos en el onViewCreated
    //view.findByViewId()
}