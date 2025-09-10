package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfk extends Preference {
    public SearchView a;
    public SearchView.OnQueryTextListener b;
    public CharSequence c;

    public hfk(Context context) {
        super(context);
        this.c = "";
    }

    @Override // android.preference.Preference
    protected final View onCreateView(ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        View viewInflate = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.search_view_preference, viewGroup, false);
        SearchView searchView = (SearchView) viewInflate.findViewById(R.id.search_view);
        this.a = searchView;
        searchView.setSubmitButtonEnabled(true);
        this.a.setOnQueryTextListener(new hfj(this, 0));
        this.a.setQuery(this.c, true);
        return viewInflate;
    }
}
