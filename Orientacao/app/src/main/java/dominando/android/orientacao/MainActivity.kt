package dominando.android.orientacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ArrayAdapter
import dominando.android.orientacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var names = arrayListOf<String>()
    var adapter : ArrayAdapter<String>? = null
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(savedInstanceState != null) {
            names = savedInstanceState.getStringArrayList("names_list") as ArrayList<String>
        }

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        binding.lstNames.adapter = adapter

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState?.putStringArrayList("names_list", names)
    }

    fun btnAddClick(view : View) {
        names.add(binding.edtName.text.toString())
        binding.edtName.text.clear()
        adapter?.notifyDataSetChanged()
    }

}