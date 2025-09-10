package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmu implements ayy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dmu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ayy
    public final void a() {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            ((dmp) obj).d = null;
        } else {
            ((AmbientDelegate) obj).a = null;
        }
    }
}
