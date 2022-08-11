package fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.bananasports.R
import kotlinx.android.synthetic.main.fragment_intro.*
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)

// btn_signup.setOnClickListener {
//// layout_login.visibility = View.GONE //로그인 레이아웃 숨김처리
// layout_register.visibility = View.VISIBLE //회원가입 레이아웃 보임처리
// }

        btn_back_login.setOnClickListener {
        // layout_register.visibility = View.GONE //로그인 레이아웃 보임처리
            layout_login.visibility = View.VISIBLE //회원가입 레이아웃 숨김처리
        }

        btn_signup.setOnClickListener {
            navController.navigate(R.id.action_LoginFragment_to_EmailRegFragment)
        }
    }
}