package student.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qf.administrator.sqlite2.R;

import java.util.List;

import models.Student;

/**
 * Created by Administrator on 2016/6/29.
 */
public class StudentAdapter extends BaseAdapter{

    private Context context;
    private List<Student>data;

    public StudentAdapter(Context context, List<Student> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHorld horld;
        if (convertView==null){
            View.inflate(context,R.layout.listview_item, null);
            horld=new ViewHorld();

            horld.tv_stuNo= (TextView) convertView.findViewById(R.id.tv_stuNo);
            horld.tv_stuName= (TextView) convertView.findViewById(R.id.tv_stuName);


        }


        return null;
    }




  }
class ViewHorld{
    TextView tv_stuNo;
    TextView tv_stuName;
    TextView tv_address;
    TextView tv_money;
    TextView tv_age;
}