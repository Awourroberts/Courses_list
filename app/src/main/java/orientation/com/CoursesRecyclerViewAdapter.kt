package orientation.com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CoursesRecyclerViewAdapter(var coursesList: List<Course>):RecyclerView.Adapter<CoursesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.course_list_items,parent,false)
            return CoursesViewHolder(itemView)
        }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
        var currentCourse=coursesList[position]
        holder.name2.text=currentCourse.name
        holder.description.text=currentCourse.describe
        holder.trainor.text=currentCourse.trainer
        holder.codes.text=currentCourse.code
    }

    override fun getItemCount(): Int {
       return coursesList.size
    }
}

class CoursesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var name2=itemView.findViewById<TextView>(R.id.tvName2)
    var description=itemView.findViewById<TextView>(R.id.tvDescribe)
    var trainor=itemView.findViewById<TextView>(R.id.tvTrainer)
    var codes=itemView.findViewById<TextView>(R.id.tvCode)
}