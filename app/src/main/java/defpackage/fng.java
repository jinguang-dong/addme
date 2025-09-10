package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fng {
    public final Context a;
    public final LayoutInflater b;
    public final ViewGroup c;
    public final boolean d;
    public final fnc e;
    public PopupWindow f = null;
    private final out g;

    public fng(Context context, ViewGroup viewGroup, out outVar, hbc hbcVar, fnc fncVar) {
        this.a = context;
        this.g = outVar;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        layoutInflater.getClass();
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = hbcVar.b(hbc.DOGFOOD);
        this.e = fncVar;
    }

    public final synchronized void a() {
        this.g.execute(new fnf(this, 0));
    }

    public final synchronized void b() {
        this.g.execute(new foh(this, 1));
    }
}
