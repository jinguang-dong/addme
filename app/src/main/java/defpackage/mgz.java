package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgz {
    public final Context a;
    public final mni b;
    public final owq c;
    public final boolean d;
    private final pnq g;
    private final boolean h;
    private View i = null;
    public View e = null;
    public nkw f = null;

    public mgz(Context context, hbj hbjVar, mni mniVar, pnq pnqVar, owq owqVar) {
        this.a = context;
        this.d = hbjVar.o(hal.a);
        this.h = hbjVar.p(gzy.q);
        this.b = mniVar;
        this.g = pnqVar;
        this.c = owqVar;
    }

    public final void a() {
        if (this.i == null || this.c.dL() != this.f) {
            Context context = this.a;
            FrameLayout frameLayout = new FrameLayout(context);
            View viewInflate = View.inflate(context, R.layout.macro_focus_bottomsheet, frameLayout);
            if (!this.h) {
                viewInflate.findViewById(R.id.tap_on_icon_space).setVisibility(0);
                viewInflate.findViewById(R.id.tap_on_icon_line).setVisibility(0);
            }
            ((TextView) viewInflate.findViewById(R.id.focus_distance_text_line)).setText(context.getString(R.string.taxi_bottom_sheet_focus_distance, Integer.valueOf(true != this.g.w ? 3 : 2)));
            this.i = frameLayout;
            this.f = (nkw) this.c.dL();
        }
        this.b.m(16, R.string.macro_focus_name, this.i);
    }
}
