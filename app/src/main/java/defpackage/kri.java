package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kri extends dia {
    public final /* synthetic */ krj b;

    public kri(krj krjVar) {
        this.b = krjVar;
    }

    @Override // defpackage.dia
    public final int a() {
        return this.b.C.size();
    }

    @Override // defpackage.dia
    public final void d(Object obj) {
        this.b.q.removeView((View) obj);
    }
}
