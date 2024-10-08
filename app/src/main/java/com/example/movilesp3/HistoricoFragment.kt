package com.example.movilesp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass.
 * Use the [HistoricoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoricoFragment : Fragment() {
    private lateinit var button: Button
    private lateinit var editTextView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val destino = HistoricoFragmentDirections.
            actionHistoricoFragmentToDetallesFragment2("PRUEBA")

        findNavController().navigate(destino)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_historico, container, false)
    }

    override fun onStart() {
        super.onStart()
        button = requireView().findViewById(R.id.btnHistorico)
        editTextView = requireView().findViewById(R.id.editTextViewHistorico)
    }
}