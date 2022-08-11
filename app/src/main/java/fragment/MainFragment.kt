package fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.bananasports.R

import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment

// var sData: Array<String> = resources.getStringArray(R.array.sports)

        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

        var sData = resources.getStringArray(R.array.sports)
        var adapter = ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_dropdown_item,sData)

        spi_sports.adapter = adapter

        btn_info.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_LoginFragment)
        }
    }
}