package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogn {
    public volatile Object a;
    public volatile ogl b;
    private final Executor c;

    public ogn(Looper looper, Object obj, String str) {
        this.c = new oou(looper, 1);
        this.a = obj;
        ojl.aw(str);
        this.b = new ogl(obj, str);
    }

    public final void a() {
        this.a = null;
        this.b = null;
    }

    public final void b(ogm ogmVar) {
        this.c.execute(new nzq(this, ogmVar, 8));
    }
}
