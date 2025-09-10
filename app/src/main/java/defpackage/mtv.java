package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.TrafficStats;
import android.widget.LinearLayout;
import com.google.android.apps.camera.ui.eduimageview.EduImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mtv {
    public final Context a;
    final /* synthetic */ EduImageView b;
    int c;
    private final String d;
    private final String e;
    private paq f;
    private final oge g;

    public mtv(EduImageView eduImageView, Context context, String str, String str2, oge ogeVar) {
        this.b = eduImageView;
        this.a = context;
        this.d = str;
        this.e = str2;
        this.g = ogeVar;
    }

    public final void a() {
        EduImageView eduImageView = this.b;
        eduImageView.a.setContentDescription(this.e);
        eduImageView.a.setClickable(false);
        oge ogeVar = this.g;
        if (ogeVar != null) {
            int i = mnr.z;
            ((LinearLayout) ogeVar.a).setVisibility(0);
            EduImageView eduImageView2 = (EduImageView) ogeVar.b;
            eduImageView2.a();
            eduImageView2.setBackgroundColor(qpt.au(R.dimen.gm3_sys_elevation_level1, eduImageView2.getContext()));
        }
    }

    public final void b(boolean z) {
        EduImageView eduImageView = this.b;
        eduImageView.a.setOnClickListener(null);
        eduImageView.b.setVisibility(8);
        paq paqVar = this.f;
        if (paqVar != null) {
            paqVar.close();
            this.f = null;
        }
        Context context = eduImageView.getContext();
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                return;
            }
        }
        int iE = jsv.E(context);
        this.c = iE;
        try {
            TrafficStats.setThreadStatsTag(256);
            if (iE == 3 || z) {
                ((epj) eox.c(context).c(this.d).k()).a(new mtu(this, 1)).i(eduImageView.a);
            } else if (iE == 2) {
                ((epj) ((epj) eox.c(context).c(this.d).E()).k()).a(new mtu(this, 0)).i(eduImageView.a);
            } else {
                ((epj) ((epj) ((epj) eox.c(context).c(this.d).G()).E()).k()).a(new mtu(this, 2)).i(eduImageView.a);
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final void c() {
        mtt mttVar = new mtt(this);
        paq paqVar = this.f;
        if (paqVar != null) {
            paqVar.close();
        }
        this.f = jsv.D(this.a, mttVar);
    }
}
