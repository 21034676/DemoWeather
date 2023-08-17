package sg.edu.rp.c346.id21034676.demoweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class WeatherAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Weather> weatherList;

    public WeatherAdapter(Context context, ArrayList<Weather> weatherList) {
        this.context = context;
        this.weatherList = weatherList;
    }

    @Override
    public int getCount() {
        return weatherList.size();
    }

    @Override
    public Object getItem(int position) {
        return weatherList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_layout, parent, false);
        }

        Weather weather = weatherList.get(position);

        TextView areaTextView = convertView.findViewById(R.id.areaTextView);
        TextView forecastTextView = convertView.findViewById(R.id.forecastTextView);

        areaTextView.setText(weather.getArea());
        forecastTextView.setText(weather.getForecast());

        return convertView;
    }
}
