package id.luthfisolahudin.smkn4.pwpb.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import java.util.List;

import id.luthfisolahudin.smkn4.pwpb.listview.R;
import id.luthfisolahudin.smkn4.pwpb.listview.model.Hero;

public class ListAdapter extends ArrayAdapter<Hero> {
    private List<Hero> heroes;
    private Context context;
    private int resource;

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Hero> heroes) {
        super(context, resource, heroes);
        this.heroes = heroes;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageHero = view.findViewById(R.id.hero_image);
        TextView textHeroName = view.findViewById(R.id.hero_name);
        TextView textTeamName = view.findViewById(R.id.team_name);
        Button buttonDelete = view.findViewById(R.id.button_delete);

        Hero hero = heroes.get(position);

        imageHero.setImageDrawable(context.getResources().getDrawable(hero.getIdDrawableImage()));
        textHeroName.setText(hero.getName());
        textTeamName.setText(hero.getTeam());

        buttonDelete.setOnClickListener(view1 -> removeHero(position));

        return view;
    }

    private void removeHero(int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Are you sure you want to delete this?");
        builder.setPositiveButton("Yes", (dialogInterface, i) -> {
            heroes.remove(position);
            notifyDataSetChanged();
        });

        builder.setNegativeButton("No", (dialogInterface, i) -> {
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
