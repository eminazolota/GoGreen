package ba.alem.gogreen;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.util.Log;

import com.skyhope.eventcalenderlibrary.CalenderEvent;
import com.skyhope.eventcalenderlibrary.listener.CalenderDayClickListener;
import com.skyhope.eventcalenderlibrary.model.DayContainerModel;
import com.skyhope.eventcalenderlibrary.model.Event;

import java.util.Calendar;

public class ZeleniKalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeleni_kalendar);

        CalenderEvent calenderEvent = findViewById(R.id.calender_event);
        //GreenEvent event = new GreenEvent(Calendar.getInstance().getTimeInMillis(), "Test");

        GreenEvent event = new GreenEvent(Calendar.getInstance().getTimeInMillis(), "Posumljavanje", Color.GREEN);
        event.setDescription("Akcija posumljavanja na Bjelasnici");
        event.setDate("19.10.2019.");


        calenderEvent.addEvent(event);

        calenderEvent.initCalderItemClickCallback(new CalenderDayClickListener() {
            @Override
            public void onGetDay(DayContainerModel dayContainerModel) {
                GreenEvent event = (GreenEvent) dayContainerModel.getEvent();
                if (event!= null) {
                    Log.e("EVENT", event.getDescription());
                }
            }
        });
    }
}
