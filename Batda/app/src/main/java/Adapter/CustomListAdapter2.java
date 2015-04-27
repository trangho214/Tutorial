package Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import Sample.SampleObject1;
import softs.hnt.com.batda.R;

/**
 * Created by TrangHo on 27-04-2015.
 */
public class CustomListAdapter2 extends CustomListAdapter {
    public CustomListAdapter2(Activity activity, List<SampleObject1> data, int vp_number) {
        super(activity, data, vp_number);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null)
        {
            LayoutInflater inflater = activity.getLayoutInflater();
            convertView = inflater.inflate(R.layout.rowview1,parent,false);
            ViewHolder vh = new ViewHolder();
            vh.iv = (ImageView)convertView.findViewById(R.id.iv_RowView1);

            ((TextView) convertView.findViewById(R.id.txtPrice_RowView1)).setVisibility(View.GONE);
            ((TextView) convertView.findViewById(R.id.txtDateTIme_RowView1)).setVisibility(View.GONE);
            vh.txt_price.setVisibility(View.GONE);
            vh.txt_time.setVisibility(View.GONE);

            convertView.setTag(vh);
        }
        SampleObject1 objectItem = data.get(position);
        ViewHolder viewHolder = (ViewHolder)convertView.getTag();
        viewHolder.txt_title.setText(objectItem.title);
        viewHolder.iv.setImageResource(objectItem.imageId);

        return convertView;
    }
}
