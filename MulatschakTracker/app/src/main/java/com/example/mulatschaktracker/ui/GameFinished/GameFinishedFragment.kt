package com.example.mulatschaktracker.ui.statistics
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mulatschaktracker.R
//import com.example.mulatschaktracker.ui.GameFinished.sendMessage


    class GameFinishedFragment : Fragment() {
    //private var data = mapOf<Int, String>()

        private  var passedarg :  String? = null
        companion object {
            private var ARG_NAME=  "name"


            fun newInstance(name: String): GameFinishedFragment {
                val fragment = GameFinishedFragment()
                val args =  Bundle()
                args.putString(ARG_NAME, name)

                fragment.arguments = args
                return fragment
            }
        }

    private lateinit var gameFinishedViewModel: GameFinishedViewModel

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            if(arguments != null)
            {
                passedarg = arguments?.getString(ARG_NAME)
            }
        }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.activity_game_finished, container, false)
        //val textView: TextView = root.findViewById(R.id.Game_Finished)
        if(arguments != null)
        {
            passedarg = arguments?.getString(ARG_NAME)
        }
        println(passedarg)
        return root
    }

   }