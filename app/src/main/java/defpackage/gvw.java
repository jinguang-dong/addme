package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gvw implements uif {
    public final /* synthetic */ View a;
    public final /* synthetic */ uiq b;
    public final /* synthetic */ int c;
    private final /* synthetic */ int d;

    public /* synthetic */ gvw(View view, uiq uiqVar, int i, int i2) {
        this.d = i2;
        this.a = view;
        this.b = uiqVar;
        this.c = i;
    }

    @Override // defpackage.uif
    public final Object a() {
        if (this.d != 0) {
            this.a.performHapticFeedback(6);
            this.b.a(Integer.valueOf(this.c));
            return ufg.a;
        }
        this.a.performHapticFeedback(6);
        this.b.a(Integer.valueOf(this.c));
        return ufg.a;
    }
}
