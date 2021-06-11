package com.application.uifstechnologiesschoolportal.activity

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.app.ActivityCompat
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.application.uifstechnologiesschoolportal.R
import com.application.uifstechnologiesschoolportal.fragment.*
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout : DrawerLayout
    lateinit var coordinatorLayout: CoordinatorLayout
    lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigationView: NavigationView
    lateinit var sharedPreferences: SharedPreferences

    var previousMenuItem: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frame)
        navigationView = findViewById(R.id.navigationView)

        //sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name), Context.MODE_PRIVATE)
        setUpToolbar()

        openHome()

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )


        drawerLayout.addDrawerListener(actionBarDrawerToggle)   //making work hamburger icon
        actionBarDrawerToggle.syncState()


        navigationView.setNavigationItemSelectedListener {
            // it will give currently selected item

            if (previousMenuItem!=null){
                previousMenuItem?.isChecked = false
            }

            it.isCheckable = true
            it.isChecked = true
            previousMenuItem = it

            when(it.itemId){
                R.id.dashboard -> {
                    openHome()
                    drawerLayout.closeDrawers()
                }
                R.id.reading -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            ReadingFragment()
                        )                                                                                                       // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Reading"                                                    //giving the title
                    drawerLayout.closeDrawers()
                }
                R.id.exam -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            ExamFragment()
                        )                                                                                                       // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Examination"                                                    //giving the title
                    drawerLayout.closeDrawers()
                }
                R.id.homework -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            HomeworkFragment()
                        )                                                                                                       // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Home Work"                                                    //giving the title
                    drawerLayout.closeDrawers()
                }
                R.id.timeTable -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.frame,
                            TimeTableFragment()
                        )                                                                                                       // dashboard fragment is replacing the blank frame
                        .commit()

                    supportActionBar?.title = "Time Table"                                                    //giving the title
                    drawerLayout.closeDrawers()
                }


            }

            return@setNavigationItemSelectedListener true
        }

    }
    fun setUpToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Toolbar title"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // for the clicking on hamburger and opening of drawer from the left side
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if(id==android.R.id.home)
        {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }

    fun openHome(){
        val fragment = DashboardFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame, fragment)   // dashboard fragment is replacing the blank frame
        transaction.commit()
        supportActionBar?.title = "Dashboard"    //giving the title to each fragment
        navigationView.setCheckedItem(R.id.dashboard)
    }

    fun openExam(){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(
            R.id.frame,
            ExamFragment()
        )
        transaction.commit()
        previousMenuItem?.isChecked = false

        navigationView.setCheckedItem(R.id.exam)

    }

    override fun onBackPressed() {
        val frag = supportFragmentManager.findFragmentById(R.id.frame)
        when(frag){    // if at any frame ie other than dashboard this will bring back to dasboard on pressing back key

            is DashboardFragment ->
                ActivityCompat.finishAffinity(this@MainActivity)
            // finish()
            is ExamReportFragment -> openExam()
            is ExamTestFragment -> openExam()
            is ExamNotificationFragment -> openExam()
            is DownloadAdmitCardFragment -> openExam()

            is HomeworkFragment -> openHome()
            is ReadingFragment -> openHome()
            is TimeTableFragment -> openHome()
            is ExamFragment -> openHome()

            else -> super.onBackPressed()     // Exit the app (default)
        }
    }
}