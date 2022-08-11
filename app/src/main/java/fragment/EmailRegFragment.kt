package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bananasports.R
import kotlinx.android.synthetic.main.fragment_email_reg.*

class EmailRegFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_email_reg, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

// btn_category_open.setOnClickListener {
//// val bottomSheet = CategoryBottomSheet()
//// bottomSheet.show(supportFragmentManager,bottomSheet.tag)
// navController.navigate(R.id.action_EmailRegFragment_to_CategoryFragment3)
// }
    }
}