package defpackage;

import android.hardware.Sensor;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kpl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kpl(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.b.accept(Integer.valueOf(this.a));
            return;
        }
        if (i == 1) {
            this.b.accept(Integer.valueOf(this.a));
            return;
        }
        if (i == 2) {
            int i2 = this.a;
            lrh lrhVar = (lrh) this.b;
            Sensor sensor = lrhVar.c;
            lrhVar.a.registerListener(lrhVar.d, sensor, i2);
            return;
        }
        if (i != 3) {
            ((qui) this.b).a(this.a + 1);
        } else {
            ((ModeSwitcher) this.b).scrollTo(this.a, 0);
        }
    }
}
