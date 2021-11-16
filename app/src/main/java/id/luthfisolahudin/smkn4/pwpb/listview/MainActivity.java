package id.luthfisolahudin.smkn4.pwpb.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import id.luthfisolahudin.smkn4.pwpb.listview.adapter.ListAdapter;
import id.luthfisolahudin.smkn4.pwpb.listview.model.Hero;

public class MainActivity extends AppCompatActivity {
    private List<Hero> heroes;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroes = new ArrayList<>();
        listView = findViewById(R.id.list_item);

        // Add heroes
        heroes.add(new Hero(R.drawable.spiderman, "Spiderman", "Avengers"));
        heroes.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroes.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroes.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroes.add(new Hero(R.drawable.batman, "Batman", "Justice League"));

        ListAdapter adapter = new ListAdapter(this, R.layout.item, heroes);

        listView.setAdapter(adapter);
    }
}