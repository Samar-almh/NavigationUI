package com.samar.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_1.view.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Fragment1 : Fragment() {

    private var param1: Int? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v = inflater.inflate(R.layout.fragment_1, container, false)
        if (param1 == R.id.home)
        {
            v.text.text= "home"
            v.fragment_1.setBackgroundResource(R.color.blue)
        }
        else if(param1 == R.id.food){
            v.text.text= "food"
            v.fragment_1.setBackgroundResource(R.color.green)
        }
        else if (param1 == R.id.travel){
            v.text.text= "travel"
            v.fragment_1.setBackgroundResource(R.color.pink)
        }
        else
        {v.text.text= "home"}
        return v
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: Int, param2: String) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}