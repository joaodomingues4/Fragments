package pt.ipt.dama.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    // cretae the objects of type 'fragment' to use
    lateinit var f1:MyFragment
    lateinit var f2:MyFragment
    lateinit var f3:MyFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize the fragments
        f1=MyFragment.newInstance("fragment", "one")
        f2=MyFragment.newInstance("Fragment", "Two")
        f3=MyFragment.newInstance("FRAGMENT", "THREE")

        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment1, f1)
        fragmentTransaction.add(R.id.fragment1, f2)
        fragmentTransaction.add(R.id.fragment1, f3)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()


    }
}