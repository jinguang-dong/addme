package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jky extends lg {
    public final View s;
    public final ImageView t;
    public final TextView u;
    public our v;

    public jky(View view) {
        super(view);
        this.s = view;
        this.t = (ImageView) view.findViewById(R.id.panel_item_image);
        this.u = (TextView) view.findViewById(R.id.panel_item_name);
    }

    final void B() {
        our ourVar = this.v;
        if (ourVar != null) {
            ourVar.close();
            this.v = null;
        }
    }

    public final void C(boolean z, boolean z2) {
        if (z) {
            this.s.setTag("selected");
            ImageView imageView = this.t;
            View view = this.a;
            imageView.setBackgroundTintList(ColorStateList.valueOf(ojl.aO(view)));
            imageView.setColorFilter(ojl.aJ(view));
            return;
        }
        if (z2) {
            this.s.setTag("default large screen");
            this.t.setBackgroundTintList(ColorStateList.valueOf(ojl.aR(this.a)));
        } else {
            this.s.setTag("default");
            this.t.setBackgroundTintList(ColorStateList.valueOf(ojl.aQ(this.a)));
        }
        this.t.setColorFilter(ojl.aL(this.a));
    }
}
