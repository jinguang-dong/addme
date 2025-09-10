package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnx implements nnv {
    public final Object a;
    private final /* synthetic */ int b;

    public nnx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nnv
    public final View a(int i) {
        return this.b != 0 ? ((Activity) this.a).findViewById(i) : ((View) this.a).findViewById(i);
    }
}
