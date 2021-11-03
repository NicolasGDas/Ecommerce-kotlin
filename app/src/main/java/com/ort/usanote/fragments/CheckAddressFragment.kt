package com.ort.usanote.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.ort.usanote.R
import com.ort.usanote.viewModels.CheckAddressViewModel

class CheckAddressFragment : Fragment() {

    lateinit var btnContinue : Button
    lateinit var v: View

    companion object {
        fun newInstance() = CheckAddressFragment()
    }

    private lateinit var viewModel: CheckAddressViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.check_address_fragment, container, false)
        btnContinue = v.findViewById(R.id.buttonContinue)

        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CheckAddressViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart() {
        super.onStart()

        var productItems = CheckAddressFragmentArgs.fromBundle(requireArguments()).productItems

        btnContinue.setOnClickListener {
            val action = CheckAddressFragmentDirections.actionCheckAddressFragmentToPaymentMethodFragment(productItems)
            v.findNavController().navigate(action)
        }
    }

}