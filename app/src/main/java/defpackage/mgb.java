package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgb extends RecyclerView {
    public mgb(Context context, hbj hbjVar) {
        super(context);
        setFocusable(false);
        setOverScrollMode(2);
        av();
        setPaddingRelative(getResources().getDimensionPixelSize(R.dimen.settings_changed_view_padding_start), 0, 0, 0);
        getContext();
        ad(new LinearLayoutManager());
        aB(new mfy(getResources()));
        ab(new mga(getResources(), hbjVar));
    }
}
