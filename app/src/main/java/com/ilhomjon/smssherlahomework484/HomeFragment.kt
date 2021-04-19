package com.ilhomjon.smssherlahomework484

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_home, container, false)

        root.card_sevgi.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 0)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_soginch.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 1)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_tabrik.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 2)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_ota_ona.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 3)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_dostlik.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 4)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_hazil.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 5)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_1.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 6)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }
        root.card_2.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("key0", 7)
            root.findNavController().navigate(R.id.listFragment, bundle)
        }

        return root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}