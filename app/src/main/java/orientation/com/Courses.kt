package orientation.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Courses : AppCompatActivity() {
    lateinit var courses:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        courses=findViewById(R.id.rvCourses)
        var allCourses= listOf(Course("Navigating Your journey","Learn how to be confident and independent","Veronica Thamanini","NYJ"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD"),
            Course("Professional Development","Learn how to act professionally and write a CV","Rodgers Owoko","PD")
        )
        var coursesAdapter=CoursesRecyclerViewAdapter(allCourses)
        courses.layoutManager=LinearLayoutManager(this)
        courses.adapter=coursesAdapter

    }
}