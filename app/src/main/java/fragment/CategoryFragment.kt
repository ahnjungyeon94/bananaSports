package fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.bananasports.R
import com.example.bananasports.databinding.FragmentCategoryBinding
import data.MainDataAdapter
import data.MainDataClass
//import com.example.bananasports.activity.HelloActivity
//import com.example.bananasports.activity.ProfileAdapter
//import com.example.bananasports.databinding.ActivityHelloBinding
//import com.example.bananasports.databinding.FragmentCategory3Binding
//import data_class.REGCategoryData
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_main.*

open class CategoryFragment : Fragment() {

    lateinit var bind:FragmentCategoryBinding
    lateinit var navController: NavController

    lateinit var MainDataAdapter: MainDataAdapter
    // private lateinit var binding: ActivityHelloBinding
    val datas = mutableListOf<MainDataClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

// var binding = DataBindingUtil.setContentView(this,R.layout.fragment_intro)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        bind = DataBindingUtil.inflate(inflater , R.layout.fragment_category , container , false)

        MainDataAdapter = MainDataAdapter(requireContext())
        bind.rvProfile.adapter = MainDataAdapter

        datas.apply {
            add(MainDataClass(name = "축구", age = 24))

            MainDataAdapter.datas = datas
            MainDataAdapter.notifyDataSetChanged()

        }

        val view = bind.root
        return view
// return inflater.inflate(R.layout.fragment_category3, container, false)
    }

// override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
// super.onViewCreated(view, savedInstanceState)
//
// val binding = FragmentCategory3Binding.inflate(layoutInflater)
//
// profileAdapter = ProfileAdapter(requireContext())
// binding.rvProfile.adapter = profileAdapter
//
// datas.apply {
// add(REGCategoryData(name = "축구", age = 24))
//
// profileAdapter.datas = datas
// profileAdapter.notifyDataSetChanged()
//
// }

// val reports = data_class()
//
// val ReportRecyclerAdapter = ReportRecyclerAdapter

// profileAdapter = profileAdapter(this)
// bind.rvProfile.adapter = profileAdapter
// datas.apply {
// add(REGCategoryData(name = "축구", age = 24))
//
// profileAdapter.datas = datas
// profileAdapter.notifyDataSetChanged()
//
// }

// var sData = resources.getStringArray(R.array.sports)
// var adapter = ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_dropdown_item,sData)
// spi_sports.adapter = adapter

// navController = Navigation.findNavController(view)
// initRecycler()

// var adapter = profileAdapter
// rv_profile.adapter = adapter
//// spi_sports.adapter = adapter
//
// datas.apply {
// add(REGCategoryData(name = "축구", age = 24))
//
// profileAdapter.datas = datas
// profileAdapter.notifyDataSetChanged()
//
// }

// }

// private fun initRecycler() {
//// profileAdapter = ProfileAdapter(this)
// rv_profile.adapter = profileAdapter
//
//
// datas.apply {
// add(REGCategoryData(name = "축구", age = 24))
//
// profileAdapter.datas = datas
// profileAdapter.notifyDataSetChanged()
//
// }
// }

    //어댑터 클래스
    class ReportRecyclerAdapter(val reportData: MutableList<MainDataClass>) : RecyclerView.Adapter<ReportRecyclerAdapter.Holder>() {

        //커스텀 리스너
        interface OnItemClickListner{
            fun onItemClick(view: View, position: Int)
        }
        //객체 저장 변수
        private lateinit var itemClickListner: OnItemClickListner

        //객체 전달 메서드
        fun setOnItemclickListner(onItemClickListner: OnItemClickListner){
            itemClickListner = onItemClickListner
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int ): Holder {
            val binding = FragmentCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
            return Holder(binding)
        }
        override fun onBindViewHolder(holder: Holder, position: Int) {
            val report = reportData.get(position)
// holder.setReport(report)
        }
        override fun getItemCount() = reportData.size

        inner class Holder(val binding: FragmentCategoryBinding): RecyclerView.ViewHolder(binding.root) {
            init {
                binding.rvProfile.setOnClickListener {

                    val pos = adapterPosition
                    if(pos != RecyclerView.NO_POSITION && itemClickListner != null){
                        itemClickListner.onItemClick(binding.rvProfile,pos)
                    }
                }
            }
// fun setReport(report: Reports){
// }
        }
    }

}