package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dlu implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ dlu(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.c != 0) {
            return new dln(AmbientMode.AmbientCallback.d(this.a, ((Integer) obj).intValue(), this.b));
        }
        return new dln(AmbientMode.AmbientCallback.e(this.a, ((Integer) obj).intValue(), this.b));
    }
}
