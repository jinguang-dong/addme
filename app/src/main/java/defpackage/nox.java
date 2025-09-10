package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nox {
    public final nov a;
    public final nod b;
    public final noq c;
    public final View d;
    public final int e;
    public VideoView f;
    public ImageButton g;
    public ImageButton h;
    public TextView i;
    public TextView j;
    public SeekBar k;
    public View l;
    public boolean m;
    public boolean n;
    public View o;
    private final boolean p;

    public nox(nov novVar, nod nodVar, noq noqVar, View view, boolean z) {
        this.a = novVar;
        this.b = nodVar;
        this.c = noqVar;
        this.d = view;
        this.p = z;
        this.e = view.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    public final void a(int i) {
        this.i.setText(jsv.C(i));
        this.k.setMax(i);
    }

    public final void b(int i) {
        this.j.setText(jsv.C(i));
        this.k.setProgress(i);
    }

    public final void c() {
        this.n = true;
        if (!this.p) {
            this.l.animate().alpha(1.0f).setDuration(this.e).withStartAction(new nhp(this, 16)).start();
        }
        if (this.m) {
            this.h.setVisibility(8);
            this.g.animate().alpha(1.0f).setDuration(this.e).withStartAction(new nhp(this, 17)).start();
        } else {
            this.g.setVisibility(8);
            this.h.animate().alpha(1.0f).setDuration(this.e).withStartAction(new nhp(this, 18)).start();
        }
    }
}
