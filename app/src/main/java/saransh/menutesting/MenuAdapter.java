package saransh.menutesting;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Saransh Verma on 22-05-2017.
 */

public class MenuAdapter extends ArrayAdapter {

    private static final String TAG = "MenuAdapter";
    private final int layoutResource;
    private final LayoutInflater layoutInflater;
    private List<menuItem> items;

    public MenuAdapter(Context context, int resource, List<menuItem> applications) {
        super(context, resource);
        this.layoutResource = resource;
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(layoutResource, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        menuItem currentItem = items.get(position);
        viewHolder.name.setText(currentItem.getName());
        viewHolder.price.setText(currentItem.getPrice());

        return convertView;

    }


    private class ViewHolder {
        private TextView name;
        private TextView price;

        ViewHolder(View v) {
            this.name = (TextView) v.findViewById(R.id.name);
            this.price = (TextView) v.findViewById(R.id.price);


        }

    }
}