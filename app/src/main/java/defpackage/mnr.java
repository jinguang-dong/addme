package defpackage;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnr extends lg {
    public static final /* synthetic */ int z = 0;
    public final TextView s;
    public final TextView t;
    public final View[] u;
    public final View v;
    public final LinearLayout w;
    public final HorizontalScrollView x;
    public mnn y;

    public mnr(View view, View[] viewArr) {
        super(view);
        this.s = (TextView) this.a.findViewById(R.id.title);
        this.t = (TextView) this.a.findViewById(R.id.subtitle);
        this.u = viewArr;
        this.v = this.a.findViewById(R.id.beta_label);
        this.w = (LinearLayout) this.a.findViewById(R.id.example_images_view);
        this.x = (HorizontalScrollView) this.a.findViewById(R.id.example_images_scroll_view);
    }
}
